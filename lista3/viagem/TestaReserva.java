package lista3.viagem;

import java.util.Date;

public class TestaReserva {
    
    public static void main(String args[]){
        Passageiro pas1 = new Passageiro("55.232.138-2", "196.318.968-03", "Pedro");

        Voo voo1 = new Voo(123, "Congonhas", "Galeão", new Date());

        Reserva re1 = new Reserva(3, new Date(), 3600, pas1, voo1);

        System.out.println(re1.toString());
    }
}
