package bean;
import java.util.List;

public class Gerente extends FuncionarioCLT implements Beneficiavel {
    private double bonus;
    private List<Funcionario> equipe;

    public Gerente(int id, String nome, double salarioBase, double beneficios, double bonus, List<Funcionario> equipe) {
        super(id, nome, salarioBase, beneficios);
        this.bonus = bonus;
        this.equipe = equipe;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public List<Funcionario> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Funcionario> equipe) {
        this.equipe = equipe;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus + getBeneficios();
    }

    @Override
    public void receberBeneficios(double valor) {
        setBeneficios(valor);
    }
}
