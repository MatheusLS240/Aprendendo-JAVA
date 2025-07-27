public class CemMiLMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[9][100];
        int k = 100;
        
        for(int i = 0; i < 9; i++)  {
            for (int j = 0; j < 100; j++) {
                matriz[i][j] = k;
                System.out.print(matriz[i][j] + " ");
                k++;
            }
            System.out.println();
        }
    }
}
