public class NumeroPerfeito {
    public static boolean verificar(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) soma += i;
        }
        return soma == n;
    }

    public static void main(String[] args) {
        boolean resultado = verificar(28);
        System.out.println("28 é perfeito? " + resultado);
    }
}