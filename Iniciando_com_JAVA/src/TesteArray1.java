public class TesteArray1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] nomes = {"João", "Maria", "José", "Ana", "Pedro"};
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
        while (true) {
            System.out.println("Loop infinito");
        }
    }
}
