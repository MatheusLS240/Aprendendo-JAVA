public class ConcatenarStrings {
    public static String unir(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        String resultado = unir("Olá, ", "Mundo!");
        System.out.println("Concatenado: " + resultado);
    }
}