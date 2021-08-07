public class Produto {
    public int id;
    public int qtde;
    public String desc;
    public float preco;

    // Construtor
    public Produto(){

    }
    public Produto(int id, int qtde, String desc, float preco){
        this.id = id;
        this.qtde = qtde;
        this.desc = desc;
        this.preco = preco;
    }

    public void compra(int x){
        this.qtde += x;
    }

    public void vender(int x){
        this.qtde -= x;
    }

    public void subir(float x){
        this.preco += x;
    }

    public void descer(float x){
        this.preco -= x;
    }

    public String mostra(){
        return String.format("Nome %s Quantidade: %d Preço %.2f", this.desc, this.qtde, this.preco);
    }
}
