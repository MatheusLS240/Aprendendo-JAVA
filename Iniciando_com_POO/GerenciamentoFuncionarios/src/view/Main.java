package view;

import bean.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            Funcionario f1 = new FuncionarioCLT(1, "Carlos", 3000.00, 500.00);
            Funcionario f2 = new FuncionarioHorista(2, "Juliana", 0, 160, 25.00);
            Funcionario f3 = new FuncionarioCLT(3, "Mariana", 4000.00, 800.00);

            List<Funcionario> equipeGerente = new ArrayList<>();
            equipeGerente.add(f1);
            equipeGerente.add(f2);

            Gerente g1 = new Gerente(4, "Roberto", 8000.00, 1000.00, 2000.00, equipeGerente);

            List<Funcionario> funcionarios = new ArrayList<>();
            funcionarios.add(f1);
            funcionarios.add(f2);
            funcionarios.add(f3);
            funcionarios.add(g1);

            Empresa empresa = new Empresa(funcionarios);

            empresa.listarFuncionarios();

            empresa.calcularFolhaSalarial();

            System.out.println("\n--- DETALHES DOS FUNCIONÁRIOS ---");
            for (Funcionario f : empresa.getFuncionarios()) {
                f.exibirInformacoes();
                System.out.printf(" | Salário Total: %.2f\n", f.calcularSalario());
            }

            g1.receberBeneficios(1500.00);
            System.out.printf("\n[INFO] Novo salário do gerente %s após benefício: %.2f\n",
                    g1.getNome(), g1.calcularSalario());

        } catch (Exception e) {
            System.out.println("Erro no processamento: " + e.getMessage());
        }
    }
}
