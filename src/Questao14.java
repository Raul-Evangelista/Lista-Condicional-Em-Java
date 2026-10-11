import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 14 - Novo salário para o funcionário | \n");

//      Entrada
        System.out.println("Digite, em reais, o salário do funcionário: ");
        double antigoSalario = leitor.nextDouble();

//      Processamento Condicional       
        double novoSalario;
        String mensagem;

        if (antigoSalario <= 0) {
            mensagem = "O salário informado não pode ser menor ou igual a zero.";

        } else if (antigoSalario <= 300) {
            novoSalario = antigoSalario * 1.50;
            mensagem = String.format("O salário informado: R$ %.2f | O salário após o aumento: R$ %.2f", antigoSalario, novoSalario);

        } else if (antigoSalario <= 500) {
            novoSalario = antigoSalario * 1.40;
            mensagem = String.format("O salário informado: R$ %.2f | O salário após o aumento: R$ %.2f", antigoSalario, novoSalario);

        } else if (antigoSalario <= 700) {
            novoSalario = antigoSalario * 1.30;
            mensagem = String.format("O salário informado: R$ %.2f | O salário após o aumento: R$ %.2f", antigoSalario, novoSalario);

        } else if (antigoSalario <= 800) {
            novoSalario = antigoSalario * 1.20;
            mensagem = String.format("O salário informado: R$ %.2f | O salário após o aumento: R$ %.2f", antigoSalario, novoSalario);

        } else if (antigoSalario <= 1000) {
            novoSalario = antigoSalario * 1.10;
            mensagem = String.format("O salário informado: R$ %.2f | O salário após o aumento: R$ %.2f", antigoSalario, novoSalario);

        } else {
            novoSalario = antigoSalario * 1.05;
            mensagem = String.format("O salário informado: R$ %.2f | O salário após o aumento: R$ %.2f", antigoSalario, novoSalario);

        }

        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
