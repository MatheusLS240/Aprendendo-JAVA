package Iniciando_com_REPETICAO.src;

import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog("Insira um número");
        int num = Integer.parseInt(numString);
        int calc = 1, calc2 = 1;

        while (calc <= num) {
            System.out.println(calc);
            System.out.println(calc2);
            calc += calc2;
            calc2 += calc;
        }
    }
}
