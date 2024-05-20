package edu.zeneto.primeiros.projetos.smartTv;

public class Usuario {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.abaixarVolume();
        tv.abaixarVolume();
        tv.abaixarVolume();
        tv.aumentarVolume();

        tv.mudarCanal(13);
        System.out.println("Canal Atual: " + tv.canal);

        System.out.println("Tv Ligada ? " + tv.ligado);
        System.out.println("Volume Atual:  " + tv.volume);

        tv.ligar();
        System.out.println("Novo status: Tv ligada " + tv.ligado );
        tv.desligar();
        System.out.println("Novo status: Tv ligada " + tv.ligado );
    }
}
