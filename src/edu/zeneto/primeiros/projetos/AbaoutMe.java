package edu.zeneto.primeiros.projetos;

import java.util.Locale;
import java.util.Scanner;
public class AbaoutMe {
    public static void main(String[] args) {
        // os argumentos começam com indice (
       /* String  nome = args [0];
=======
public class AbaoutMe {
    public static void main(String[] args) {
        // os argumentos começam com indice (
        String  nome = args [0];
>>>>>>> 7acb2da7ae5d738013a87188a97719cd4c167fe2
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); // Vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

<<<<<<< HEAD
         System.out.println("Olá me chamo " + nome + " " + sobrenome);
         System.out.println("Tenho " + idade + " anos ");
         System.out.println("Minha altura é " + altura + "cm ");*/

        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Minha idade é " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}