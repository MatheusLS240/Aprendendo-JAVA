public class InverterPalavra {
    public static String inverter(String palavra) {
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        return invertida;
    }

    public static void main(String[] args) {
        String resultado = inverter("Java");
        System.out.println("Invertida: " + resultado);
    }
}