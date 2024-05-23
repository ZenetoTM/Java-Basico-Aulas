package edu.zeneto.primeiros.projetos.controledefluxo;

import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* as chaves são opcionais se o seu if tiver só uma linha
        vale também para if-else, for-loop,while-loop, mas só se tiver uma linha
         */

        int notaMaxima = 11;
        int notaErro = 0;

        System.out.println("Digite a nota do aluno");
        int nota = scanner.nextInt();


        if (nota >= notaMaxima || nota <= notaErro)
            System.out.println("Erro ao carregar a nota");

        else if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
        scanner.close();

       /* int nota 6;
        String  resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recupeção" : "Reprovo";

        System.out.println(resultado);*/
    }
}
