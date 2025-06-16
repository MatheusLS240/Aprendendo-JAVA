package Iniciando_com_REPETICAO.src;

public class Soma25E200 {
    public static void main(String[] args) {
        int res = 0, i = 25;

        do {
            if (i % 2 == 0) {
                res += i;
                System.out.println(res);
            }
            i++;
        } while (i <= 201);
    }
}