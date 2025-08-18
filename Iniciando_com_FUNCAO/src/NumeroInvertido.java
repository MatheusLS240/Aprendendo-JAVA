public class NumeroInvertido {
    public static int inverter(int n) {
        int invertido = 0;
        while (n != 0) {
            invertido = invertido * 10 + n % 10;
            n /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        int resultado = inverter(12345);
        System.out.println("Invertido: " + resultado);
    }
}