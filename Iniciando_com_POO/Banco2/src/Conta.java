abstract class Conta extends Cliente{
    private int numConta;
    private String clienteAssociado = getNome();
    private double saldo;

    // Metodos padrãos
    public boolean depositar(double valor) {
        if(valor >= 1) {
            this.saldo = this.saldo + valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo && valor >= 1) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }

    public boolean tranferir(Conta contaDestino, double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            return true;
        }
        return false;
    }

    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getClienteAssociado() {
        return clienteAssociado;
    }

    public void setClienteAssociado(String clienteAssociado) {
        this.clienteAssociado = clienteAssociado;
    }
}
