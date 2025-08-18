public class MDC {
    public static int calcular(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int resultado = calcular(48, 18);
        System.out.println("MDC: " + resultado);
    }
}