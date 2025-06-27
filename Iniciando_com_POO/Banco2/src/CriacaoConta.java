import java.util.*;

public class CriacaoConta {

    // -- Criar Conta --
    public static void criarConta(Scanner sc, Map<Integer, Conta> listaDeContas) {
        Conta conta = null;
        try {
            // Inserir dados de cadastro
            System.out.print("\nInsira seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Insira seu gênero: (Masculino ou Feminino) ");
            String genero = CampoUsuario.verificarGenero(sc);
            System.out.print("Insira seu CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Insira seu email: ");
            String email = sc.nextLine();
            System.out.print("Insira seu telefone: ");
            long telefone = Long.parseLong(sc.nextLine());
            System.out.print("Insira uma senha: ");
            String senha = sc.nextLine();

            // Selecionar tipo de conta para criação
            System.out.print("Qual tipo de conta deseja criar? (corrente/poupanca): ");
            String opcaoConta = sc.nextLine();

            // Convertendo a variavel 'opcaoConta' para o valor correto do Enum
            TipoContas tipo = TipoContas.converterContas(opcaoConta);

            // Verifica se o tipo retornado da classe enum é válido
            if (tipo == null) {
                System.out.println("Tipo de conta inválido!");
            }
            // Se for válido, mostra os dados inseridos para confirmação
            else {
                mostrarInformacoesCadastradas(nome, genero, cpf, email, telefone, senha);
                // Opção para confirmar os dados
                System.out.print("Você confirma as informações? (sim/não): ");
                String confirmacao = sc.nextLine().toLowerCase();

                // Se confirmado, cria a conta e salva no mapa
                if (confirmacao.equals("sim")) {
                    conta = criarContaPorTipo(tipo, nome, genero, cpf, email, telefone, senha);
                    listaDeContas.put(conta.getNumConta(), conta);

                    System.out.printf("\nConta %s criada com sucesso!", tipo);
                    infoContas(nome, genero, cpf, email, telefone, senha, conta.getNumConta());
                }
                // Caso o usuário queira alterar algo antes de criar a conta
                else {
                    System.out.print("\nQual parte deseja alterar? (nome / cpf / email / telefone / senha / todos): ");
                    String campoEditar = sc.nextLine();
                    CampoUsuario campo = CampoUsuario.converterCampo(campoEditar);

                    // Verifica se o campo informado é válido e realiza as alterações
                    if (campo != null) {
                        do {
                            switch (campo) {
                                case NOME -> {
                                    System.out.print("Insira novo nome: ");
                                    nome = sc.nextLine();
                                }
                                case GENERO -> {
                                    System.out.print("Insira o novo gênero: (Masculino ou Feminino) ");
                                    genero = CampoUsuario.verificarGenero(sc);
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
                                    // Permite editar todos os campos de uma vez
                                    System.out.print("Insira novo nome: ");
                                    nome = sc.nextLine();
                                    System.out.print("Insira o novo gênero: (Masculino ou Feminino) ");
                                    genero = CampoUsuario.verificarGenero(sc);
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

                            mostrarInformacoesCadastradas(nome, genero, cpf, email, telefone, senha);
                            System.out.print("Estão corretas? ");
                            confirmacao = sc.next();
                        } while (!confirmacao.equalsIgnoreCase("sim"));

                        // Após editar, cria a conta com os novos dados
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
            // Captura erro caso o telefone não seja um número válido
            System.out.println("Impossível criar a conta! Tente novamente mais tarde (" + e.getMessage() + ")");
        }
    }

    // -- Cria e retorna uma nova conta com base no tipo escolhido (corrente ou poupança) --
    private static Conta criarContaPorTipo(
            TipoContas tipo,
            String nome,
            String genero,
            String cpf,
            String email,
            long telefone,
            String senha
    ) {
        // Usa switch expression para decidir qual classe instanciar
        return switch (tipo) {
            case CORRENTE -> new ContaCorrente(nome, genero, cpf, email, telefone, senha);
            case POUPANCA -> new ContaPoupanca(nome, genero, cpf, email, telefone, senha);
        };
    }

    // -- Exibe os dados da conta criada na tela --
    private static void infoContas(String nome, String genero, String cpf, String email, long telefone, String senha, int conta) {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero); // Corrigido aqui também, "Gênero" com acento
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
        System.out.println("Número da Conta: " + conta);
    }

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
