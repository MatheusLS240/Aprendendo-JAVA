public class MaiorPalavra {
    public static String encontrar(String[] palavras) {
        String maior = palavras[0];
        for (String p : palavras) {
            if (p.length() > maior.length()) maior = p;
        }
        return maior;
    }

    public static void main(String[] args) {
        String[] palavras = {"Java", "Programacao", "Funcoes"};
        String resultado = encontrar(palavras);
        System.out.println("Maior palavra: " + resultado);
    }
}