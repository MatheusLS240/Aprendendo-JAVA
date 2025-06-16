package Iniciando_com_REPETICAO.src;

public class Tabuada7 {
    public static void main(String[] args) {
        double res = 0, i = 1;

        do {
            res = 7 * i;
            System.out.println(i+" * 7 = "+res);
            i++;
        } while(i <= 10);
    }
}