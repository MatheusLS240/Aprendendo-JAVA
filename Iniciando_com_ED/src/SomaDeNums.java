import java.util.*;

public class SomaDeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int i = 0, numInput = 1, res = 0;

        while (true) {
            System.out.println("Insira o " + i + " valor (Digite 0 para sair)");
            numInput = sc.nextInt();

            if(numInput == 0) {
                break;
            }

            nums.add(numInput);
            i++;
        }

        for(int num : nums) {
            res = res + num;
        }

        res = res / nums.size();

        System.out.println("A média de todos os números inseridos é: " + res);

    }
}
