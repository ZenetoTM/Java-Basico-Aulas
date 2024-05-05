package edu.zeneto.primeiros.projetos;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Zeneto";
        String segundoNome = "José";
        segundoNome = "Siqueira";

        String nomeCompleto = nomeCompleto(primeiroNome ,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome)
            {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
