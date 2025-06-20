import java.util.Scanner;

public class Main {
    // -- Função Main --
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            try {
                System.out.print("\nEscolha uma opção: ");
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1 -> criarConta(sc);
                    case 2 -> System.out.println("Funcionalidade de login ainda não implementada.");
                    case 0 -> System.out.println("Encerrando o sistema...");
                    default -> System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.err.println("Opção inválida! Digite um número inteiro.");
                opcao = -1;
            }

        } while (opcao != 0);

        sc.close();
    }

    // -- Criar Conta --
    private static void criarConta(Scanner sc) {
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
                return;
            }

            switch (tipo) {
                case CORRENTE -> {
                    System.out.println("\nConfirme os dados:");
                    System.out.println("Nome: " + nome);
                    System.out.println("CPF: " + cpf);
                    System.out.println("Email: " + email);
                    System.out.println("Telefone: " + telefone);
                    System.out.println("Senha: " + senha);

                    System.out.print("Você confirma as informações? (sim/não): ");
                    String confirmacao = sc.nextLine().toLowerCase();

                    if (confirmacao.equals("sim")) {
                        ContaCorrente conta = new ContaCorrente(nome, cpf, email, telefone, senha);
                        System.out.println("\nConta corrente criada com sucesso!\n");
                        infoContas(nome, cpf, email, telefone, senha, conta.getNumConta());
                    } else {
                        System.out.print("Qual parte deseja alterar? (nome / cpf / email / telefone / senha / todos): ");
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

                            System.out.println("\nConta corrente criada com sucesso!");
                            ContaCorrente conta = new ContaCorrente(nome, cpf, email, telefone, senha);
                            infoContas(nome, cpf, email, telefone, senha, conta.getNumConta());
                        }

                        System.out.println("Problema na criação da conta, tente novamente!");
                    }
                }

                case POUPANCA -> {
                    ContaPoupanca conta = new ContaPoupanca(nome, cpf, email, telefone);
                    System.out.println("\nConta poupança criada com sucesso!");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao criar conta: " + e.getMessage());
        }

    }

    // -- Login --
//    private static void loginConta(Scanner sc) {
//        try {
//            System.out.println("Insira o número da conta");
//            long num = sc.nextLong();
//            System.out.println("Insira o tipo da conta (corrente ou poupança): ");
//            TipoContas tipoContas = TipoContas.converterContas(sc.nextLine());
//            System.out.println("Insira a sua senha");
//            String senha = sc.nextLine();
//
//            if()
//        } ca
//    }

    // -- Exibir Menu --
    private static void exibirMenu() {
        System.out.println("\n=======================");
        System.out.println("  Sistema Bancário");
        System.out.println("=======================");
        System.out.println("0 - Encerrar");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Logar na conta");
    }

    // -- Mostrar Informações após a criação da conta
    private static void infoContas(String nome, String cpf, String email, long telefone, String senha, int conta) {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + senha);
        System.out.println("Numero da Conta: " + conta);
    }
}
