package edu.zeneto.primeiros.projetos;

public class Comentarios {
    public static void main(String[] args) {
        // olá, eu sou um comentario em uma única linha

        /* olá
         * eu sou um comentario
         * que posso ser mais detalhado
         * quando necessário
         */

        /** estas duas estrelinhas acima
         * é para indentificar que você
         * pretende elaborar um comentário
         * a nivel de documentação.
         */

        /*int numero1 = 24;
        int numero2 = 32;
        int soma = numero1 + numero2;
        System.out.println(soma); */

    }

    /*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade de somar ou  multiplicar
     * dois números
     */
    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "m") { // M= Multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }

        return r;


    }
}
