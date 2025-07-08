import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i = 1;
        boolean player = random.nextBoolean();
        String[][] tabuleiro = {{"-", "-", "-"},
                                {"-", "-", "-"},
                                {"-", "-", "-"}};

        exibirTabuleiro(tabuleiro);
        
        try {
            while(i < 9) {
                System.out.println("\nVez do jogador " + (player ? "O" : "X"));
                System.out.print("Digite a linha desejada: ");
                int linha = sc.nextInt();
                System.out.print("Digite a coluna: ");
                int coluna = sc.nextInt();

                if(linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
                    System.err.println("\nJogada inválida!");
                    continue;
                }
                
                linha--;
                coluna--;

                if(!tabuleiro[linha][coluna].equals("-")) {
                    System.err.println("\nCasa ja selecionada, por favor jogue novamente!");
                    continue;
                }
                

                tabuleiro[linha][coluna] = player ? "O" : "X";

                exibirTabuleiro(tabuleiro);

                player = !player;
                i++;
            }
        } catch (Exception e) {
            System.out.println("Sem inserir letras ou caracter ilegais!! Apenas números (1 até 3) / error: " + e.getMessage());
            sc.nextLine();
        }
    }

    private static void exibirTabuleiro(String[][] tabuleiro) {
        int i = 1;
        System.out.println("\n/ 1 2 3");
        for(String[] linha : tabuleiro) {
            System.out.print(i + " ");
            for(String coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
            i++;
        }
    }
}
