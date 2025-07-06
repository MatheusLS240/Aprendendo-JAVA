package Iniciando_com_REPETICAO.src;


import java.text.DecimalFormat;
import java.util.Scanner;

public class EntrarNEImprimirH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        double i = 2, res = -1;

        System.out.print("Insira um valor: ");
        double num = sc.nextInt();

        do {
            if(i % 2 == 0) {
                res += 1 / i;
                System.out.println(df.format(res * -1));
            } else {
                res -= 1 / i;
                System.out.println(df.format(res * -1));
            }

            i++;
        } while(i <= num);
    }
}