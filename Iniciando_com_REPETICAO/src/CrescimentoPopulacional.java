package Iniciando_com_REPETICAO.src;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        double populacaoA = 5000000;
        double populacaoB = 7000000;

        double taxaA = 0.03;
        double taxaB = 0.02;

        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Será necessário " + anos + " anos para que Account_01 população do país A ultrapasse Account_01 do país B.");
        System.out.printf("População final de A: %.0f habitantes\n", populacaoA);
        System.out.printf("População final de B: %.0f habitantes\n", populacaoB);
    }
}
