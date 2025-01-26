package IntroducaoPOO.Teste;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import IntroducaoPOO.Dominio.Produto;

public class ProdutoTeste01 {
    public static void main(String[] agrs) {

        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do produto: ");
        String nomeDoProduto = scanner.next();

        System.out.println("Insira o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.println("Insira a quantidade em estoque do produto: ");
        int saldoEstoque = scanner.nextInt();

        System.out.println("========INFORMAÇÕES DO PRODUTO==========");
        System.out.println("Produto: " + nomeDoProduto + "\nPreço: " + precoProduto + "\nQtd em estoque: " + saldoEstoque);
        System.out.println("=========================================");
        
        System.out.println("Deseja atualizar a quantidade em estoque do produto?");
        System.out.println("Escolha a opção: ");
        System.out.println("[1] SIM");
        System.out.println("[2] NÃO");
        int opcaoEscolhidaUsuario = scanner.nextInt();

        if (opcaoEscolhidaUsuario == 1) {
            System.out.println("Digite o novo saldo: ");
            int novoSaldoEstoque = scanner.nextInt();

            System.out.println("\n============SALDO ATUALIZADO=============");
            System.out.println("Produto: " + nomeDoProduto + "\nPreço: " + precoProduto + "\nQtd em estoque: " + novoSaldoEstoque);
            System.out.println("PROGRAMA ENCERRADO");
        }else {
            System.out.println("PROGRAMA ENCERRADO");
        }
    }       
}
