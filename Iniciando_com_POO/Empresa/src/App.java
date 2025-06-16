package Iniciando_com_POO.Empresa.src;

public class App {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario(
                "Matheus",
                "501.103.668-59",
                "16/11/2008",
                "Dev BACK-END"
        );

        System.out.println(fun1.statusFuncionario());
    }
}
