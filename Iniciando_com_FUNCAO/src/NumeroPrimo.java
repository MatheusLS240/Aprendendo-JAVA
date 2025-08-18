public class NumeroPrimo {
    public static boolean verificar(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean resultado = verificar(13);
        System.out.println("13 é primo? " + resultado);
    }
}