import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 15 - Investimentos em uma Agência Bancária | \n");

//      Entrada
        System.out.println("Informe, em reais, o valor do investimento: ");
        double antigoValor = leitor.nextDouble();

//      Validação do valor de investimento
        if (antigoValor <= 0) {
            System.out.println("O valor do investimento não pode ser menor ou igual a zero.");
            leitor.close();
            return;
        }

        System.out.println("Informe o tipo de investimento: \n"
            + "1 - Poupança \n"
            + "2 - Fundos de Renda Fixa");
        int opcao = leitor.nextInt();          

//      Processamento Condicional
        double novoValor;
        String mensagem;

   
        if (opcao == 1) {
            novoValor = antigoValor * 1.03;
            mensagem = String.format("O valor corrigido após investimento de 3%% ao mês"
                + " na Poupança: R$ %.2f", novoValor);

        } else if (opcao == 2) {
            novoValor = antigoValor * 1.04;
            mensagem = String.format("O valor corrigido após investimento de 4%% ao mês"
                + " no Fundo de Renda Fixa: R$ %.2f", novoValor);

        } else {
            mensagem = "Opção de investimento inválida.";

        }


//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }

}
