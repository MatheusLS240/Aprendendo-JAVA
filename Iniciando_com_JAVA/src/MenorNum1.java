import java.util.Scanner;

public class MenorNum1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número: ");
        double num1 = ler.nextInt();

        System.out.println("Insira outro número: ");
        double num2 = ler.nextInt();

        System.out.println("Insira o ultimo número: ");
        double num3 = ler.nextInt();

        menor(num1, num2, num3);

        ler.close();
    }

    public static void menor(double a, double b, double c){
        if(a < b && a < c){
            System.out.println("O menor número é: " + a);
        } else if(b < a && b < c){
            System.out.println("O menor número é: " + b);
        } else {
            System.out.println("O menor número é: " + c);
        }
    }
}
