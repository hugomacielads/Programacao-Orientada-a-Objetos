package lista3.venda;

public class ItemVenda {
    private int codigo;
    private String nome;
    private int qtde;
    private float valor;

    public ItemVenda() {
    }

    public ItemVenda(int codigo, String nome, int qtde, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Código:" + this.codigo + " /  Nome:" + this.nome + " /  Quantidade:" + this.qtde + " /  Valor:" + this.valor;
    }
}
