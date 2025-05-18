package Iniciando_com_JAVA.src;

public class TesteArray1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] nomes = {"João", "Maria", "José", "Ana", "Pedro"};
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        while (true) {
            System.out.println("Loop infinito");
        }
    }
}
