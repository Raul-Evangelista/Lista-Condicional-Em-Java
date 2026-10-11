import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao22 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 22 - Classificação do risco conforme idade e massa | \n");

//      Entradas
        System.out.println("Informe, em anos, a idade: ");
        int idade = leitor.nextInt();

        if (idade < 0) {
            System.out.println("A idade não pode ser negativa.");
            leitor.close();
            return;
        }

        System.out.println("Informe, em quilogramas, a massa: ");
        double massa = leitor.nextDouble();

        if (massa <= 0) {
            System.out.println("A massa não pode ser menor ou igual a zero.");
            leitor.close();
            return;
        }


//      Processamento Condicional
        String mensagem;

        if (idade < 20) {
            if (massa <= 60) {
                mensagem = "Pessoa com risco 9.";

            } else if (massa <= 90) {
                mensagem = "Pessoa com risco 8.";

            } else {
                mensagem = "Pessoa com risco 7.";

            }

        } else if (idade <= 50) {
            if (massa <= 60) {
                mensagem = "Pessoa com risco 6.";

            } else if (massa <= 90) {
                mensagem = "Pessoa com risco 5.";

            } else {
                mensagem = "Pessoa com risco 4.";

            }

        } else {
            if (massa <= 60) {
                mensagem = "Pessoa com risco 3.";

            } else if (massa <= 90) {
                mensagem = "Pessoa com risco 2.";

            } else {
                mensagem = "Pessoa com risco 1.";

            }

        }    

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
