import java.util.*;

public class Pedido {
    private int idPedido;
    private String data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private final double frete = 0.10;

    public Pedido(int idPedido, String data, Cliente cliente, List<ItemPedido> itens) {
        this.idPedido = idPedido;
        this.data = data;
        this.cliente = cliente;
        this.itens = itens;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemPedido itemPedido) {
        itens.add(itemPedido);
    }

    public double calcularTotal() {
        double total = 0;
        for(ItemPedido ip : itens) {
            total += ip.calcularSubtotal();
        }
        return total + (total * frete);
    }

    public void exibirResumo() {
        System.out.println("-- RESUMO DO PEDIDO --");
        System.out.printf("Nome do cliente: %s\n", cliente.getNome());
        System.out.printf("Data: %s\n", this.data);
        System.out.println("Itens:");
        for(ItemPedido ip : itens) {
            System.out.printf("%s: %d\n", ip.getProduto().getNome(), ip.getQuantidade());
        }
        System.out.printf("Total: %f\n", calcularTotal());
    }
}
