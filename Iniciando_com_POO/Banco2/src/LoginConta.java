import java.util.*;

public class LoginConta {
    // Inicia o processo de login da conta
    public static void loginConta(Scanner sc, Map<Integer, Conta> listaDeContas) {
        if (listaDeContas.size() == 0) {
            System.out.println("\n+----------------------------------------------+");
            System.out.println("| Nenhuma conta cadastrada no sistema.         |");
            System.out.println("| Por favor, crie uma conta primeiro.          |");
            System.out.println("+----------------------------------------------+");
            return;
        }

        System.out.println();
        System.out.println("+----------------------------------------------+");
        System.out.println("|                LOGIN NA CONTA                |");
        System.out.println("+----------------------------------------------+");

        try {
            System.out.print("Número da conta: ");
            int num = sc.nextInt();
            sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            validarConta(sc, listaDeContas, num, senha);

        } catch (Exception e) {
            // Captura entradas inválidas do usuário
            System.out.println("\n+----------------------------------------------+");
            System.out.println("| Entrada inválida. Tente novamente.           |");
            System.out.println("+----------------------------------------------+");
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

                String nome = conta.getNome();

                System.out.println();
                System.out.println("+----------------------------------------------+");
                System.out.printf("| Bem-vindo(a), %-33s|\n", nome);
                System.out.println("+----------------------------------------------+");

                menuPrincipal(sc, entry, listaDeContas);
                return;
            }
        }

        if (!contaEncontrada) {
            System.out.println("\n+----------------------------------------------+");
            System.out.println("| Número de conta ou senha incorreta.          |");
            System.out.println("+----------------------------------------------+");
        }
    }

    // Menu principal de operações da conta
    private static void menuPrincipal(Scanner sc, Map.Entry<Integer, Conta> entry, Map<Integer, Conta> listaDeContas) {
        try {
            while (true) {
                System.out.println();
                System.out.println("+----------------------------------------------+");
                System.out.println("| O que deseja fazer?                          |");
                System.out.println("| 1 - Depositar   2 - Sacar   3 - Transferir   |");
                System.out.println("| 4 - Extrato     0 - Sair                     |");
                System.out.println("+----------------------------------------------+");
                System.out.print("Escolha uma opção: ");
                String opcao = sc.nextLine().toLowerCase();

                switch (opcao) {
                    case "1", "depositar" -> entry.getValue().depositar(sc);
                    case "2", "sacar" -> entry.getValue().sacar(sc);
                    case "3", "transferência", "transferencia" -> entry.getValue().transferir(sc, listaDeContas);
                    case "4", "extrato" -> {
                        // Exibe saldo e última atualização
                        System.out.println("\nSaldo atual: " + entry.getValue().getSaldo());
                        System.out.println("Última atualização: " + entry.getValue().getUltimaAtualizacao());
                    }
                    case "0", "sair" -> {
                        // Encerra a sessão do usuário
                        System.out.println("Sessão finalizada. Até mais!");
                        return;
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
        } catch (Exception e) {
            // Captura exceções durante operações do menu
            System.out.println("Erro ao processar a operação: (" + e.getMessage() + ")");
            sc.nextLine();
        }
    }
}