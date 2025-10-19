package bean;

public class FuncionarioCLT extends Funcionario implements Beneficiavel {
    private double beneficios;

    public FuncionarioCLT(int id, String nome, double salarioBase, double beneficios) {
        super(id, nome, salarioBase);
        this.beneficios = beneficios;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + beneficios;
    }

    @Override
    public void receberBeneficios(double valor) {
        setBeneficios(valor);
    }
}
