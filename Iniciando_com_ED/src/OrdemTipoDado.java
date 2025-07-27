import java.util.Scanner;

public class OrdemTipoDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] lista = {"1", "matheus", "a", "-2", "0.5"};

        for(int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if(compararStrings(lista[i], lista[j]) < 0) {
                    String temp = lista[j];
                    lista[j] = lista[i];
                    lista[i] = temp;
                }
            }
        }

        for (String s : lista) {
            System.out.println(s);
        }
    }

    private static int compararStrings(String letra1, String letra2) {
        int menorString = Math.min(letra1.length(), letra2.length());

        for (int i = 0; i < menorString; i++) {
            if (letra1.charAt(i) != letra2.charAt(i)) {
                return letra1.charAt(i) - letra2.charAt(i);
            }
        }

        return letra1.length() - letra2.length();
    }
}
