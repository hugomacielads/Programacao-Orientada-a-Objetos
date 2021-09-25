package prova1.prova0102;

import java.util.Date;

public class TestaPedido {
    
    public static void main(String args[]){
        // A unidade e o cliente é criado independente do pedido - agregação
        Unidade un1 = new Unidade("Franca", "São Paulo");
        Cliente cl1 = new Cliente("55.232.138-2", "Hugo Maciel");

        Pedido ped1 = new Pedido(1, new Date(), un1, cl1);

        System.out.println(ped1.toString());
    }
}
