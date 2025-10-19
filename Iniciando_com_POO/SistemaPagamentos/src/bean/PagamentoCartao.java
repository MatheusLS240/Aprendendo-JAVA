package bean;

public class PagamentoCartao extends Pagamento {
    private String nomeTitular;
    private String numeroCartao;

    public PagamentoCartao(double valor, String data, int idTransacao, String nomeTitular, String numeroCartao) {
        super(valor, data, idTransacao);
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("-- Cartão --");
        System.out.printf("Nome do titular: %s\n", this.nomeTitular);
        System.out.printf("Numero do cartão: %s\n", this.numeroCartao);
        System.out.printf("Valor: %f\n", this.getValor());
        System.out.printf("Data: %s\n", this.getData());
        System.out.printf("ID da Transação: %d\n", this.getIdTransacao());
    }

    @Override
    public void processarPagamento() {
        System.out.println("Transação via CARTÃO liberada!");
    }
}
