package lista1;
public class TestaCarro {
    
    // vamos criar os objetos
    // vamos criar o método main
    public static void main(String args[]){
        System.out.println("Hello word! - Hugo Maciel");

        // Criando um carro
        Carro obj1 = new Carro("Onix", 2019, true, 30);

        Carro obj2 = new Carro();
        obj2.modelo = "Agile";
        obj2.ano = 2016;
        obj2.motor = true;
        obj2.velocidade = 50;

        // Criando método ou operação
        obj1.mostra();
        obj2.mostra();
    }
}
