package edu.zeneto.primeiros.projetos.carrosdozeze;

public class Carro extends Veiculos {
    public void ligar() {
        System.out.println("Carro ligado");
        confereCambio();
        confereCombustivel();
    }
    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio () {
        System.out.println("Conferindo Cambio em P");
    }

}
