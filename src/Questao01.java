import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
//      Introdução
        System.out.println(" | Questão 01 - Sistema de situação acadêmica | \n");

//      Entradas
        System.out.println("Informe a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = leitor.nextDouble();

        System.out.println("Informe a quarta nota: ");
        double nota4 = leitor.nextDouble();

//      Processamento
        double media = (nota1 + nota2 + nota3 + nota4)/4;

//      Saída Condicional
        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        }

        else{
            System.out.println("Aluno reprovado com média:" + media);

        }
        
        leitor.close();

       
    }
}
