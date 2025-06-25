import java.time.LocalDate;
import java.util.*;

public class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.005;
    private int carenciaDias = 10;
    private double valorTotalRenda = this.getSaldo();


    public ContaPoupanca(String nome, String cpf, String email, long telefone, String senha) {
        super(nome, cpf, email, telefone);
        setSenha(senha);
        setNumConta((int) (Math.random() * 10000));
    }

    private void aplicarRendimentosMensais() {
        LocalDate hoje = LocalDate.now();
        if(getUltimaAtualizacao().plusMonths(1).isBefore(hoje) || getUltimaAtualizacao().plusMonths(1).equals(hoje)) {
            valorTotalRenda = valorTotalRenda * taxaRendimento;
        }
    }

    private boolean verificarCarenciaDias() {
        LocalDate hoje = LocalDate.now();
        if(getUltimaAtualizacao().plusDays(carenciaDias).isBefore(hoje) || getUltimaAtualizacao().plusDays(carenciaDias).equals(hoje)) {
            return true;
        } else {
            int diasRestantes = hoje.getDayOfMonth() - carenciaDias;
            return false;
        }
    }

    private void resgatarRendimentosMensais() {
        if(verificarCarenciaDias()) {
            setSaldo(this.getSaldo() + valorTotalRenda);
            System.out.println("Valor do saque realizado com sucesso!");
        }
    }
}
