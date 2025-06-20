import java.util.*;

public class AprendendoMap {
    public static void main(String[] args) {
        // Map<String, Integer> pessoas = new HashMap<>()
        // Map<String, Integer> pessoas = new LinkedHashMap<>();
        Map<String, Integer> pessoas = new TreeMap<>();

        pessoas.put("Matheus", 16);
        pessoas.put("Ana", 24);
        pessoas.put("Jefferson", 32);

        System.out.println(pessoas.get("Matheus"));

        for(Map.Entry<String, Integer> pessoa : pessoas.entrySet()) {
            System.out.println(pessoa.getKey() + " === " + pessoa.getValue());
        }
    }
}

// Map = Estrutura que armazena pares chave-valor (key-value).
//       Cada chave é única, mas os valores podem se repetir.

// HashMap = Chaves sem ordem garantida.
//           ✅ Mais rápido para buscas, inserções e remoções.
//           ❌ Não mantém a ordem de inserção.
//           Usa tabela de hash para gerenciar os pares.

// LinkedHashMap = Chaves com ordem de inserção preservada.
//                 ✅ Ideal quando a ordem importa (ex: cache FIFO).
//                 Desempenho levemente inferior ao HashMap,
//                 mas ainda muito eficiente.

// TreeMap = Chaves ordenadas pela ordem natural ou por um Comparator.
//           ✅ Útil quando precisa de ordenação automática das chaves.
//           ❌ Mais lento que HashMap e LinkedHashMap.
//           Baseado em árvore rubro-negra (estrutura de dados ordenada).
