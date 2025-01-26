package IntroducaoPOO.Teste;

import IntroducaoPOO.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] agrs) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "João";
        pessoa.idade = 64;
        pessoa.sexo = 'M';

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Sexo: " + pessoa.sexo);
    }
}
