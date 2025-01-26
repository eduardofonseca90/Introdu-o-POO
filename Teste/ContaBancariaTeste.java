package IntroducaoPOO.Teste;

import java.util.Scanner;

import IntroducaoPOO.Dominio.ContaBancaria;

public class ContaBancariaTeste {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.numeroDaConta = 7852;
        contaBancaria.nomeDoTitularDaConta = "José";
        contaBancaria.saldo = 30000;

        Scanner scanner = new Scanner(System.in);

        int opcaoEscolhida = 0;
        
        while (opcaoEscolhida != 4) {
        
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Encerrar");
        opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Digite o valor para depósito: ");
                double valorDepositado = scanner.nextDouble();
                contaBancaria.saldo += valorDepositado;
                System.out.println("Titular da conta: " + contaBancaria.nomeDoTitularDaConta + "\nNúmero da Conta: "+ contaBancaria.numeroDaConta);
                System.out.println("Deposito de R$ " + valorDepositado + " realizado com sucesso!");

            } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor do saque: ");
                double valorSaque = scanner.nextDouble();
                if (valorSaque > contaBancaria.saldo) {
                    System.out.println("Saldo insuficiente.");
                } else if (valorSaque <= contaBancaria.saldo) {
                    contaBancaria.saldo -= valorSaque;
                    System.out.println("Titular da conta: " + contaBancaria.nomeDoTitularDaConta + "\nNúmero da Conta: "+ contaBancaria.numeroDaConta);
                    System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
                }

            } else if (opcaoEscolhida == 3) {
                System.out.println("Titular da conta: " + contaBancaria.nomeDoTitularDaConta + "\nNúmero da Conta: "+ contaBancaria.numeroDaConta);
                System.out.println("Saldo: R$ " + contaBancaria.saldo);

            } else if (opcaoEscolhida == 0 || opcaoEscolhida >= 5) {
                System.out.println("Opção inválida!");
            } 
        }
        System.out.println("OPERAÇÃO ENCERRADA");
    }
}
