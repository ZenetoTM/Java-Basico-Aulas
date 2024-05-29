package edu.zeneto.primeiros.projetos.controledefluxo;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExecao {
    public static void main(String[] args) {
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
