public class App {
    public static void main(String[] args) {

        POO_Banco a1 = new POO_Banco();
        POO_Banco b1 = new POO_Banco();

        a1.createAccount("Fodase");
        b1.createAccount("Rafael");

        a1.deposit(1000);

        a1.transfer(200, b1, "Rafael");

    }
}