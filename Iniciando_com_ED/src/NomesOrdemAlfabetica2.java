
import java.util.Scanner;

public class NomesOrdemAlfabetica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        String[] nomes2 = new String[10];

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

        int j = (nomes.length - 1);
        for (int i = 0; i < nomes.length; i++) {
            nomes2[i] = nomes[j];
            j--;
        }

        System.out.println("------");
        
        for (String nome : nomes2) {
            System.out.println(nome);
        }
    }
}
