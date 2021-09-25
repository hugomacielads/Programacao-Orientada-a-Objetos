package prova1.prova0102;

import java.util.Date;

public class Pedido {
    
    private int codigo;
    private Date data;
    private Unidade unidade;
    private Cliente cliente;

    public Pedido() {
    }
    public Pedido(int codigo, Date data, Unidade unidade, Cliente cliente) {
        this.codigo = codigo;
        this.data = data;
        this.unidade = unidade;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Unidade getUnidade() {
        return unidade;
    }
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString(){
        return "Código: " + this.codigo + " /  Data: " + this.data + this.cliente.toString() + this.unidade.toString();
    }
}
