public class Fibonacci {
    public static int[] gerar(int n) {
        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static void main(String[] args) {
        int[] resultado = gerar(10);
        System.out.print("Fibonacci: ");
        for (int num : resultado) System.out.print(num + " ");
    }
}