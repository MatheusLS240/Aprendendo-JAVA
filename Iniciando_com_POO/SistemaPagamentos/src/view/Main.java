package view;
import bean.*;

public class Main {
    public static void main(String[] args) {
        SistemaPagamentos sistema = new SistemaPagamentos();

        Pagamento p1 = new PagamentoCartao(150.75, "17/10/2025", 101, "Matheus", "1234 5678 9876 5432");
        Pagamento p2 = new PagamentoBoleto(89.90, "17/10/2025", 102, "23793.38124 91234.789000 11123.456780 1 12340000008990");
        Pagamento p3 = new PagamentoPix(45.00, "17/10/2025", 103, "matheus@banco.com");

        sistema.adicionarPagamento(p1);
        sistema.adicionarPagamento(p2);
        sistema.adicionarPagamento(p3);

        System.out.println("\n--- RELATÓRIO INICIAL ---");
        sistema.gerarRelatorio();

        System.out.println("\n--- PROCESSANDO ---");
        sistema.processarTodos();

        System.out.println("\n--- RELATÓRIO FINAL ---");
        sistema.gerarRelatorio();
    }
}
