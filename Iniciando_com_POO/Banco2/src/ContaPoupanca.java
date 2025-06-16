public class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.005;
    private boolean rendimentoAutomatico = true;
    private int carenciaDias = 10;


    public ContaPoupanca(String nome, String cpf, String email, long telefone) {
        super(nome, cpf, email, telefone);
    }
}
