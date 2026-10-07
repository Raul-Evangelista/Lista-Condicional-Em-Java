import java.util.Scanner;

//      Aluno: Raul ALexandre Evangelista

public class Questao02 {

    static public void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 02 - Sistema de situação acadêmica | \n");

//      Entrada
        System.out.println("Informe a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = leitor.nextDouble();

//      Processamento
        double media = (nota1 + nota2)/2;

//      Saída Condicional
        if (media >= 7 && media <= 10) {
            System.out.println("Aluno(a) Aprovado(a) com média: " + media);
        
        } else if (media < 7 &&  media >= 3) {
            System.out.println("Exame - média: " + media);
                
            
        } else if (media < 3 && media >= 0) {
            System.out.println("Aluno(a) Reprovado(a) " + media);
                
        } else {
            System.out.println("Nota(s) informada(s) inválida(s)");
        }

        leitor.close();

    }
}
