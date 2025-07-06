import java.util.*;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class CompararPorSalario implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return Double.compare(f1.getSalario(), f2.getSalario());
    }
}

public class FuncionarioSalario {
    public static void main(String[] args) {
        List<Funcionario> listaDeFuncionario = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            String opcao = "null";

            while(!opcao.equalsIgnoreCase("sim")) {
                System.out.print("Insira o nome do funcionário: ");
                String nomeFuncionario = sc.nextLine();
                System.out.print("Insira o cargo: ");
                String cargoFuncionario = sc.nextLine();
                System.out.print("Insira o salário: ");
                double salarioFuncionario = sc.nextDouble();
                sc.nextLine();

                listaDeFuncionario.add(new Funcionario(nomeFuncionario, cargoFuncionario, salarioFuncionario));

                System.out.println("\nFuncionário adicionado com sucesso!\n");

                System.out.print("Deseja encerrar o cadastro? (sim ou não): ");
                opcao = sc.nextLine();

                System.out.println("===============================================");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());  
        }
        if(listaDeFuncionario.isEmpty()) {
            System.out.println("Lista de funcionários vazia!");
        } else {
            listaDeFuncionario.sort(new CompararPorSalario().reversed());

            System.out.println("\n--- Lista de Funcionários Ordenada por Salário (maior para menor) ---\n");
            for(Funcionario funcionarios : listaDeFuncionario) {

                System.out.printf("Nome: %s | Cargo: %s | Salário: %.2f\n",
                        funcionarios.getNome(), funcionarios.getCargo(), funcionarios.getSalario());
            }
        }
    }
}
