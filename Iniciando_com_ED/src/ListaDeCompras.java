import java.util.*;

public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaDeCompras = new ArrayList<>();
        int i = 1;
        String item = "";

        while(!item.equalsIgnoreCase("sair")) {
            System.out.println("Insira o " + i + " item da sua lista (digite 'sair' para encerrar))");
            item = sc.nextLine();
            listaDeCompras.add(item);
            i++;
        }

        sc.close();
    }
}
