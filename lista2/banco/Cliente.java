package lista2.banco;

public class Cliente {
    private String numeroConta, numeroAgencia;
    private float saldo;
    private String nome;

    public Cliente(){

    }
    public Cliente(String numeroConta, String numeroAgencia, float saldo, String nome){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setSaldo(saldo);
        this.setNome(nome);
    }

    public final void setNumeroConta(String numeroConta){
        if (numeroConta.length() == 8) && (numeroConta.charAt(6) == '-'){
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Número da conta inválida");
        }
    }

    public final void setNumeroAgencia(String numeroAgencia){

    }

    public final void setSaldo(float saldo){

    }

    public final void setNome(String saldo){

    }
    
}
