public class SemRepetidos {
    public static void main(String[] args) {
        int quantidadeDeNums = 10;
        int numMax = 100;
        int[] array = new int[quantidadeDeNums];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * numMax);
            for(int j = 0; j < i; j++) {
                if(array[i] == array[j]) {
                    i -= 1;
                    break;
                }
            }
        }
        
        for(int i = 1; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[i]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        
        System.out.println("Sequencia de números geradas:");
        for(int num : array) {
            System.out.printf("%d ", num);
        }
    
        int maiorPosicao = array.length - 1;    
        System.out.printf("\nMaior número: %d", array[maiorPosicao]);
        
        System.out.printf("\nMenor número: %d", array[0]);

    }
}
