

import java.util.Scanner;

public class PrintarNomes1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o nome do primeiro aluno: ");
        String aluno1 = ler.next();

        System.out.print("Insira o nome do segundo aluno: ");
        String aluno2 = ler.next();

        System.out.print("Insira o nome do terceiro aluno: ");
        String aluno3 = ler.next();

        System.out.println("\nNomes dos alunos:");
        System.out.println(aluno1 + " " + aluno2 + " " + aluno3);

        ler.close(); 
    }
}
