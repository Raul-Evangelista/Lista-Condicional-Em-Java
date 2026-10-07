import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao09 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 09 - Crédito conforme o saldo médio | \n");

//      Entrada
        System.out.println("Informe, em reais, o saldo médio do cliente: ");
        double saldoMedio = leitor.nextDouble();

//      Processamento Condicional
        double credito;
        String mensagem;

        if (saldoMedio <= 0) {
            mensagem = "O saldo médio não pode ser igual ou inferior a zero: valor inválido";
    
        } else if (saldoMedio <= 200) {
            credito = saldoMedio * 0.10;
            mensagem = String.format("Valor do crédito: R$ %.2f", credito);

        } else if (saldoMedio <= 300) {
            credito = saldoMedio * 0.20;
            mensagem = String.format("Valor do crédito: R$ %.2f", credito);

        } else if (saldoMedio <= 400) {
            credito = saldoMedio * 0.25;
            mensagem = String.format("Valor do crédito: R$ %.2f", credito);

        } else {
            credito = saldoMedio * 0.30;
            mensagem = String.format("Valor do crédito: R$ %.2f", credito);

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }

}
