public class MaiorNumero {
    public static int calcular(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int resultado = calcular(10, 20);
        System.out.println("Maior: " + resultado);
    }
}