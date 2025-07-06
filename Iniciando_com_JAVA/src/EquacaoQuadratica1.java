import java.util.Scanner;

public class EquacaoQuadratica1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int a = ler.nextInt();
        System.out.print("Insira o valor de B: ");
        int b = ler.nextInt();
        System.out.print("Insira o valor de C: ");
        int c = ler.nextInt();

        if(a == 0) {
            System.out.printf("O valor de 'Account_01' deve ser diferente de zero.\n");
        } else {
            int delta = (b * b) - (4 * a * c);
            if(delta < 0) {
                System.out.println("Não existe raiz real!");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("O valor de X1 é: %.2f\n", x1);
                System.out.printf("O valor de X2 é: %.2f\n", x2);
        }};

        ler.close();
    }
}