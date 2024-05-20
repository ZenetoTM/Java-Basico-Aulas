package edu.zeneto.primeiros.projetos.smartTv;

public class SmartTV {

    boolean ligado = false;
    int volume = 25;
    int canal = 1;


    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void abaixarVolume(){
        volume--;
        System.out.println("Abaixando o volume para: " + volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    public void abaixarCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }
    public void mudarCanal( int novoCanal){
        canal = novoCanal;
    }
}
