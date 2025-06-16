package Iniciando_com_POO.Empresa.src;

public class Funcionario {
    private String nome;
    private String cpf;
    private String data_admissao;
    private String cargo;
    protected double salarioBase = 0;
    
    public Funcionario(String nome, String cpf, String data_admissao, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_admissao = data_admissao;
        this.cargo = cargo;
    }

    public String statusFuncionario() {
        return "Nome: " + this.nome +
                "\nCPF: " + cpf +
                "\nData de Admissão: " + data_admissao +
                "\nCargo: " + cargo +
                "\nSalario Base: " + salarioBase;
    }
}
