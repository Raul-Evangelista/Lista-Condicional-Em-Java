import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 11 - Cálculo do novo salário e o aumento | \n");

//      Entrada
        System.out.println("Informe, em reais, o salário: ");
        double antigoSalario = leitor.nextDouble();

//      Processamento Condicional
        double aumentoDoSalario;
        double novoSalario;
        String mensagem;
       
        if (antigoSalario <= 0) {
            mensagem = "O valor do salário não pode ser menor ou igual a zero";

        }  else if (antigoSalario <= 300) {
            aumentoDoSalario = antigoSalario * 0.15;
            novoSalario = antigoSalario + aumentoDoSalario;
            mensagem = String.format("Novo salário: R$ %.2f | Valor do aumento: R$ %.2f", novoSalario, aumentoDoSalario);
            

        } else if (antigoSalario < 600) {
            aumentoDoSalario = antigoSalario * 0.10;
            novoSalario = antigoSalario + aumentoDoSalario;
            mensagem = String.format("Novo salário: R$ %.2f | Valor do aumento: R$ %.2f", novoSalario, aumentoDoSalario);
            
           

        } else if (antigoSalario <= 900) {
            aumentoDoSalario = antigoSalario * 0.05;
            novoSalario = antigoSalario + aumentoDoSalario;
            mensagem = String.format("Novo salário: R$ %.2f | Valor do aumento: R$ %.2f", novoSalario, aumentoDoSalario);
            


        } else {
            mensagem = String.format("Não há aumento para o salário informado: R$ %.2f ", antigoSalario);
          
        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
