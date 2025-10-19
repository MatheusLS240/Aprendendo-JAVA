package bean;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String data, int idTransacao, String chavePix) {
        super(valor, data, idTransacao);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("-- PIX --");
        System.out.printf("Chave PIX: %s\n", this.chavePix);
        System.out.printf("Valor: %f\n", this.getValor());
        System.out.printf("Data: %s\n", this.getData());
        System.out.printf("ID da Transação: %d\n", this.getIdTransacao());
    }

    @Override
    public void processarPagamento() {
        System.out.println("Transação via PIX liberada!");
    }
}
