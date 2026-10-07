import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao05 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 05 - Operação conforme a escolha do usuário | \n");

//      Entradas
        System.out.println("Informe o primeiro número: ");  
        double numero01 = leitor.nextDouble();

        System.out.println("Informe o segundo número: ");  
        double numero02 = leitor.nextDouble();

//      Seleção de operação para os números informados
        System.out.println("Informe, conforme a numeração indicada, a operação desejada: ");
        System.out.println("1 - Média entre os números informados \n"
            + "2 - Diferença entre o maior número informado pelo menor número \n"
            + "3 - Produto entre os números informados \n"
            + "4 - Divisão do primeiro número informado pelo segundo número");
        int opcao = leitor.nextInt();

//      Processamento
        double resultado;
        String resultadoCompleto;

        switch (opcao) {

            case 1:
                resultado = (numero01 + numero02)/2;
                resultadoCompleto = "Média: " + resultado;
                break;

            case 2: 
                if (numero01 >= numero02) {
                    resultado = numero01 - numero02;
                } else {
                    resultado = numero02 - numero01;
                }
                resultadoCompleto = " Diferença do maior pelo menor: " + resultado;
                break;

            case 3: 
                resultado = numero01 * numero02;
                resultadoCompleto = "Produto entre os números informados: " + resultado;
                break;

            case 4:
                resultado = numero01 / numero02;
                resultadoCompleto = "Divisão do primeiro número informado pelo segundo: " + resultado;
                break;

            default:
                resultadoCompleto = "Opção escolhida inválida";
                break;
        }

//      Saída
        System.out.println(resultadoCompleto);
        System.out.println("| Fim do programa |");

        leitor.close();

    }
}
