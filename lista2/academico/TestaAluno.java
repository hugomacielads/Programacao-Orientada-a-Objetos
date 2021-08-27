package lista2.academico;
import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String args[]) {
        Aluno obj1 = new Aluno();

        obj1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        obj1.setNumeroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe seu número")));
        obj1.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        obj1.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da P1")));
        obj1.setP2(Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da P2")));

        JOptionPane.showMessageDialog(null, obj1.toString());
    }
}
