import java.time.*;

public class ContaCorrente extends Conta {
    private double taxaManutencao = 12.90;
    private double limiteChequeEspecial = 500.00;
    private double jurosChequeEspecial = 0.08;
    private double taxaSaque = 2.50;
    private boolean permiteChequeEspecial = true;
    private boolean usandoChequeEspecial = false;

    public ContaCorrente(String nome, String cpf, String email, long telefone, String senha) {
        super(nome, cpf, email, telefone);
        setSenha(senha);
        setNumConta((int) (Math.random() * 10000));
    }

    @Override
    public boolean sacar(double valor) {
        double saldoAtual = getSaldo();
        double saldoECheque = saldoAtual + limiteChequeEspecial;

        if (valor <= saldoAtual) {
            setSaldo(saldoAtual - valor);
            System.out.println("Saque realizado com sucesso. Saldo restante: R$ " + getSaldo());
            return true;
        } else if (permiteChequeEspecial && valor <= saldoECheque) {
            setSaldo((saldoAtual - valor) - taxaSaque);
            usandoChequeEspecial = true;
            System.out.println("Saque realizado com uso do cheque especial. Saldo atual: R$ " + getSaldo());
            return true;
        } else {
            return false;
        }
    }

    public void verificarEncargosMensais() {
        LocalDate hoje = LocalDate.now();
        if(getUltimaAtualizacao().plusMonths(1).isBefore(hoje) || getUltimaAtualizacao().plusMonths(1).equals(hoje)) {
            aplicarEncargosMensais();
            setUltimaAtualizacao(hoje);
        }
    }

    public void aplicarEncargosMensais() {
        System.out.println("Aplicando encargos da Conta Corrente...");
        setSaldo(getSaldo() - taxaManutencao);

        if (getSaldo() < 0) {
            double juros = Math.abs(getSaldo()) * jurosChequeEspecial;
            setSaldo(getSaldo() - juros);
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
            System.out.println("Juros de R$" + juros + " aplicados sobre o cheque especial.");
        }
    }


}
