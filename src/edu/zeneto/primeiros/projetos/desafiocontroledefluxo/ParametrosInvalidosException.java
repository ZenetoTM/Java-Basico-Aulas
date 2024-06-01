package edu.zeneto.primeiros.projetos.desafiocontroledefluxo;
import java.lang.Throwable;
public class ParametrosInvalidosException extends Throwable {
    ParametrosInvalidosException() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

}
