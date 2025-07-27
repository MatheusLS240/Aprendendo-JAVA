
import java.util.Scanner;

public class NomesOrdemAlfabetica {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i ++) {
            System.out.printf("Insira o %d nome:", i);
            nomes[i] = sc.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
                    String temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }

        System.out.println("------");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
