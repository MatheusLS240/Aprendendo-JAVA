public class MaiorArray {
    public static int encontrar(int[] arr) {
        int maior = arr[0];
        for (int num : arr) {
            if (num > maior) maior = num;
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 10, 3, 8};
        int resultado = encontrar(numeros);
        System.out.println("Maior valor: " + resultado);
    }
}