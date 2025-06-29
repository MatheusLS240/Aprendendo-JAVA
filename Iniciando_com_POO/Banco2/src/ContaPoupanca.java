import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.005;
    private int carenciaDias = 10;
    private double valorTotalRenda = this.getSaldo();
    private LocalDate dataAplicacao = null;
    private boolean valorAplicado = false;

    public ContaPoupanca(String nome, String genero, String cpf, String email, long telefone, String senha) {
        super(nome, genero, cpf, email, telefone);
        setSenha(senha);
        setNumConta((int) (Math.random() * 10000));
    }

    @Override
    public void sacar(double valor) {
        aplicarRendimentosMensais();

        if (valor <= getSaldo() && valor >= 1) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Erro no saque, valor inválido ou saldo insuficiente.");
        }
    }

    private void aplicarRendimentosMensais() {
        LocalDate hoje = LocalDate.now();
        if(getUltimaAtualizacao().plusMonths(1).isBefore(hoje) || getUltimaAtualizacao().plusMonths(1).equals(hoje)) {
            valorTotalRenda = getSaldo() * taxaRendimento;
            setSaldo(getSaldo() + valorTotalRenda);
            setUltimaAtualizacao(hoje);
            this.valorAplicado = true;
            if(this.dataAplicacao == null) {
                this.dataAplicacao = hoje;
            }
        }
    }

    private boolean verificarCarenciaDias() {
        LocalDate hoje = LocalDate.now();
        if(dataAplicacao != null) {
            return this.dataAplicacao.plusDays(carenciaDias).isBefore(hoje) || this.dataAplicacao.plusDays(carenciaDias).equals(hoje);
        }
        return false;
    }

    private void resgatarRendimentosMensais() {
        LocalDate hoje = LocalDate.now();
        if(valorAplicado) {
            if(verificarCarenciaDias()) {
                setSaldo(this.getSaldo() + valorTotalRenda);
                System.out.println("Valor do saque realizado com sucesso!");
                valorAplicado = false;
            } else {
                long diasRestantes = ChronoUnit.DAYS.between(hoje, dataAplicacao.plusDays(carenciaDias));
                diasRestantes = Math.max(0, diasRestantes);
                System.out.printf("Faltam %d dias para realizar o saque", diasRestantes);
            }
        } else {
            System.out.println("É necessario aplicar um valor antes de tentar sacar!");
        }
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getCarenciaDias() {
        return carenciaDias;
    }

    public void setCarenciaDias(int carenciaDias) {
        this.carenciaDias = carenciaDias;
    }

    public double getValorTotalRenda() {
        return valorTotalRenda;
    }

    public void setValorTotalRenda(double valorTotalRenda) {
        this.valorTotalRenda = valorTotalRenda;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

}
