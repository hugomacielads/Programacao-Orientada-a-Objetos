package lista4.imobiliaria;

public class Testa {
    
    public static void exemploPolimorfismo(Moradia camaleao){
        System.out.println(camaleao.toString());
        camaleao.calcularPreco();
    }

    public static void main(String args[]){
        Casa casa1 = new Casa("Rua Linda", "Franca", 150, 50, true);
        // System.out.println(casa1.toString());
        exemploPolimorfismo(casa1);

        Apartamento ap1 = new Apartamento("Rua doida", "Franca", 200, 30, 2);
        exemploPolimorfismo(ap1);
    }
}
