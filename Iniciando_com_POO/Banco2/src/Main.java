import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoInicial = -1;


        do {
            System.out.println("\n0 - Encerrar");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Logar na conta");

            try {
                System.out.print("Escolha uma opção: ");
                opcaoInicial = Integer.parseInt(sc.nextLine());

                switch (opcaoInicial) {
                    case 1 -> {
                        System.out.print("Insira seu nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Insira seu CPF: ");
                        String cpf = sc.nextLine();
                        System.out.print("Insira seu email: ");
                        String email = sc.nextLine();
                        System.out.println("Insira seu telefone: ");
                        long telefone = sc.nextLong();

                        System.out.println("Qual tipo de conta deseja criar?");
                        String opcaoConta = sc.nextLine();
                        TipoContas opcaoCorreta = TipoContas.converterOpcao(opcaoConta);

                        switch (opcaoCorreta) {
                            case CORRENTE -> ContaCorrente contaC = new ContaCorrente(nome, cpf, email, telefone);
                            case POUPANCA -> {}
                        }


                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite um número inteiro.");
                opcao = -1;
            }

        } while (opcao != 0);
    }
}
