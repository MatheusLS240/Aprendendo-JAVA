import java.util.*;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> listaContato = new HashMap<>();
        int opcaoOperacao = -1;

        while(opcaoOperacao != 0) {
            System.out.println("-- Menu de principal --");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Editar contato");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Listar contatos");
            System.out.print("Digite a opção desejada: ");
            opcaoOperacao = sc.nextInt();

            switch (opcaoOperacao) {
                case 1 -> {
                    adicionarContato(listaContato, sc);
                }
                case 2 -> {
                    editarContato(listaContato, sc);
                }
                case 3 -> {
                    buscarContato(listaContato, sc);
                }
                case 4 -> {
                    listarContatos(listaContato);
                }
                default -> {
                    System.out.println("Opção indefinida!");
                }
            }
        }
    }

    public static void listarContatos(Map<String, String> listaContato) {
        System.out.println("-----------------------------------");
        System.out.println("-- Lista de contato --");
        int i = 1;
        for(Map.Entry<String, String> contatosSalvos : listaContato.entrySet()) {
            String tel = contatosSalvos.getKey();
            String nome = contatosSalvos.getValue();
            System.out.println(i + " - Telefone: " + tel + " - Nome: " + nome);
            i++;
        }
        System.out.println("-----------------------------------");
    }

    public static void adicionarContato(Map<String, String> listaContato, Scanner sc) {
        System.out.println("-----------------------------------");
        System.out.println("-- Adicionar contato --");
        sc.nextLine();
        System.out.print("Insira o número de telefone: ");
        String tel = sc.nextLine();
        System.out.print("Insira o nome do contato: ");
        String nome = sc.nextLine();

        listaContato.put(tel, nome.toLowerCase());

        System.out.println("Adicionado com sucesso!");
        System.out.println("-----------------------------------");
    }

    public static void buscarContato(Map<String, String> listaContato, Scanner sc) {
        System.out.println("-----------------------------------");
        System.out.println("-- Buscar contato --");
        sc.nextLine();
        System.out.println("Insira o nome do contato:");
        String nome = sc.nextLine();

        for(Map.Entry<String, String> entry : listaContato.entrySet()) {
            if(entry.getValue().equals(nome)) {
                System.out.println("O número de telefone é: " + entry.getKey());
                break;
            }
            System.out.println("Sem números com esse nome!");
        }
        System.out.println("-----------------------------------");
    }

    public static void editarContato(Map<String, String> listaContato, Scanner sc) {
        System.out.println("-----------------------------------");
        System.out.println("-- Editar contato --");
        sc.nextLine();
        System.out.println("Insira o número do contato:");
        String newTel = sc.nextLine();
        System.out.println("Insira o novo nome:");
        String newNome = sc.nextLine();

        listaContato.put(newTel, newNome.toLowerCase());

        System.out.println("Adicionado com sucesso!");
        System.out.println("-----------------------------------");
    }
}
