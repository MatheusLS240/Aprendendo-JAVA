import java.util.Random;

public class POO_Banco {
    int numberAccount = 0;
    String ownerAccount;
    double balanceAccount;
    Random geradorNumberAccount = new Random();

    // Criação da conta
    boolean createAccount(String owner) {
        if (numberAccount == 0) {
            numberAccount = geradorNumberAccount.nextInt(1000) + 1;
            ownerAccount = owner;
            System.out.println("Conta criada com sucesso! Número: " + numberAccount);
            return true;
        }
        System.out.println("Erro: Conta já existe!");
        return false;
    }

    // Depósito
    boolean deposit(double amount) {
        if (numberAccount == 0) {
            System.out.println("Erro: Conta inexistente! Crie uma conta primeiro.");
            return false;
        }
        if (amount > 0) {
            balanceAccount += amount;
            System.out.println("Depósito de R$ " + amount + " realizado com sucesso.");
            return true;
        }
        System.out.println("Erro: Valor inválido para depósito.");
        return false;
    }

    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    // Saque
    boolean withdraw(double amount) {
        if (numberAccount == 0) {
            System.out.println("Erro: Conta inexistente! Crie uma conta primeiro.");
            return false;
        }
        if (amount > 0 && balanceAccount >= amount) {
            balanceAccount -= amount;
            System.out.println("Saque de R$ " + amount + " realizado com sucesso.");
            return true;
        }
        System.out.println("Erro: Saldo insuficiente!");
        return false;
    }

    // Transferência
    boolean transfer(double amount, POO_Banco targetAccount, String targetAccountOwner) {
        if (numberAccount == 0 || targetAccount.numberAccount == 0) {
            System.out.println("Erro: Conta de origem ou destino não foi criada.");
            return false;
        }


        if (this.ownerAccount.equals(targetAccountOwner)) {
            System.out.println("Erro: O destinatário não pertence ao mesmo dono da conta.");
            return false;
        }

        if (withdraw(amount)) {
            targetAccount.deposit(amount);
            System.out.println("Transferência de R$ " + amount + " realizada com sucesso.");
            return true;
        }
        return false;
    }

    // Empréstimo
    boolean loan(double amount) {
        if (numberAccount == 0) {
            System.out.println("Erro: Conta inexistente!");
            return false;
        }
        if (balanceAccount > 1000) {
            deposit(amount);
            System.out.println("Empréstimo de R$ " + amount + " concedido.");
            return true;
        }
        System.out.println("Erro: Saldo insuficiente para empréstimo.");
        return false;
    }

    // Saldo da conta
    void printBalance() {
        if (numberAccount == 0) {
            System.out.println("Erro: Conta inexistente!");
        }
        System.out.println("Saldo: R$ " + balanceAccount);
    }

    // Número da conta
    void printNumberAccount() {
        if (numberAccount == 0) {
            System.out.println("Erro: Conta inexistente!");
        }
        System.out.println("Número da conta: " + numberAccount);
    }

    void printName() {
        if (numberAccount == 0) {
            System.out.println("Erro: Conta inexistente!");
        }
        System.out.println("Proprietário da conta: " + ownerAccount);
    }
}
