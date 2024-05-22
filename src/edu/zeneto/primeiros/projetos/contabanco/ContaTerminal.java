package edu.zeneto.primeiros.projetos.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    /* Eu usei uma premissa que você já tem a conta no banco, tendo isso em mente você tentara logar
    logar nela
    Numero da conta 067-8
    agencia 1021
    Nome da conta José Santos
     */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta!");
        String conta = scanner.next();

        System.out.println("Por favor, digite o número da sua agência!");
        int agencia = scanner.nextInt();

        // foi criado um novo scanner porque o scanner estava pulando a linha sobre a pergunta do nome

        System.out.println("Por favor, digite o nome da conta!");
        String nomeConta = input.nextLine();

        String usuarioConta = "067-8";
        int bagencia = 1021;
        String usuario = "José Santos";
        double saldo = 237.48;

        if (bagencia == agencia && usuarioConta == conta && usuario == nomeConta) {

            System.out.println("olá " + nomeConta + ", obrigada por usar o nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo é " + saldo + " já está disponível para saque");
        } else {
            System.out.println("Falha ao encontrar a conta");
        }
        ;
    }
}