import java.util.ArrayList;

public class Main {
    public static void main() {
        Cliente c1 = new Cliente();
        c1.setIdCliente(1);
        c1.setNome("Matheus");
        c1.setEmail("matheus@email.com");

        Produto p1 = new Produto(1, "Mouse Gamer", 150.0);
        Produto p2 = new Produto(2, "Teclado Mecânico", 350.0);

        ItemPedido i1 = new ItemPedido(2, p1);
        ItemPedido i2 = new ItemPedido(1, p2);

        Pedido pedido = new Pedido(1, "17/10/2025", c1, new ArrayList<>());
        pedido.adicionarItem(i1);
        pedido.adicionarItem(i2);

        pedido.exibirResumo();

        Pagamento pagamento = new PagamentoPix("matheus@pix");
        pagamento.processarPagamento(pedido.calcularTotal());
    }
}
