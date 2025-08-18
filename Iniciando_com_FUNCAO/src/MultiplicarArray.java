public class MultiplicarArray {
    public static int[] multiplicar(int[] arr) {
        int[] novoArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            novoArr[i] = arr[i] * 2;
        }
        return novoArr;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        int[] resultado = multiplicar(numeros);
        System.out.print("Array multiplicado: ");
        for (int num : resultado) System.out.print(num + " ");
    }
}