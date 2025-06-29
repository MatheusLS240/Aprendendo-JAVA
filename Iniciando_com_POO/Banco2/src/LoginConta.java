import java.util.*;

public class LoginConta {
    // Inicia o processo de login da conta
    public static void loginConta(Scanner sc, Map<Integer, Conta> listaDeContas) {
        try {
            System.out.print("Insira o número da conta: ");
            int num = sc.nextInt();
            sc.nextLine();

            System.out.print("Insira a sua senha: ");
            String senha = sc.nextLine();

            validarConta(sc, listaDeContas, num, senha);

        } catch (Exception e) {
            // Captura entradas inválidas do usuário
            System.out.println("Entrada inválida. Tente novamente. (" + e.getMessage() + ")");
            sc.nextLine();
        }
    }

    // Valida número da conta e senha
    private static void validarConta(Scanner sc, Map<Integer, Conta> listaDeContas, int num, String senha) {
        boolean contaEncontrada = false;

        for (Map.Entry<Integer, Conta> entry : listaDeContas.entrySet()) {
            Conta conta = entry.getValue();
            if (entry.getKey().equals(num) && conta.getSenha().equals(senha)) {
                contaEncontrada = true;

                // Saudação personalizada conforme gênero
                String genero = conta.getGenero();
                String nome = conta.getNome();

                if (genero.equalsIgnoreCase("masculino")) {
                    System.out.printf("Bem-vindo à conta, %s.\n", nome);
                } else {
                    System.out.printf("Bem-vinda à conta, %s.\n", nome);
                }

                menuPrincipal(sc, entry, listaDeContas);
                return;
            }
        }

        if (!contaEncontrada) {
            System.out.println("\nNúmero de conta ou senha incorreta.");
        }
    }

    // Menu principal de operações da conta
    private static void menuPrincipal(Scanner sc, Map.Entry<Integer, Conta> entry, Map<Integer, Conta> listaDeContas) {
        try {
            while (true) {
                System.out.println("\n\nO que vamos fazer hoje?");
                System.out.println("Depositar - Sacar - Transferência - Sair");
                String opcao = sc.nextLine().toLowerCase();

                switch (opcao) {
                    case "depositar" -> entry.getValue().depositar(sc);
                    case "sacar" -> entry.getValue().sacar(sc);
                    case "transferência", "transferencia" -> entry.getValue().transferir(sc, listaDeContas);
                    case "extrato" -> {
                        // Exibe saldo e última atualização
                        System.out.println("Saldo atual: " + entry.getValue().getSaldo());
                        System.out.println("Última atualização: " + entry.getValue().getUltimaAtualizacao());
                    }
                    case "sair" -> {
                        // Encerra a sessão do usuário
                        System.out.println("Sessão finalizada. Até mais!");
                        break;
                    }
                    default -> System.out.println("Opção inválida.");
                }

                // Sai do loop se o usuário escolher sair
                if (opcao.equals("sair")) break;
            }
        } catch (Exception e) {
            // Captura exceções durante operações do menu
            System.out.println("Erro ao processar a operação: (" + e.getMessage() + ")");
            sc.nextLine();
        }
    }
}