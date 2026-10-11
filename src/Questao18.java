import java.util.Scanner;   

//      Aluno: Raul Alexandre Evangelista

public class Questao18 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 18 - Programa de classificação de idade | \n");

//      Entrada
        System.out.println("Informe, em anos, a idade: ");
        int idade = leitor.nextInt();

//      Processamento Condicional
        String mensagem;

        if (idade < 0) {
            mensagem = "A idade não pode ser negativa.";

        } else if (idade < 18) {
            mensagem = "Menor de idade.";

        } else {
            mensagem = "Maior de idade.";

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
