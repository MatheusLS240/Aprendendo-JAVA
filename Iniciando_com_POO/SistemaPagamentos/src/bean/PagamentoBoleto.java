package bean;

public class PagamentoBoleto extends Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(double valor, String data, int idTransacao, String codigoBoleto) {
        super(valor, data, idTransacao);
        this.codigoBoleto = codigoBoleto;
    }

    public String getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("-- Boleto --");
        System.out.printf("Código do boleto: %s\n", this.codigoBoleto);
        System.out.printf("Valor: %f\n", this.getValor());
        System.out.printf("Data: %s\n", this.getData());
        System.out.printf("ID da Transação: %d\n", this.getIdTransacao());
    }

    @Override
    public void processarPagamento() {
        System.out.println("Transação via BOLETO liberada!");
    }
}
