import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao23 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 23 - Preço unitário, preço total e valor do desconto | \n");

//      Entradas
        System.out.println("Informe o código do produto comprado: ");
        int codigo = leitor.nextInt();

        System.out.println("Informe a quantidade comprada do produto: ");
        int quantidade = leitor.nextInt();

//      Processamento Condicional
        double precoTotal;
        double desconto;
        double precoFinal;
        String mensagem;



        if (quantidade <= 0) {
                mensagem = "A quantidade do produto não pode ser menor ou igual a zero.";

        } else {

            switch (codigo) {
                
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                    precoTotal = 10 * quantidade;

                    if (precoTotal <= 250) {
                        desconto = precoTotal * 0.05;
                        precoFinal = precoTotal - desconto;

                    } else if (precoTotal <= 500) {
                        desconto = precoTotal * 0.10;
                        precoFinal = precoTotal - desconto;

                    } else {
                        desconto = precoTotal * 0.15;
                        precoFinal = precoTotal - desconto;

                    }

                
                    mensagem = String.format("Produto com preço unitário R$ 10,00. \n"
                        + "Preço total R$ %.2f e com desconto de R$ %.2f \n"
                        + "Valor total com desconto: R$ %.2f", precoTotal, desconto, precoFinal);
                }
                
                case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20  -> {
                    precoTotal = 15 * quantidade;

                    if (precoTotal <= 250) {
                        desconto = precoTotal * 0.05;
                        precoFinal = precoTotal - desconto;

                    } else if (precoTotal <= 500) {
                        desconto = precoTotal * 0.10;
                        precoFinal = precoTotal - desconto;

                    } else {
                        desconto = precoTotal * 0.15;
                        precoFinal = precoTotal - desconto;

                    }

                
                    mensagem = String.format("Produto com preço unitário R$ 15,00. \n"
                        + "Preço total R$ %.2f e com desconto de R$ %.2f \n"
                        + "Valor total com desconto: R$ %.2f", precoTotal, desconto, precoFinal);
                } 


                case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 -> {
                    precoTotal = 20 * quantidade;

                    if (precoTotal <= 250) {
                        desconto = precoTotal * 0.05;
                        precoFinal = precoTotal - desconto;

                    } else if (precoTotal <= 500) {
                        desconto = precoTotal * 0.10;
                        precoFinal = precoTotal - desconto;

                    } else {
                        desconto = precoTotal * 0.15;
                        precoFinal = precoTotal - desconto;

                    }
                

                    mensagem = String.format("Produto com preço unitário R$ 20,00. \n"
                        + "Preço total R$ %.2f e com desconto de R$ %.2f \n"
                        + "Valor total com desconto: R$ %.2f", precoTotal, desconto, precoFinal);
                }

                case 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 -> {
                    precoTotal = 30 * quantidade;

                    if (precoTotal <= 250) {
                        desconto = precoTotal * 0.05;
                        precoFinal = precoTotal - desconto;

                    } else if (precoTotal <= 500) {
                        desconto = precoTotal * 0.10;
                        precoFinal = precoTotal - desconto;

                    } else {
                        desconto = precoTotal * 0.15;
                        precoFinal = precoTotal - desconto;

                    }


                    mensagem = String.format("Produto com preço unitário R$ 30,00. \n"
                        + "Preço total R$ %.2f e com desconto de R$ %.2f \n"
                        + "Valor total com desconto: R$ %.2f", precoTotal, desconto, precoFinal);
                }
                
                default -> 
                    mensagem = "Código do produto inválido.";  

            }
        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
