import java.util.*;

public class LoginConta {
    // -- Login --
    public static void loginConta(Scanner sc, Map<Integer, Conta> listaDeContas) {
        try {
            System.out.print("Insira o número da conta: ");
            long num = sc.nextLong();
            sc.nextLine();
            System.out.print("Insira a sua senha: ");
            String senha = sc.nextLine();

            for(Map.Entry<Integer, Conta> conta : listaDeContas.entrySet()) {
                if(conta.getKey() == num && conta.getValue().getSenha().equals(senha)) {
                    System.out.println("podepa");
                }
                else {
                    System.out.println("Número de conta ou senha incorreta");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}