package prova1.prova0103;

public class NaoMotorizado extends Veiculo {
    private String meioLocomocao;
    
    public NaoMotorizado(){
        super();
    }
    public NaoMotorizado(int ano, float preco, String desc, String meioLocomocao){
        super(ano, preco, desc);
        this.setMeioLocomocao(meioLocomocao);
    }

    public String getMeioLocomocao() {
        return meioLocomocao;
    }
    public void setMeioLocomocao(String meioLocomocao) {
        this.meioLocomocao = meioLocomocao;
    }

    @Override
    public String toString() {
        return "Meio Locomoção: " + this.meioLocomocao + super.toString();
    }
    
    @Override
    public void aumentarPreco() {
        float valor = 100;
        float aux = this.preco + valor;
        System.out.println("Preço total: " + aux);
        
    }

}
