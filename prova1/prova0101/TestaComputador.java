package prova1.prova0101;

public class TestaComputador {
    
    public static void main(String args[]) {

        // Exemplo com inserções válidas
        Computador pc1 = new Computador(true, 8);
        pc1.upgrade(8);

        // Exemplo com inserções erradas de memória
        Computador pc2 = new Computador(false, 15);
        //pc2.upgrade(16);

        // Exemplo com inserções erradas de upgrade
        Computador pc3 = new Computador(true, 8);
        pc3.upgrade(10);

        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
        System.out.println(pc3.toString());
    }
}
