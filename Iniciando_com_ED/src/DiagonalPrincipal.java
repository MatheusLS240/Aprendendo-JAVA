import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz quadrada: ");
        int tamanho = sc.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
