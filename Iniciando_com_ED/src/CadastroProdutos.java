import java.util.*;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class CadastroProdutos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse", 79.90));
        produtos.add(new Produto("Teclado", 199.99));
        produtos.add(new Produto("Monitor", 899.00));
        produtos.add(new Produto("Cabo USB", 25.50));

        System.out.println("Produtos (Original):");
        produtos.forEach(System.out::println);

        produtos.sort(Comparator.comparingDouble(Produto::getPreco));
        System.out.println("\nProdutos ordenados por preço (crescente):");
        produtos.forEach(System.out::println);

        produtos.sort(Comparator.comparingDouble(Produto::getPreco).reversed());
        System.out.println("\nProdutos ordenados por preço (decrescente):");
        produtos.forEach(System.out::println);
    }
}
