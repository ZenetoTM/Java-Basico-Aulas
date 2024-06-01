package edu.zeneto.primeiros.projetos.desafiocontroledefluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Parametro inválido, informe um número inteiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;

        for (int abobas = 0; abobas <= contagem; abobas++) {
            System.out.println("Imprimindo parâmetros " + abobas);
        }
        if (contagem < 0)
            throw new ParametrosInvalidosException();

    }
}
