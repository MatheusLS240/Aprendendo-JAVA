public class Fatorial {
    public static int calcular(int n) {
        int fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        int resultado = calcular(5);
        System.out.println("Fatorial de 5: " + resultado);
    }
}