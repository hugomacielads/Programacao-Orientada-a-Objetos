public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    // Construtor
    public Cliente(){

    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Realizando depósito
    public void depositar(float x){
        this.saldo += x;
    }

    // Sacar valor X
    public void sacar(float x){
        if (this.saldo - x >= 0){
            this.saldo -= x;
        } else {
            System.out.println(("Saldo insuficiente"));
        }
    }

    // Retorna dados do cliente
    public String dadosCliente(){
        return "Número da Agência: " + this.numeroAgencia + " Número da conta: " + this.numeroConta + "Saldo Atual: " + this.saldo;
    }
}
