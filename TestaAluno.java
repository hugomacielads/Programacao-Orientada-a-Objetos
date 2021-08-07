public class TestaAluno {
    // public indica queo método é público
    // statis indica que o método é de classe
    // void indica que o método não retorna nada
    // String args[] indica que o método recebe como parâmetro um array de strings
    public static void main(String[] args) {
      
        // Vamos criar uma instância de aluno
        Aluno obj1 = new Aluno(456, "Hugo", 24, 10, 8); // Chama construtor Aluno()
        System.out.println(obj1.dadosAluno());
        System.out.println(obj1.passou());

        Aluno obj2 = new Aluno(234, "Gabriela", 25, 6, 10);
        System.out.println(obj2.dadosAluno());
        System.out.println(obj2.passou());


    }
}
