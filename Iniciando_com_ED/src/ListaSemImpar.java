import java.util.*;

public class ListaSemImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int i = 0;

        while (true) {
            int num = 0;
            System.out.print("Insira o " + i + " número (digite 0 para sair): ");
            num = sc.nextInt();
            if(num == 0) {
                break;
            }
            lista.add(num);
            i++;
        }

        lista.removeIf(n ->(n % 2 != 0));

        System.out.println(lista);

        sc.close();
    }
}
