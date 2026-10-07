import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao08 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 08 - Reajuste de salário | \n");

//      Entrada
        System.out.println("Informe, em reais, o salário: ");
        double antigoSalario = leitor.nextDouble();

//      Processamento Condicional
        double novoSalario;
        String mensagem;

        if (antigoSalario <= 0) {
            mensagem = "O salário não pode ser menor ou igual a zero";

        } else if (antigoSalario <= 300) {
            novoSalario = antigoSalario * 1.35;
            mensagem = String.format(" O salário com reajuste de 35%%: R$ %.2f", novoSalario);
        
        } else {
            novoSalario = antigoSalario * 1.15;
            mensagem = String.format(" O salário com reajuste de 15%%: R$ %.2f", novoSalario);

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
