public class SomaDeUmAteN {
    public static int calcular(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) soma += i;
        return soma;
    }

    public static void main(String[] args) {
        int resultado = calcular(10);
        System.out.println("Soma de 1 até 10: " + resultado);
    }
}