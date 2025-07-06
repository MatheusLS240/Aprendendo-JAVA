import java.util.*;

class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Integer.compare(this.numero, outraConta.numero);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                '}';
    }
}

class TitularComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta conta, Conta outraConta) {
        return conta.getTitular().compareTo(outraConta.getTitular());
    }
}


public class ComparableComparator {
    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<>();
        TitularComparator comparator = new TitularComparator();
        Conta conta1 = new Conta(5452, "Phillip Lahm");
        Conta conta2 = new Conta(1234, "Lucas Podolski");
        Conta conta3 = new Conta(3145, "Arne Friedrich");

        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);

        lista.sort(comparator);

        System.out.println(lista);
    }
}
