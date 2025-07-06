import java.text.*;
import javax.swing.*;

public class Polegadas1 {
    public static void main(String[] args) {
        ImageIcon img1 = new ImageIcon("Iniciando_com_JAVA/img/img1.jpeg");
        DecimalFormat formatar = new DecimalFormat("#.##");

        String num1String = JOptionPane.showInputDialog(null, "Insira o valor da largura em cm", "Cálculo de polegadas", JOptionPane.WARNING_MESSAGE);
        String num2String = JOptionPane.showInputDialog(null, "Insira o valor da altura em cm", "Cálculo de polegadas", JOptionPane.WARNING_MESSAGE);

        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);

        num1 = Math.pow(num1, 2);
        num2 = Math.pow(num2, 2);
        num1 += num2;
        num1 = Math.sqrt(num1);
        num1 /= 2.54;

        JOptionPane.showMessageDialog(null, "O resultado é " + formatar.format(num1), "Calculo de Poelgadas", JOptionPane.PLAIN_MESSAGE, img1);
    }
}
