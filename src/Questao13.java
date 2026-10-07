import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao13 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 13 - Sistema de cálculo de novo preço e classificação | \n");

//      Entrada
        System.out.println("Informe o preço do produto: ");
        double antigoPreco = leitor.nextDouble();

//      Processamento Condicional
        double novoPreco;
        String mensagem;
        
        if (antigoPreco <= 0) {
            novoPreco = 0;

        } else if (antigoPreco <= 50) {
            novoPreco = antigoPreco * 1.05;

        } else if (antigoPreco <= 100) {
            novoPreco = antigoPreco * 1.10;

        } else {
            novoPreco = antigoPreco * 1.15;

        }


        if (novoPreco <= 0) {
            mensagem = "O preço do produto não pode ser zero ou negativo";

        } else if (novoPreco <= 80) {
            mensagem = String.format("Preço do produto, após o acréscimo, classificado como barato - Preço:  R$ %.2f", novoPreco);

        } else if (novoPreco <= 120) {
            mensagem = String.format("Preço do produto, após o acréscimo, classificado como normal - Preço:  R$ %.2f", novoPreco);

        } else if (novoPreco <= 200) {
             mensagem = String.format("Preço do produto, após o acréscimo, classificado como caro - Preço:  R$ %.2f", novoPreco);

        } else {
             mensagem = String.format("Preço do produto, após o acréscimo, classificado como muito caro - Preço:  R$ %.2f", novoPreco);
        
        }


//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();
        
    }
}
