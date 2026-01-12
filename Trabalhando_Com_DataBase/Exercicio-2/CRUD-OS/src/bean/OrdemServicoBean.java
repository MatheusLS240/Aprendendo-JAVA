package bean;

import java.time.*;

public class OrdemServicoBean {
    private String cliente;
    private String endereco;
    private String cpf;
    private String telefone;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    private String descriminacao;
    private double total;
    private double valorPago;
    private double valorRestando;

    public OrdemServicoBean(String cliente, String endereco, String cpf, String telefone,
                            LocalDate dataEntrega, String descriminacao, double total, double valorPago) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataPedido = null;
        this.dataEntrega = dataEntrega;
        this.descriminacao = descriminacao;
        this.total = total;
        this.valorPago = valorPago;
        this.valorRestando = 0;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDescriminacao() {
        return descriminacao;
    }

    public void setDescriminacao(String descriminacao) {
        this.descriminacao = descriminacao;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorRestando() {
        return valorRestando;
    }

    public void setValorRestando(double valorRestando) {
        this.valorRestando = valorRestando;
    }
}
