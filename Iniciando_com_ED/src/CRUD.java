import java.util.*;

public class CRUD {

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new LinkedList<>();

        System.out.println("\n-- Bem vindo ao CRUD! --");

        do {
            try {
                int opcao = exibirMenu(sc);
                opcaoAcao(opcao, lista, sc);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        } while(true);
    }

    // EXIBINDO MENU E LEITURA DA OPÇÃO
    private static int exibirMenu(Scanner sc) {
        while (true) {
            try {
                System.out.println("Deseja fazer o quê?");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Remover");
                System.out.println("3 - Editar");
                System.out.println("4 - Listar");
                System.out.println("5 - Sair");

                System.out.print("\nDigite a opção selecionada: ");
                int opcao = sc.nextInt();
                sc.nextLine();

                if (opcao < 1 || opcao > 5) {
                    System.out.println("\nOpção inválida! Escolha de 1 a 5.\n");
                } else {
                    return opcao;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                sc.nextLine(); 
            }
        }
    }


    // AÇÃO DA OPÇÃO ESCOLHIDA
    private static void opcaoAcao(int opcao, List<String> lista, Scanner sc) {
        try {
            switch (opcao) {
                case 1 -> adicionarTarefa(sc, lista);
                case 2 -> removerTarefa(sc, lista);
                case 3 -> editarTarefa(sc, lista);
                case 4 -> listaTarefas(lista);
                case 5 -> {
                    System.out.println("Encerrando...");
                    System.exit(0);
                }
            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e);
        }
    }


    // ADCIONANDO TAREFA
    private static void adicionarTarefa(Scanner sc, List<String> lista) {
        System.out.println("\n-- Adicionar Tarefa Selecionado --");
        System.out.print("Insira a tarefa: ");
        String tarefa = sc.nextLine();

        lista.add(tarefa);

        System.out.println("Adicionado com sucesso!\n");
    }

    // REMOVENDO TAREFA
    private static void removerTarefa(Scanner sc, List<String> lista) throws IllegalArgumentException {
        System.out.print("\n-- Remover Tarefa Selecionado! --");

        if(lista.isEmpty()) {
            System.out.println("\nLista vazia!\n");
            return;
        }

        listaTarefas(lista);

        System.out.print("Insira o número da tarefa: ");
        int numeroRemover = sc.nextInt() - 1;
        sc.nextLine();

        if(numeroRemover > lista.size() - 1 || numeroRemover < 0) {
            throw new IllegalArgumentException("Tarefa Inexistente!\n");
        }

        lista.remove(numeroRemover);        

        System.out.println("\n-- Removido com sucesso! --\n");
    }

    // EDITAR TAREFA
    private static void editarTarefa(Scanner sc, List<String> lista) {
        System.out.print("\n-- Editar Tarefa Selecionado --");

        if(lista.isEmpty()) {
            System.out.println("\nLista vazia!\n");
            return;
        }

        listaTarefas(lista);

        System.out.print("Insira o número da tarefa: ");
        int numeroEditar = (sc.nextInt() - 1);
        sc.nextLine();

        if(numeroEditar >= lista.size() - 1 || numeroEditar < 0) {
            throw new IllegalArgumentException("Tarefa Inexistente!\n");
        }

        System.out.print("Insira a nova tarefa: ");
        String novaTarefa = sc.nextLine();

        lista.add(numeroEditar, novaTarefa);

        System.out.println("-- Editada com sucesso! --\n");
    }

    // LISTAR TAREFAS
    private static void listaTarefas(List<String> lista) {
        if(lista.isEmpty()) {
            System.out.println("\nLista vazia!\n");
            return;
        }

        System.out.println("\n-- Inicio da Lista --");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " - " + lista.get(i));
        }
        System.out.println("-- Final da Lista --\n");
    }
}
