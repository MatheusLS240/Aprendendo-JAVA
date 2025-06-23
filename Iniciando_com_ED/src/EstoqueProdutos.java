import java.util.*;

public class EstoqueProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> estoqueProdutos = new HashMap<>();

        while (true) {
            System.out.println("0 - Encerrar programa");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produto");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produtos com estoque estoque zerado");
            System.out.print("Insira a opção desejada: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 0 -> {
                    System.out.println("Encerrando...");
                    System.exit(0);
                }
                case 1 -> {
                    adicionarEstoque(estoqueProdutos, sc);
                }
                case 2 -> {
                    listarEstoque(estoqueProdutos);
                }
                case 3 -> {
                    atualizarEstoque(estoqueProdutos, sc);
                }
                case 4 -> {
                    removerEstoqueZerado(estoqueProdutos);
                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        }

    }

    public static void listarEstoque(Map<String, Integer> estoqueProdutos) {
        System.out.println("-------------------------------");
        int i = 1;
        if(estoqueProdutos.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {
            for(Map.Entry<String, Integer> produtos : estoqueProdutos.entrySet()) {
                String nomeProduto = produtos.getKey();
                int quantidadeProduto = produtos.getValue();

                System.out.println(i + " - Produto: " + nomeProduto + " / Quantidade: " + quantidadeProduto);

                i++;
            }
        }
        System.out.println("-------------------------------");
    }

    public static void adicionarEstoque(Map<String, Integer> estoqueProdutos, Scanner sc) {
        sc.nextLine();
        System.out.println("-------------------------------");
        System.out.print("Insira o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Insira a quantidade do produto: ");
        int quantidadeProduto = sc.nextInt();

        estoqueProdutos.put(nomeProduto, quantidadeProduto);

        System.out.println("\nProduto adicionado com sucesso!");
        System.out.println("-------------------------------");
    }

    public static void atualizarEstoque(Map<String, Integer> estoqueProdutos, Scanner sc) {
        sc.nextLine();
        System.out.println("-------------------------------");
        System.out.print("Insira o nome do produto: ");
        String produtoSubs = sc.nextLine();

        for(Map.Entry<String, Integer> produtos : estoqueProdutos.entrySet()) {
            if(produtos.getKey().equals(produtoSubs)) {
                System.out.print("Insira a nova quantidade de produtos: ");
                int novaQuant = sc.nextInt();

                estoqueProdutos.put(produtoSubs, novaQuant);

                System.out.println("Estoque atualizado!");
            }
        }
        System.out.println("-------------------------------");
    }

    public static void removerEstoqueZerado(Map<String, Integer> estoqueProdutos) {
        System.out.println("-------------------------------");
        estoqueProdutos.entrySet().removeIf(x -> x.getValue() <= 0);

        System.out.println("Produtos com estoque abaixo de 0 removido!");
        System.out.println("-------------------------------");
    }
}
