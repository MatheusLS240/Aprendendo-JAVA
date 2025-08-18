public class ArrayCrescente {
    public static boolean verificar(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        boolean resultado = verificar(numeros);
        System.out.println("\nArray está em ordem crescente? " + resultado);
    }
}