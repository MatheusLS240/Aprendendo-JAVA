import java.util.*;

public class AprendendoList {
    public static void main(String[] args) {
        // List<String> frutas = new ArrayList<>();
        List<String> frutas = new LinkedList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        String fruta = frutas.get(2);
        System.out.println(fruta);

        frutas.add(1, "Morango");

        System.out.println(frutas);
    }
}

// List = Estrutura que permite elementos duplicados e mantém a ordem de inserção.

// ArrayList =
//   - Baseado em array dinâmico.
//   - ✅ Acesso rápido por índice (get/set) → O(1)
//   - ❌ Lento para inserções/remoções no meio → precisa mover os elementos.
//   - Ideal para listas que sofrem poucas alterações e têm muitas leituras.

// LinkedList =
//   - Baseado em lista duplamente encadeada.
//   - ✅ Rápido para inserções/remoções no início/meio/fim → só ajusta ponteiros.
//   - ❌ Lento para acesso direto por índice → precisa percorrer a lista.
//   - Ideal para listas com muitas alterações (add/remove), e poucas leituras diretas por índice.