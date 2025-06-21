import java.util.*;

public class CadOrdProdutos {
    public static void main(String[] args) {
        List<String> lista = getLista();

        Collections.sort(lista);
        System.out.println(lista);
    }

    private static List<String> getLista() {
        return Arrays.asList("Camiseta", "Meia", "Luva", "Agasalho");
    }
}
