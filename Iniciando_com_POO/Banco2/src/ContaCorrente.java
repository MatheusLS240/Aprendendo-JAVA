import java.time.*;

// Conta corrente com funcionalidades específicas
public class ContaCorrente extends Conta {
    private double taxaManutencao = 12.90;
    private double limiteChequeEspecial = 500.00;
    private double jurosChequeEspecial = 0.08;
    private double taxaSaque = 2.50;
    private boolean permiteChequeEspecial = true;
    private boolean usandoChequeEspecial = false;

    public ContaCorrente(String nome, String genero, String cpf, String email, long telefone, String senha) {
        super(nome, genero, cpf, email, telefone);
        setSenha(senha);
        setNumConta((int) (Math.random() * 10000));
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = getSaldo();

        if (valor <= saldoAtual) {
            setSaldo(saldoAtual - valor);
            System.out.println("\n💸 Saque realizado com sucesso. Saldo restante: R$ " + getSaldo());
        } else if (verificandoUsoCheque(valor)) {
            System.out.println("\n💳 Saque realizado com uso do cheque especial. Saldo atual: R$ " + getSaldo());
        } else {
            System.out.println("\n❌ Saldo insuficiente");
        }
    }

    // Verifica e utiliza cheque especial se necessário
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

    // Aplica encargos mensais se necessário
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
        System.out.println("\n💸 Taxa de manutenção de R$" + taxaManutencao + " aplicada.");
    }

    private void aplicarJurosChequeEspecial() {
        if (getSaldo() < 0) {
            double juros = Math.abs(getSaldo()) * jurosChequeEspecial;
            setSaldo(getSaldo() - juros);
            System.out.println("\n💸 Juros de R$" + juros + " aplicados sobre o cheque especial.");
        }
    }

    // Getters e setters
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
