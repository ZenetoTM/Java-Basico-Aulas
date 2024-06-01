package edu.zeneto.primeiros.projetos.controledecandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);

        }

    }
    static void entrandoEmContato (String candidato) {
        int tentativaRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativaRealizadas++;
            } else
                System.out.println("Contato Realizado com sucesso");

        } while (continuaTentando && tentativaRealizadas <3);
        if (atendeu) {
            System.out.println("conseguimos entrar em contato com " + candidato + " Na " + tentativaRealizadas + "Tentativa");
        } else {
            System.out.println("Não conseguimos entrar em contato com " + candidato + ", numero máximo de tentativas realizadas " + tentativaRealizadas);
        }

    }

    static boolean atender () {
        return  new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados () {
        System.out.println("Imprimindo a lista de convidados informando o indice do elemento");

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        for (int indece = 0; indece < candidatos.length; indece++) {
            System.out.println("O candidato de número" + (indece+1) + " é " + candidatos[indece]);
        }


    };

    static void selecaoDeCandidatos () {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int canditatosSelecionados = 0;
        int candidatoAtual = 0;
        float salariobase = 2000.0f;
        while (canditatosSelecionados < 5 && candidatoAtual < candidatos.length) {
             String candidato = candidatos[candidatoAtual];
             float salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioPretendido >= salariobase) {
                System.out.println("o candidato " + candidato + " foi selecionado");
                canditatosSelecionados++;
            }
            candidatoAtual++;
        }
    };

    static float valorPretendido () {
        return ThreadLocalRandom.current().nextFloat(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioPretendido == salarioBase)
            System.out.println("Aguardando o resultado dos demais candidatos");
        else {
            System.out.println("ligar para o candidato com uma contra proposta");
        }
    }
}

