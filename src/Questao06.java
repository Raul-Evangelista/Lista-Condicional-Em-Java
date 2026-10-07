import java.util.Scanner;
import java.text.DecimalFormat;

//      Aluno: Raul Alexandre Evangelista

public class Questao06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.############################");

//      Introdução
        System.out.println(" | Questão 06 - Operação, entre dois números informados, conforme a escolha do usuário \n");

//      Entradas
        System.out.println("Informe o primeiro número: ");
        double numero01 = leitor.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numero02 = leitor.nextDouble();

//      Seleção de Operação
        System.out.println("Digite - A, B ou C - conforme a escolha da operação \n"
            + "A - O primeiro número elevado ao segundo \n"
            + "B - Raiz quadrada de cada um dos números informados \n"
            + "C - Raiz cúbica de cada um dos números informados");
        String opcao = leitor.next().trim().toLowerCase();

//      Processamento condicional
        double resultado01;
        double resultado02;
        String resultadoCompleto;

        switch (opcao) {
            case "a":
                resultado01 = Math.pow(numero01, numero02);
                resultadoCompleto = "O primeiro número elevado ao segundo: " + formato.format(resultado01);
                break;
        
            case "b":
                resultado01 = Math.sqrt(numero01);
                resultado02 = Math.sqrt(numero02); 
                resultadoCompleto = "Resultado da raiz quadrada do primeiro e segundo número, respectivamente: " + formato.format(resultado01) + ", " + formato.format(resultado02);
                break;

            case "c":

                resultado01 = Math.cbrt(numero01);
                resultado02 = Math.cbrt(numero02); 
                resultadoCompleto = "Resultado da raiz cúbica do primeiro e segundo número, respectivamente: " + formato.format(resultado01) + ", " + formato.format(resultado02);
                break;

            default:
                resultadoCompleto = "Opção escolhida inválida";
                break;

        }
        
//      Saída
        System.out.println(resultadoCompleto);
        System.out.println("| Fim do Programa |");
        
        leitor.close();

    }
}
