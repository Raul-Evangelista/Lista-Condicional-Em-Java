import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao07 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 07 - Aumento para salários inferiores a R$ 500,00 \n");

//      Entrada
        System.out.println("Informe, em reais, o salário: ");
        double antigoSalario = leitor.nextDouble();

//      Processamento Condicional
        double novoSalario;
        String mensagem;

        if (antigoSalario <=0) {
            mensagem = "O Salário não pode ser menor ou igual a zero";

        } else if (antigoSalario < 500) {
            novoSalario = antigoSalario * 1.30;
            mensagem = String.format("Salário após o reajuste de 30%%: R$ %.2f", novoSalario);

        } else {
            mensagem = "Salário igual ou acima de R$ 500,00: Sem direito ao aumento";
        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();
    }
}
