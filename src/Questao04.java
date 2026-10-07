import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao04 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 04 - o maior entre três números informados | \n");

//      Entradas
        System.out.println("Informe o primeiro número: ");
        double numero01 = leitor.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numero02 = leitor.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double numero03 = leitor.nextDouble();

//      Saída Condicional
        if (numero01 > numero02 && numero01 > numero03) {
            System.out.println("O maior número: " + numero01);

        } else if (numero02 > numero01 && numero02 > numero03) {
            System.out.println("O maior número: " + numero02);

        } else if (numero03 > numero01 && numero03 > numero02) {
            System.out.println("O maior número: " + numero03);

        } else {
            System.out.println("Os números informados são iguais");
        }

        leitor.close();
    }
}
