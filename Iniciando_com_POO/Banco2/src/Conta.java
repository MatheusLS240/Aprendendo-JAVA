import java.time.*;
import java.util.*;

// Classe abstrata base para contas bancárias
abstract class Conta extends Cliente {
    private int numConta = 0;
    private String clienteAssociado = getNome();
    private double saldo = 0.00;
    private String senha = null;
    private LocalDate ultimaAtualizacao = LocalDate.now();

    public Conta(String nome, String genero,String cpf, String email, long telefone) {
        super(nome, genero, cpf, email, telefone);
    }

    // Depósito com validação de valor mínimo
    public void depositar(Scanner sc) {
        System.out.print("Perfeito! Insira o valor do deposito: ");
        double valor = sc.nextDouble();
        if(valor >= 1) {
            this.saldo = this.saldo + valor;
            System.out.printf("\n💰 Depósito de %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Erro ao depositar, por favor, tentar mais tarde.");
        }
    }

    // Saque com validação de saldo e valor mínimo
    public void sacar(Scanner sc) {
        System.out.print("Perfeito! Insira o valor do saque: ");
        double valor = sc.nextDouble();
        if(valor <= this.saldo && valor >= 1) {
            this.saldo = this.saldo - valor;
            System.out.printf("\n💸 Saque de %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.printf("Erro no saque, por favor, tente novamente mais tarde.");
        }
    }

    // Transferência entre contas
    public void transferir(Scanner sc, Map<Integer, Conta> listaDeContas) {
        boolean contaEncontrada = false;
        System.out.print("Perfeito! Insira o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Agora, insira o valor: ");
        double valor = sc.nextDouble();

        for (Map.Entry<Integer, Conta> entry : listaDeContas.entrySet()) {
            if(numero == entry.getValue().numConta) {
                contaEncontrada = true;
                if(this.saldo >= 1) {
                    this.saldo = this.saldo - valor;
                    entry.getValue().setSaldo(valor);
                    System.out.println("\n🔄 Transferência realizada com sucesso!");
                } else {
                    System.out.println("\n❌ Saldo insuficiente!");
                }
                break;
            }
        }

        if(!contaEncontrada) {
            System.out.println("\n❌ Conta de destino não encontrada, tente novamente!");
        }

    }

    // Getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getClienteAssociado() {
        return clienteAssociado;
    }

    public void setClienteAssociado(String clienteAssociado) {
        this.clienteAssociado = clienteAssociado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDate ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public abstract void sacar(double valor);
}
