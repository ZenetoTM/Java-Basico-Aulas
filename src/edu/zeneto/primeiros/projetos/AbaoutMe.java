package edu.zeneto.primeiros.projetos;

public class AbaoutMe {
    public static void main(String[] args) {
        // os argumentos começam com indice (
        String  nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); // Vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
