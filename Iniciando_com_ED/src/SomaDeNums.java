import java.util.*;

public class SomaDeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> nums = new ArrayList<>();
        double numInput = 1, res = 0.00;
        int i = 1;


        while (true) {
            System.out.println("Insira o " + i + "º valor (Digite 0 para sair)");
            numInput = sc.nextDouble();

            if(numInput == 0) {
                break;
            } else {
                nums.add(numInput);i++;
            }
        }

        if(!nums.isEmpty()) {
            res = nums.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0.00);

        } else {
            System.out.println("Nenhum número foi inserido. Média impossível, meu chapa.");
        }

        System.out.println("A média de todos os números inseridos é: " + res);

        sc.close();
    }
}
