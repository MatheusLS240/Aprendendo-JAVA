public class NumsAleatorioAsc {
    public static void main(String[] args)  {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 1000); 
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n----");

        for (int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros.length; j++) {
                if(numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        for(int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
