import java.util.*;

public class CriacaoConta {
    // -- Criar Conta --
    public static void criarConta(Scanner sc, Map<Integer, Conta> listaDeContas) {
        Conta conta = null;
        try {
            System.out.print("\nInsira seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Insira seu CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Insira seu email: ");
            String email = sc.nextLine();
            System.out.print("Insira seu telefone: ");
            long telefone = Long.parseLong(sc.nextLine());
            System.out.print("Insira uma senha: ");
            String senha = sc.nextLine();

            System.out.print("Qual tipo de conta deseja criar? (corrente/poupanca): ");
            String opcaoConta = sc.nextLine();

            TipoContas tipo = TipoContas.converterContas(opcaoConta);

            if (tipo == null) {
                System.out.println("Tipo de conta inválido!");
            } else {
                System.out.println("\nConfirme os dados:");
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Email: " + email);
                System.out.println("Telefone: " + telefone);
                System.out.println("Senha: " + senha);

                System.out.print("Você confirma as informações? (sim/não): ");
                String confirmacao = sc.nextLine().toLowerCase();

                if (confirmacao.equals("sim")) {
                    conta = criarContaPorTipo(tipo, nome, cpf, email, telefone, senha);
                    listaDeContas.put(conta.getNumConta(), conta);

                    System.out.printf("\nConta %s criada com sucesso!", tipo);
                    infoContas(nome, cpf, email, telefone, senha, conta.getNumConta());
                } else {
                    System.out.print("\nQual parte deseja alterar? (nome / cpf / email / telefone / senha / todos): ");
                    String campoEditar = sc.nextLine();
                    CampoUsuario campo = CampoUsuario.converterCampo(campoEditar);

                    if (campo != null) {
                        switch (campo) {
                            case NOME -> {
                                System.out.print("Insira novo nome: ");
                                nome = sc.nextLine();
                            }
                            case CPF -> {
                                System.out.print("Insira novo CPF: ");
                                cpf = sc.nextLine();
                            }
                            case EMAIL -> {
                                System.out.print("Insira novo email: ");
                                email = sc.nextLine();
                            }
                            case SENHA -> {
                                System.out.print("Insira nova senha: ");
                                senha = sc.nextLine();
                            }
                            case TELEFONE -> {
                                System.out.print("Insira novo telefone: ");
                                telefone = Long.parseLong(sc.nextLine());
                            }
                            case TODOS -> {
                                System.out.print("Insira novo nome: ");
                                nome = sc.nextLine();
                                System.out.print("Insira novo CPF: ");
                                cpf = sc.nextLine();
                                System.out.print("Insira novo email: ");
                                email = sc.nextLine();
                                System.out.print("Insira novo telefone: ");
                                telefone = Long.parseLong(sc.nextLine());
                                System.out.print("Insira nova senha: ");
                                senha = sc.nextLine();
                            }
                            default -> System.out.println("Campo não suportado para edição.");
                        }

                        conta = criarContaPorTipo(tipo, nome, cpf, email, telefone, senha);
                        listaDeContas.put(conta.getNumConta(), conta);

                        System.out.printf("\nConta %s criada com sucesso!\n", tipo);
                        infoContas(nome, cpf, email, telefone, senha, conta.getNumConta());
                    } else {
                        System.out.println("Problema na criação da conta, tente novamente!");
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Impossivel criar a conta! Tente novamente mais tarde (" + e.getMessage() + ")");
        }
    }

    // -- Criando a instancia com base no tipo selecionado --
    private static Conta criarContaPorTipo(
            TipoContas tipo,
            String nome,
            String cpf,
            String email,
            long telefone,
            String senha
    ) {
        return switch (tipo) {
            case CORRENTE -> new ContaCorrente(nome, cpf, email, telefone, senha);
            case POUPANCA -> new ContaPoupanca(nome, cpf, email, telefone, senha);
        };
    }

    // -- Mostrar Informações após a criação da conta --
    private static void infoContas(String nome, String cpf, String email, long telefone, String senha, int conta) {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
        System.out.println("Numero da Conta: " + conta);
    }
}
