package lista4.imobiliaria;

public class Casa extends Moradia {
    
    private float tamQuintal;
    private boolean piscina;
    public Casa(){
        super();
    }
    public Casa(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina) {
        super(endereco, cidade, tamanho);
        this.tamQuintal = tamQuintal;
        this.piscina = piscina;
    }
    

    public float getTamQuintal() {
        return tamQuintal;
    }


    public void setTamQuintal(float tamQuintal) {
        this.tamQuintal = tamQuintal;
    }


    public boolean isPiscina() {
        return piscina;
    }


    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override // anulação
    public String toString(){
        return super.toString() + " |  Quintal: " + this.tamQuintal + " |  Tem piscina: " + this.piscina;
    }

    @Override
    public void calcularPreco() {
        float aux;
        aux = (this.tamanho * 500) + (this.tamQuintal * 100);
        if (this.piscina) {
            aux = aux + 1000;
        }
        System.out.println("Valor da casa é de " + aux);
    }

    
}
