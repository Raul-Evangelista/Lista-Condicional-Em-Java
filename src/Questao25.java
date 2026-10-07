import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao25 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 25 - Gratificação de Natal com base em horas extras e de faltas | \n");

//      Entradas
        System.out.println("Informe a quantidade de horas extras: ");
        double horasExtras = leitor.nextDouble();

        System.out.println("Informe a quantidade de horas de faltas: ");
        double horasFaltadas = leitor.nextDouble();

//      Validação
        if (horasExtras < 0) {
            System.out.println("O número de horas informado não pode ser negativo.");
            leitor.close();
            return;
        }

        if (horasFaltadas < 0) {
            System.out.println("O número de horas faltadas não pode ser negativo.");
            leitor.close();
            return;
        }

//      Processamento
        double saldoMinutos = (horasExtras - (2.0 / 3.0) * horasFaltadas) * 60;

//      Saída Condicional
        if (saldoMinutos >= 2400) {
            System.out.println("Valor do prêmio: R$ 500,00");

        } else if (saldoMinutos >= 1800) {
            System.out.println("Valor do prêmio: R$ 400,00");

        } else if (saldoMinutos >= 1200) {
            System.out.println("Valor do prêmio: R$ 300,00");

        } else if (saldoMinutos >= 600) {
            System.out.println("Valor do prêmio: R$ 200,00");

        } else {
            System.out.println("Valor do prêmio: R$ 100,00");
        }

        leitor.close();
    }
}
