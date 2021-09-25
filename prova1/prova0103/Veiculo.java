package prova1.prova0103;

public abstract class Veiculo {
    
    protected int ano;
    protected float preco;
    protected String desc;

    public Veiculo() {
    }
    public Veiculo(int ano, float preco, String desc) {
        this.ano = ano;
        this.preco = preco;
        this.desc = desc;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString(){
        return "Ano: " + this.ano + " |  Preço: " + this.preco + " | Descrição: " + this.desc;
    }

    public abstract void aumentarPreco();
}
