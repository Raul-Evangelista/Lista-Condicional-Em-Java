import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao16 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 16 - Descontos nos Produtos Conforme o Preço | \n");

//      Entrada
        System.out.println("Informe, em reais, o valor do produto: ");
        double antigoPreco = leitor.nextDouble();

        System.out.println("Informe o código do produto para o cadastro: ");
        String codigo = leitor.next();

//      Processamento Condicional
        double novoPreco;
        String mensagem;

        if (antigoPreco <= 0) {
            mensagem = "O preço informado do produto não pode ser menor ou igual a zero.";

        } else if (antigoPreco <= 30) {
            mensagem = String.format("O produto de código %s não tem desconto.", codigo); 

        } else if (antigoPreco <= 100) {
            novoPreco = antigoPreco * 0.90;
            mensagem = String.format("O preço do produto de código %s após desconto de 10%%: R$ %.2f", codigo, novoPreco);

        } else {
            novoPreco = antigoPreco * 0.85;
            mensagem = String.format("O preço do produto de código %s após desconto de 15%%: R$ %.2f", codigo, novoPreco);

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
