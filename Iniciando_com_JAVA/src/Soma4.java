import java.util.Scanner;

public class Soma4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira uma numero: (LEMRANDO SE VOCÊ INSERIR POR EXEMPLO 25, O RESULTADO SERA 7 (2+5))");
        int num = ler.nextInt();
        int res1 = num / 10;
        int res2 = num % 10;

        res1 += res2;

        System.out.println(res1);

        ler.close();
    }
}
