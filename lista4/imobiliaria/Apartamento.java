package lista4.imobiliaria;

public class Apartamento extends Moradia {

    private int nro, andar;

    public Apartamento() {
        super();
    }
    public Apartamento(String endereco, String cidade, float tamanho, int nro, int andar) {
        super(endereco, cidade, tamanho);
        this.setNro(nro);
        this.setAndar(andar);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
    
    @Override
    public String toString() {
        return super.toString() + " |  Número: " + this.nro + " |  Andar: " + this.andar;
    }

    @Override
    public void calcularPreco() {
        float aux = (this.tamanho*800);
        if (this.nro % 2 == 0) {
            aux = aux + 200;
        }
        else {
            aux = aux + 300;
        }
        if (this.andar >= 3){
            aux = aux + 2000;
        }
        System.out.println("O valor do apto é de " + aux);
    }
}
