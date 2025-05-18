package Iniciando_com_REPETICAO.src;

public class MultiplosCincoTres {
    public static void main(String[] args) {
        final int MAX_VALOR = 500;
        int i = 0, j = 0;

        System.out.println("MULTIPLOS DE 5 E 3:");
        while (i <= MAX_VALOR && j <= MAX_VALOR) {
            System.out.print(i + " ");
            System.out.println(j + " ");
            i += 5;
            j += 3;
        }
    }
}
