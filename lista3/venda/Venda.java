package lista3.venda;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private int codigo;
    private float valorTotal;
    private Date data;
    // Array List (vetor)
    private ArrayList<ItemVenda> itens;

    public Venda(){ // Construtor sem parametro
        this.setItens(new ArrayList<ItemVenda>());
    }
    public Venda(int codigo, float valorTotal, Date data){
        this.setCodigo(codigo);
        this.setValorTotal(valorTotal);
        this.setData(data);
        this.setItens(new ArrayList<ItemVenda>());
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    // adicionar um item de venda - composição
    public void addItemVenda(int codigo, String nome, int qtde, float valor){
        this.itens.add(new ItemVenda(codigo, nome, qtde, valor));
    }

    // Adicionar um item de venda - agregação
    // public void addItemVenda(ItemVenda itemVenda){
    //    this.itens.add(itemVenda);
    // }

    public String toString(){
        return "Código:" + this.codigo + " /  Valor Total: " + this.valorTotal + " /  Data:" + this.data + "\nItens da Venda:" + this.itens.toString();
    }
}
