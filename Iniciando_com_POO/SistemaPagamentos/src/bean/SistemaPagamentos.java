package bean;
import java.util.*;

public class SistemaPagamentos {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void processarTodos() {
        for(Pagamento p : pagamentos) {
            p.processarPagamento();
        }
        System.out.println("Todos os pagamentos pendentes foram processados.");
        pagamentos.clear();
    }

    public void gerarRelatorio() {
        for(Pagamento p : pagamentos) {
            p.exibirDetalhes();
        }
    }
}
