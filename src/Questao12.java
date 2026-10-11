import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 12 - Salário com gratificação e descontado o imposto | \n");

//      Entrada
        System.out.println("Informe, em reais, o salário bruto: ");
        double salarioBruto = leitor.nextDouble();

//      Processamento Condicional
        double novoSalario;
        String mensagem;

        if (salarioBruto <= 0) {
            mensagem = "O valor do salário não pode ser menor ou igual a zero.";

        } else if (salarioBruto <= 350) {
            novoSalario = salarioBruto * 0.93 + 100;
            mensagem = String.format("O salário após a gratificação de R$ 100,00 e descontado o imposto de 7%% sobre o salário bruto: R$ %.2f", novoSalario);

        } else if (salarioBruto < 600) {
            novoSalario = salarioBruto * 0.93 + 75;
            mensagem = String.format("O salário após a gratificação de R$ 75,00 e descontado o imposto de 7%% sobre o salário bruto: R$ %.2f", novoSalario);

        } else if (salarioBruto <= 900) {
            novoSalario = salarioBruto * 0.93 + 50;
            mensagem = String.format("O salário após a gratificação de R$ 50,00 e descontado o imposto de 7%% sobre o salário bruto: R$ %.2f", novoSalario);            

        } else {
            novoSalario = salarioBruto * 0.93 + 35;
            mensagem = String.format("O salário após a gratificação de R$ 35,00 e descontado o imposto de 7%% sobre o salário bruto: R$ %.2f", novoSalario);

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
