package Iniciando_com_POO.Aluno.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listAlunos = new ArrayList<>();
        try {
            System.out.println("Quantidade de alunos: ");
            int quantd = sc.nextInt();

            for(int i = 0; i < quantd; i++) {
                System.out.print("\nInsira o nome: ");
                String nome = sc.nextLine();
                System.out.print("Insira sua matrícula: ");
                String matricula = sc.nextLine();
                System.out.print("Insira a primeira nota: ");
                double nota1 = sc.nextDouble();
                System.out.print("Insira a segunda nota: ");
                double nota2 = sc.nextDouble();
                System.out.print("Insira a terceira nota: ");
                double nota3 = sc.nextDouble();

                sc.nextLine();

                listAlunos.add(new Aluno(nome, matricula, nota1, nota2, nota3));
            }

            for(Aluno nome : listAlunos) {
                System.out.println(nome.status());
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
