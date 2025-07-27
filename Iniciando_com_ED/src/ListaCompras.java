
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("-- Lista de compras --");
        System.out.print("\nInsira a quantidade de itens desejada: ");
        int quantidadeItens = sc.nextInt();
        sc.nextLine();
        String[] lista = new String[quantidadeItens];

        for(int i = 0; i < lista.length; i++) {
            System.out.printf("Insira o item %d da lista: ", i + 1);
            lista[i] = sc.nextLine();
        }

        int j = 0;
        while(true){ 
            System.out.println("\n-- Itens da adicionado na lista --");
            for(int i = 0; i < lista.length; i++) {
                System.out.println(i + 1 + " - " +  lista[i]);
            }

            System.out.print("\nDeseja remover algum item? ");
            String opcao = sc.nextLine();

            if(opcao.equalsIgnoreCase("sim")) {
                System.out.print("Qual indice deseja remover? ");
                int indice = sc.nextInt();
                lista[(indice - 1)] = "";
                j++;
                if(j == lista.length) {
                    System.out.println("\nTodos os itens removidos! Encerrando.");
                    System.exit(0);
                }
            }
        }
    }
}
