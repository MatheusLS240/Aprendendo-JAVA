public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {{10, 11, 12, 13, 14},
                          {15, 16, 17, 18, 19},
                          {20, 21, 22, 23, 24},
                          {25, 26, 27, 28, 29},
                          {30, 31, 32, 33, 34}};

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
