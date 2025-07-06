import java.util.Scanner;

public class TrianguloEquilatero1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o valor do lado: ");
        double lado = ler.nextDouble();
        
        double raiz = Math.sqrt(3);
        double raiz2 = raiz / 2;
        double raiz3 = raiz2 * lado;
        
        System.out.printf("O tamanho do triangulo equilatero é: %.2f", raiz3);

        ler.close();
    }
}