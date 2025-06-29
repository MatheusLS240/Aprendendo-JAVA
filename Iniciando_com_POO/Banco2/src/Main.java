import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Conta> listaDeContas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            try {
                exibirMenu();
                System.out.printf("\nEscolha uma opção: ");
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 0 -> System.out.println("Encerrando o sistema...");
                    case 1 -> CriacaoConta.criarConta(sc, listaDeContas);
                    case 2 -> LoginConta.loginConta(sc, listaDeContas);
                    default -> System.out.print("Opção inválida!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Opção inválida! Digite um número inteiro.");
                opcao = -1;
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=======================");
        System.out.println("  Sistema Bancário");
        System.out.println("=======================");
        System.out.println("0 - Encerrar");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Logar na conta");
    }
}
