import java.util.*;

public class CriacaoConta {
    public static void criarConta(Scanner sc, Map<Integer, Conta> listaDeContas) {
        Conta conta = null;
        try {
            // Coleta de dados do usuário
            System.out.print("\nInsira seu nome: ");
            String nome = CampoUsuario.verificarCampo(sc);
            System.out.print("Insira seu gênero: (Masculino ou Feminino) ");
            String genero = CampoUsuario.verificarGenero(sc);
            System.out.print("Insira seu CPF: ");
            String cpf = CampoUsuario.verificarCampo(sc);
            System.out.print("Insira seu email: ");
            String email = CampoUsuario.verificarCampo(sc);
            System.out.print("Insira seu telefone: ");
            String telefoneStr = CampoUsuario.verificarCampo(sc);
            long telefone = Long.parseLong(telefoneStr);
            System.out.print("Insira uma senha: ");
            String senha = CampoUsuario.verificarCampo(sc);

            System.out.print("Qual tipo de conta deseja criar? (Corrente/Poupanca): ");
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

                    System.out.printf("\nConta %s criada com sucesso!\n", tipo);
                    infoContas(nome, genero, cpf, email, telefone, senha, conta.getNumConta());
                } else {
                    // Permite edição dos dados antes de criar a conta
                    System.out.print("\nQual parte deseja alterar? (nome / cpf / email / telefone / senha / todos): ");
                    String campoEditar = CampoUsuario.verificarCampo(sc);
                    CampoUsuario campo = CampoUsuario.converterCampo(campoEditar);

                    if (campo != null) {
                        do {
                            switch (campo) {
                                case NOME -> {
                                    System.out.print("Insira novo nome: ");
                                    nome = CampoUsuario.verificarCampo(sc);
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
                                    nome = CampoUsuario.verificarCampo(sc);
                                    System.out.print("Insira o novo gênero: (Masculino ou Feminino) ");
                                    genero = CampoUsuario.verificarGenero(sc);
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

                        System.out.printf("\nConta %s criada com sucesso!\n", tipo);
                        infoContas(nome, genero, cpf, email, telefone, senha, conta.getNumConta());
                    } else {
                        System.out.println("Problema na criação da conta, tente novamente!");
                    }
                }
            }
        } catch (NumberFormatException e) {
            // Erro ao converter telefone
            System.out.println("Impossível criar a conta! Tente novamente mais tarde (" + e.getMessage() + ")");
        } catch (Exception e) {
            // Excedeu tentativas ou erro inesperado
            System.err.println("\nNúmero máximo de tentativas excedido. Retornando ao menu principal.");
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
        System.out.println("\nConfirme os dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
    }
}
