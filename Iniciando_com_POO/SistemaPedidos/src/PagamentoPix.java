public class PagamentoPix implements Pagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("O pagamento foi realizado via PIX (%s) no valor %f", this.chavePix, valor);
    }
}
