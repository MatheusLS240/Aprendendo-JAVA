package bean;

import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionarFuncionarios(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void calcularFolhaSalarial() {
        double valorTotal = 0;
        for(Funcionario f : funcionarios) {
            valorTotal += f.calcularSalario();
        }
        System.out.printf("-- FOLHA SALÁRIAL: %f --\n", valorTotal);
    }

    public void listarFuncionarios() {
        int contador = 1;
        System.out.println("-- FUNCIONARIOS --");
        for(Funcionario f : funcionarios) {
            System.out.printf("%d: %s\n", contador, f.getNome());
            contador++;
        }
    }
}
