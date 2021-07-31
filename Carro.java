
public class Carro {

    // dois tipos de variáveis
    // 1 - Tipo primitivo: int, float, double, char
    // 2 - Tipo de classe: String, Float, Double, Integer

    // Propriedades (variáveis da classe)
    float velocidade; // número com ponto flutuante
    boolean motor; // booleana - true (ligado) ou false (desligado)
    int ano;
    String modelo; // String é uma classe pronta - cj de caracteres

    // Criando método construtor
    public Carro(String modelo, int ano, boolean motor, float velocidade){
        // variável do objeto = variável do usuário
        // this representa o objeto sendo criado
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velocidade = velocidade;
    }

    // Criando método construtor vazio
    public Carro(){
        
    }

    // Criando método de operação
    public void mostra(){
        // Utilizando this. para que o objeto instanciado passe pela função
        System.out.println("Obj1: Modelo: " + this.modelo + " Ano: " + this.ano + " Vel: " + this.velocidade);
    }
}