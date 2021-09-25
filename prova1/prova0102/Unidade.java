package prova1.prova0102;

public class Unidade {
    
    private String cidade;
    private String estado;

    public Unidade() {
    }
    public Unidade(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString(){
        return " /  Cidade: " + this.cidade + " /  Estado: " + this.estado;
    }
}
