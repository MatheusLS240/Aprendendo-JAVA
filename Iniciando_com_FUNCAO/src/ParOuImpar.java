public class ParOuImpar {
    public static String verificar(int n) {
        return (n % 2 == 0) ? "Par" : "Ímpar";
    }

    public static void main(String[] args) {
        String resultado = verificar(7);
        System.out.println("Número 7 é: " + resultado);
    }
}