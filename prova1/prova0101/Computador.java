package prova1.prova0101;

public class Computador {

    private boolean modo;
    private int memoria;

    public Computador() {

    }
    public Computador(boolean modo, int memoria) {
        this.setModo(modo);
        this.setMemoria(memoria);
    }


    public void setModo(boolean modo) {
        this.modo = modo;
    }
    public boolean getModo() {
        return modo;
    }

    public void setMemoria(int memoria) {
        if(memoria == 4 || memoria == 8 || memoria == 16 || memoria == 32 ) {
            this.memoria = memoria;    
        }
        else {
            System.out.println("Número de memória inválido");
        }
    }
    public int getMemoria() {
        return memoria;
    }

    public String toString() {
        return "Ligado?: " + this.modo + " |  Memória: " + this.memoria;
    }


    public void upgrade(int x) {
        if (memoria + x == 8 || memoria + x == 16 || memoria + x == 32) {
            this.setMemoria(this.memoria + x);
        }
        else {
            System.out.println("Não é possível adicionar essa quantidade de memória");
        }
    }
}