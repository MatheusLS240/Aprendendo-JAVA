import java.util.*;

public class AprendendoSet {
    private int code;
    private String nome;

    public AprendendoSet(int code, String nome) {
        this.code = code;
        this.nome = nome;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Code: " + code + " Nome: " + nome + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AprendendoSet aprendendoSet = (AprendendoSet) o;
        return code == aprendendoSet.code;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    public static void main(String[] args) {
        // Set<MainSet> animais = new HashSet<>();
        // Set<MainSet> animais = new LinkedHashSet<>();
        Set<AprendendoSet> animais = new TreeSet<>(Comparator.comparing(AprendendoSet::getNome));
        animais.add(new AprendendoSet(1, "Cachorro"));
        animais.add(new AprendendoSet(2, "Gato"));
        animais.add(new AprendendoSet(3, "Cavalo"));
        animais.add(new AprendendoSet(4, "Coelho"));

        System.out.println(animais);
        System.out.println(animais.contains(new AprendendoSet(5, "Cachorro")));

        AprendendoSet animalEncontrado = null;

        for(AprendendoSet animal : animais) {
            if(animal.getNome().equals("Cachorro")) {
                animalEncontrado = animal;
                System.out.println(animalEncontrado);
            }
        }
    }
}

// Set = Estrutura que não permite elementos duplicados

// HashSet = Sem repetição e sem ordem garantida.
//           Mais rápido para operações de busca, adição e remoção,
//           pois usa tabela de hash internamente.

// LinkedHashSet = Sem repetição e mantém a ordem de inserção.
//                 Mais rápido que TreeSet para adição/remoção,
//                 mas um pouco mais lento que HashSet.

// TreeSet = Sem repetição e ordenado de forma "natural" (por Comparable)
//           ou por Comparator. Ideal quando você precisa manter os
//           elementos ordenados (ex: encontrar o maior/menor elemento).