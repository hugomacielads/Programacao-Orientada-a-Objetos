package prova1.prova0102;

public class Cliente {
    
    private String rg;
    private String nome;

    public Cliente() {
    }
    public Cliente(String rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return " /  RG: " + this.rg + " /  Nome: " + this.nome;
    }
}
