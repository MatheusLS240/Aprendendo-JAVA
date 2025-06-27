import java.time.*;

public class ContaCorrente extends Conta {
    private double taxaManutencao = 12.90;
    private double limiteChequeEspecial = 500.00;
    private double jurosChequeEspecial = 0.08;
    private double taxaSaque = 2.50;
    private boolean permiteChequeEspecial = true;
    private boolean usandoChequeEspecial = false;

    // -- Construtor --
    public ContaCorrente(String nome, String genero, String cpf, String email, long telefone, String senha) {
        super(nome, genero, cpf, email, telefone);
        setSenha(senha);
        setNumConta((int) (Math.random() * 10000));
    }

    // -- Metodos unicos da classe --
    @Override
    public boolean sacar(double valor) {
        double saldoAtual = getSaldo();
        double saldoECheque = saldoAtual + limiteChequeEspecial;

        if (valor <= saldoAtual) {
            setSaldo(saldoAtual - valor);
            System.out.println("Saque realizado com sucesso. Saldo restante: R$ " + getSaldo());
            return true;
        } else if (verificandoUsoCheque(valor)) {
            System.out.println("Saque realizado com uso do cheque especial. Saldo atual: R$ " + getSaldo());
            return true;
        } else {
            return false;
        }
    }

    private boolean verificandoUsoCheque(double valor) {
        double saldoAtual = getSaldo();
        double saldoECheque = saldoAtual + limiteChequeEspecial;

        if(permiteChequeEspecial && valor <= saldoECheque) {
            setSaldo((saldoAtual - valor) - taxaSaque);
            usandoChequeEspecial = true;
            return true;
        }
        return false;
    }

    private void verificarEncargosMensais() {
        LocalDate hoje = LocalDate.now();
        if(getUltimaAtualizacao().plusMonths(1).isBefore(hoje) || getUltimaAtualizacao().plusMonths(1).equals(hoje)) {
            descontarTaxaManutencao();
            if(usandoChequeEspecial) {
                aplicarJurosChequeEspecial();
            }
            setUltimaAtualizacao(hoje);
        }
    }

    private void descontarTaxaManutencao() {
        setSaldo(getSaldo() - taxaManutencao);
        System.out.println("Taxa de manutenção de R$" + taxaManutencao + " aplicada.");
    }

    private void aplicarJurosChequeEspecial() {
        if (getSaldo() < 0) {
            double juros = Math.abs(getSaldo()) * jurosChequeEspecial;
            setSaldo(getSaldo() - juros);
            System.out.println("Juros de R$" + juros + " aplicados sobre o cheque especial.");}
    }

    // -- Metodos gatters e setters --
    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getJurosChequeEspecial() {
        return jurosChequeEspecial;
    }

    public void setJurosChequeEspecial(double jurosChequeEspecial) {
        this.jurosChequeEspecial = jurosChequeEspecial;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public boolean isPermiteChequeEspecial() {
        return permiteChequeEspecial;
    }

    public void setPermiteChequeEspecial(boolean permiteChequeEspecial) {
        this.permiteChequeEspecial = permiteChequeEspecial;
    }

    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
        this.usandoChequeEspecial = usandoChequeEspecial;
    }
}
