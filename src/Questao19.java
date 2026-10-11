import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao19 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 19 - O peso ideal conforme o sexo | \n");

//      Primeira Entrada
        System.out.println("Informe, em metros, a altura: ");
        String alturaDeEntrada = leitor.next().replace(",", ".");

//      Tratando a altura
        double altura = Double.parseDouble(alturaDeEntrada);

//      Validação
        if (altura <= 0) {
            System.out.println("A altura deve ser maior que zero.");
            leitor.close();
            return;
        }   

//      Segunda Entrada        
        System.out.println("Informe o sexo: \n"
            + "Digite H para homem \n"
            + "Digite M para mulher");
        String sexo = leitor.next().toLowerCase();


//      Processamento Condicional
        double pesoIdeal;
        String mensagem;
        
        if (sexo.equals("h")) {
            pesoIdeal = (72.7 * altura) - 58;
            mensagem = String.format("Peso ideal: %.2f kg", pesoIdeal); 

        } else if (sexo.equals("m")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            mensagem = String.format("Peso ideal: %.2f kg", pesoIdeal); 

        } else {
            mensagem = "Opção escolhida inválida."; 

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
