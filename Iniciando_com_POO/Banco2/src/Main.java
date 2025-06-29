import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Conta> listaDeContas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            try {
                exibirMenu();
                System.out.printf("Escolha uma opção: ");
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 0 -> System.out.println("Encerrando o sistema...");
                    case 1 -> CriacaoConta.criarConta(sc, listaDeContas);
                    case 2 -> LoginConta.loginConta(sc, listaDeContas);
                    default -> System.out.print("Opção inválida!");
                }
            } catch (NumberFormatException e) {
                // Entrada inválida no menu principal
                System.err.println("\nOpção inválida! Digite um número inteiro.");
                opcao = -1;
            }
        } while (opcao != 0);

        sc.close();
    }

    // Exibe menu principal do sistema
    private static void exibirMenu() {
        System.out.println();
        System.out.println("+----------------------------------------------+");
        System.out.println("|         BEM-VINDO AO SISTEMA BANCÁRIO        |");
        System.out.println("+----------------------------------------------+");
        System.out.println("|  0 - Encerrar                                |");
        System.out.println("|  1 - Criar conta                             |");
        System.out.println("|  2 - Logar na conta                          |");
        System.out.println("+----------------------------------------------+");
        System.out.println();
    }
}
