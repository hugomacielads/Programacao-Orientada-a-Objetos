package lista1;
public class Aluno {
    public int numeroAluno, idade; // int é tipo primitivo
    public String nome; // String é um classe, por isso começa com letra minúscula
    public float p1, p2;

    // construtor
    public Aluno(){

    }
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Retorna a média
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    // Retorna os dados do aluno
    public String dadosAluno(){
        return "Número do aluno: " + this.numeroAluno + " Nome: " + this.nome + " Nota Final: " + this.notaFinal();
    }

    // Verifica se passou
    public String passou(){
        /*if (this.notaFinal() >= 6){
            return "Aprovado";
        } else {
            return "Reprovado";
        }*/
        return (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
    }
}
