public class MediaArray {
    public static double calcular(int[] arr) {
        int soma = 0;
        for (int num : arr) soma += num;
        return (double) soma / arr.length;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};
        double resultado = calcular(numeros);
        System.out.println("Média: " + resultado);
    }
}