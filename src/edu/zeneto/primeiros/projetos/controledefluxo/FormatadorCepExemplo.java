package edu.zeneto.primeiros.projetos.controledefluxo;

import java.lang.RuntimeException;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            throw new RuntimeException("O cep está invalido ou não corresponde às regras de négocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();
        //simulando um cep formatado
        return "23.765-064";
    }
}
