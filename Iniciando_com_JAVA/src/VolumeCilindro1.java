import java.util.Scanner;

public class VolumeCilindro1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira o valor do raio: ");
        double raio = ler.nextDouble();
        
        System.out.print("Insira o valor do altura: ");
        double altura = ler.nextDouble();
       
        double res = 3.14159 * raio * raio * altura;
        System.out.printf("O volume do cilindro é: %.2f", res);

        ler.close();
    }
}