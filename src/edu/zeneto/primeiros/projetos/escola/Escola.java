package edu.zeneto.primeiros.projetos.escola;

public class Escola {
    public static void main(String[] args) {
      //Aluno felipe = new Aluno();
       // felipe.nome ="felipe";
        //felipe.idade = 8;
        //System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");

        Aluno felipe = new Aluno();
        felipe.setIdade(8);
        felipe.setNome("felipe");
        System.out.println("O aluno " + felipe.getNome() + " tem " +  felipe.getIdade() + " anos");
    }
}