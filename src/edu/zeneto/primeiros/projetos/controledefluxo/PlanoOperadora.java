package edu.zeneto.primeiros.projetos.controledefluxo;

public class PlanoOperadora {
    public static void main(String[] args) {
        char plano = 'M'; //M / T

        switch (plano) {

            case 'B': {
                System.out.println("100 minutos de ligação");
                break;
            }
            case 'M': {
                System.out.println("100 minutos de ligação e Intagram e Whatsapp grátis");
                break;
            }
            case 'T': {
                System.out.println("100 minutos de ligação e Intagram e Whatsapp grátis + 5Gb de Youtube");
                    break;
            }







        /*if (plano == 'B') {
            System.out.println("100 minutos de ligação");
        } else if (plano == 'M') {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram grátis");
        } else if (plano == 'T') {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram grátis");
            System.out.println("5Gb Youtube");*/
        }

    }
}
