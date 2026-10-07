import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao03 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 03 - o menor entro dois números informados | \n");

//      Entradas
        System.out.println("Informe o primeiro número: ");
        double numero01 = leitor.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numero02 = leitor.nextDouble();

//      Saída Condicional
        if (numero01 < numero02) {
            System.out.println("O menor número: " + numero01);
        
        } else if (numero02 < numero01) {
            System.out.println("O menor número: " + numero02);

        } else {
            System.out.println("Os números informados são iguais");
        }

        leitor.close();

    }
}
