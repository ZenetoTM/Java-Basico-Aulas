package edu.zeneto.primeiros.projetos.controledefluxo;

import java.sql.SQLOutput;

public class SistemaMedida {
    public static void main(String[] args) {
        char sigla = 'M';

        switch (sigla) {
            case 'P': {
                System.out.println("Pequeno");
                break;
            }
            case 'M': {
                System.out.println("Médio");
                break;
            }
            case 'G': {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");

        }



       /* if (sigla == "P")
            System.out.println("Pequeno");

        else if (sigla == "M")
            System.out.println("Médio");

        else if (sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido"); */

    }
}
