import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao10 {
    public static void main(String [] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 10 - Preço, com impostos, de um carro com base no custo de fábrica | \n");

//      Entrada
        System.out.println("Inform o custo de fábrica do carro: ");
        double custoDeFabrica = leitor.nextDouble();

//      Saída Condicional
        double novoPreco;
        
        if (custoDeFabrica < 0) {
            System.out.println(" O custo não pode ser negativo");

        } else if (custoDeFabrica <= 12000) {
            novoPreco = custoDeFabrica * 1.05;
             System.out.printf("O novo preço após acréscimo de 5%% de impostos: R$ %.2f%n", novoPreco);

        } else if (custoDeFabrica <= 25000) {
            novoPreco = custoDeFabrica * 1.25;
             System.out.printf("O novo preço após acréscimo de 25%% de impostos: R$ %.2f%n", novoPreco);

        } else {
            novoPreco = custoDeFabrica * 1.35;
             System.out.printf("O novo preço após acŕescimo de 35%% de impostos: R$ %.2f%n", novoPreco);
        }

        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
