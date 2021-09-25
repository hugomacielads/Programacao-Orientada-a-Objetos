package prova1.prova0103;

public class Motorizado extends Veiculo {
    private float potencia;
    private String combust;

    public Motorizado(){
        super();
    }
    public Motorizado(int ano, float preco, String desc, float potencia, String combust){
        super(ano, preco, desc);
        this.setPotencia(potencia);
        this.setCombust(combust);
    }

    public float getPotencia() {
        return potencia;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getCombust() {
        return combust;
    }
    public void setCombust(String combust) {
        this.combust = combust;
    }

    @Override
    public String toString(){
        return "Potência: " + this.potencia + " |  Combustível: " + this.combust + super.toString();
    }

    @Override
    public void aumentarPreco() {
        float valor = 1000;
        float aux = this.preco + valor;
        System.out.println("Preço total: " + aux);
        
    }

    
    
}
