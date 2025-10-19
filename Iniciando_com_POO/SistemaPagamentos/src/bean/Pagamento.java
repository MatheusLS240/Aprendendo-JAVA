package bean;

public abstract class Pagamento implements Processavel {
    private double valor;
    private String data;
    private int idTransacao;

    public Pagamento(double valor, String data, int idTransacao) {
        this.valor = valor;
        this.data = data;
        this.idTransacao = idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public abstract void exibirDetalhes();
}
