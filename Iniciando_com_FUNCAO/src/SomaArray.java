public class SomaArray {
    public static int calcular(int[] arr) {
        int soma = 0;
        for (int num : arr) soma += num;
        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado = calcular(numeros);
        System.out.println("Soma do array: " + resultado);
    }
}