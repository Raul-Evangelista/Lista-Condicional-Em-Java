import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao24 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//       Introdução
        System.out.println(" | Questão 24 - Preço, aumento, imposto e classificação | \n");

//      Entradas
        System.out.println("Informe o preço do produto:");
        double antigoPreco = leitor.nextDouble();

        System.out.println("Informe a categoria do produto:\n"
            + "1 - Limpeza\n"
            + "2 - Alimentação\n"
            + "3 - Vestuário");
        int categoria = leitor.nextInt();

        System.out.println("Informe a situação do produto:\n"
            + "R - Necessita de refrigeração\n"
            + "N - Não necessita de refrigeração");
        String situacao = leitor.next().trim().toLowerCase();

//       Validação
        if (antigoPreco <= 0) {
            System.out.println("O preço informado não pode ser zero ou negativo.");
            leitor.close();
            return;
        }

        if (categoria != 1 && categoria != 2 && categoria != 3) {
            System.out.println("Categoria inválida.");
            leitor.close();
            return;
        }

        if (!situacao.equals("r") && !situacao.equals("n")) {
            System.out.println("Situação do produto inválida.");
            leitor.close();
            return;
        }

//       Cálculo do aumento
        double aumento;

        if (antigoPreco <= 25) {
            if (categoria == 1) {
                aumento = antigoPreco * 0.05;
            } else if (categoria == 2) {
                aumento = antigoPreco * 0.08;
            } else {
                aumento = antigoPreco * 0.10;
            }
        } else {
            if (categoria == 1) {
                aumento = antigoPreco * 0.12;
            } else if (categoria == 2) {
                aumento = antigoPreco * 0.15;
            } else {
                aumento = antigoPreco * 0.18;
            }
        }

//       Cálculo do imposto
        double imposto;

        if (categoria == 2 || situacao.equals("r")) {
            imposto = antigoPreco * 0.05;
        } else {
            imposto = antigoPreco * 0.08;
        }

//       Novo preço
        double novoPreco = antigoPreco + aumento - imposto;

//      Classificação
        String mensagem;

        if (novoPreco <= 50) {
            mensagem = "Barato";
        } else if (novoPreco < 120) {
            mensagem = "Normal";
        } else {
            mensagem = "Caro";
        }

//       Saída
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Valor do imposto: R$ %.2f%n", imposto);
        System.out.printf("Novo preço: R$ %.2f%n", novoPreco);
        System.out.println("Classificação: " + mensagem);

        leitor.close();
    }
}