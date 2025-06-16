package Iniciando_com_POO.Banco.src;

class App {
    public static void main(String[] args) {

        Banco a1 = new Banco();
        Banco b1 = new Banco();

        a1.createAccount("Fodase");
        b1.createAccount("Rafael");

        a1.deposit(1000);

        a1.transfer(200, b1, "Rafael");

    }
}