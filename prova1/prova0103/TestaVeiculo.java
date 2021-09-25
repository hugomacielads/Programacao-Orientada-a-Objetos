package prova1.prova0103;

public class TestaVeiculo {
    
    public static void exemploPolimorfismo(Veiculo camaleao){
        System.out.println(camaleao.toString());
        camaleao.aumentarPreco();
    }

    public static void main(String args[]){
        
        Motorizado mot1 = new Motorizado(1990, 5000, "Fusca", 1, "Gasolina");
        // Aumentando 1000 reais nos veículos Motorizados
        exemploPolimorfismo(mot1);

        NaoMotorizado nmot1 = new NaoMotorizado(2007, 1500, "Aero", "Bicicleta");
        // Aumentando 100 reais nos veículos Não Motorizados
        exemploPolimorfismo(nmot1);
    }
}
