import java.util.*;

public class CriacaoConta {
    public static void criarConta(Scanner sc, Map<Integer, Conta> listaDeContas) {
        Conta conta = null;
        mensagemMenu();
        try {
            // Coleta de dados do usuário
            System.out.println("\n📝 Preencha os dados para criar sua conta:");
            System.out.println();
            System.out.println("+----------------------------------------------+");
            System.out.println("|           CRIAÇÃO DE NOVA CONTA              |");
            System.out.println("+----------------------------------------------+");
            System.out.print("Nome: ");
            String nome = CampoUsuario.toCapitalize(sc);
            System.out.print("Gênero (Masculino/Feminino): ");
            String genero = CampoUsuario.verificarGenero(sc);
            System.out.print("CPF: ");
            String cpf = CampoUsuario.verificarCampo(sc);
            System.out.print("Email: ");
            String email = CampoUsuario.verificarCampo(sc);
            System.out.print("Telefone: ");
            String telefoneStr = CampoUsuario.verificarCampo(sc);
            long telefone = Long.parseLong(telefoneStr);
            System.out.print("Senha: ");
            String senha = CampoUsuario.verificarCampo(sc);
            System.out.print("Tipo de conta (Corrente/Poupanca): ");
            String opcaoConta = CampoUsuario.verificarCampo(sc);

            TipoContas tipo = TipoContas.converterContas(opcaoConta);

            if (tipo == null) {
                System.out.println("Tipo de conta inválido!");
            } else {
                mostrarInformacoesCadastradas(nome, genero, cpf, email, telefone, senha);
                System.out.print("Você confirma as informações? (sim/não): ");
                String confirmacao = CampoUsuario.verificarCampo(sc).toLowerCase();

                if (confirmacao.equals("sim")) {
                    // Criação e cadastro da conta
                    conta = criarContaPorTipo(tipo, nome, genero, cpf, email, telefone, senha);
                    listaDeContas.put(conta.getNumConta(), conta);

                    System.out.println("+----------------------------------------------+");
                    System.out.println("| Conta criada com sucesso!                    |");
                    System.out.println("+----------------------------------------------+");
                    infoContas(nome, genero, cpf, email, telefone, senha, conta.getNumConta());
                } else {
                    // Permite edição dos dados antes de criar a conta
                    System.out.print("\n✏️  Qual parte deseja alterar? (nome / cpf / email / telefone / senha / todos): ");
                    String campoEditar = CampoUsuario.verificarCampo(sc);
                    CampoUsuario campo = CampoUsuario.converterCampo(campoEditar);

                    if (campo != null) {
                        do {
                            switch (campo) {
                                case NOME -> {
                                    System.out.print("Insira novo nome: ");
                                    nome = CampoUsuario.toCapitalize(sc);
                                }
                                case GENERO -> {
                                    System.out.print("Insira o novo gênero: (Masculino ou Feminino) ");
                                    genero = CampoUsuario.verificarGenero(sc);
                                }
                                case CPF -> {
                                    System.out.print("Insira novo CPF: ");
                                    cpf = CampoUsuario.verificarCampo(sc);
                                }
                                case EMAIL -> {
                                    System.out.print("Insira novo email: ");
                                    email = CampoUsuario.verificarCampo(sc);
                                }
                                case SENHA -> {
                                    System.out.print("Insira nova senha: ");
                                    senha = CampoUsuario.verificarCampo(sc);
                                }
                                case TELEFONE -> {
                                    System.out.print("Insira novo telefone: ");
                                    telefone = Long.parseLong(CampoUsuario.verificarCampo(sc));
                                }
                                case TODOS -> {
                                    // Permite editar todos os campos
                                    System.out.print("Insira novo nome: ");
                                    nome = CampoUsuario.toCapitalize(sc);
                                    System.out.print("Insira o novo gênero: (Masculino ou Feminino) ");
                                    genero = CampoUsuario.toCapitalize(sc);
                                    System.out.print("Insira novo CPF: ");
                                    cpf = CampoUsuario.verificarCampo(sc);
                                    System.out.print("Insira novo email: ");
                                    email = CampoUsuario.verificarCampo(sc);
                                    System.out.print("Insira novo telefone: ");
                                    telefone = Long.parseLong(CampoUsuario.verificarCampo(sc));
                                    System.out.print("Insira nova senha: ");
                                    senha = CampoUsuario.verificarCampo(sc);
                                }
                                default -> System.out.println("Campo não suportado para edição.");
                            }

                            mostrarInformacoesCadastradas(nome, genero, cpf, email, telefone, senha);
                            System.out.print("Estão corretas? ");
                            confirmacao = CampoUsuario.verificarCampo(sc);
                        } while (!confirmacao.equalsIgnoreCase("sim"));

                        conta = criarContaPorTipo(tipo, nome, genero, cpf, email, telefone, senha);
                        listaDeContas.put(conta.getNumConta(), conta);

                        System.out.println("+----------------------------------------------+");
                        System.out.println("| Conta criada com sucesso!                    |");
                        System.out.println("+----------------------------------------------+");
                        infoContas(nome, genero, cpf, email, telefone, senha, conta.getNumConta());
                    } else {
                        System.out.println("Problema na criação da conta, tente novamente!");
                    }
                }
            }
        } catch (NumberFormatException e) {
            // Erro ao converter telefone
            System.err.println("\nImpossível criar a conta! Tente novamente mais tarde (" + e.getMessage() + ")");
        } catch (Exception e) {
            // Excedeu tentativas ou erro inesperado
            System.err.println("\n\nNúmero máximo de tentativas excedido. Retornando ao menu principal. (" + e.getMessage() + ")");
        }
    }

    // Cria conta conforme o tipo escolhido
    private static Conta criarContaPorTipo(
            TipoContas tipo,
            String nome,
            String genero,
            String cpf,
            String email,
            long telefone,
            String senha
    ) {
        return switch (tipo) {
            case CORRENTE -> new ContaCorrente(nome, genero, cpf, email, telefone, senha);
            case POUPANCA -> new ContaPoupanca(nome, genero, cpf, email, telefone, senha);
        };
    }

    // Exibe informações completas da conta criada
    private static void infoContas(String nome, String genero, String cpf, String email, long telefone, String senha, int conta) {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
        System.out.println("Número da Conta: " + conta);
    }

    // Exibe informações para confirmação antes da criação
    private static void mostrarInformacoesCadastradas(String nome, String genero, String cpf, String email, long telefone, String senha) {
        System.out.println("\n🔎 Confira seus dados:");
        System.out.println("─────────────────────────────");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
        System.out.println("─────────────────────────────");
    }

    private static void mensagemMenu() {
        System.out.println("\n=======================");
        System.out.println("  Criação de Conta");
        System.out.println("=======================");
    }
}
