import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao20 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 20 - categoria do nadador | \n");    

//      Entrada
        System.out.println("Informe, em anos, a idade do nadador: ");
        int idade = leitor.nextInt();

//      Processamento Condicional
        String mensagem;

        if (idade < 0) {
            mensagem = "A idade não pode ser menor que zero.";

        } else if (idade < 5) {
            mensagem = "Idade não permitida: sem categoria.";

        } else if (idade <= 7) {
            mensagem = "Categoria infantil.";

        } else if (idade <= 10) {
            mensagem = "Categoria juvenil.";

        } else if (idade <= 15) {
            mensagem = "Categoria adolescente.";

        } else if (idade <= 30) {
            mensagem = "Categoria adulta.";

        } else {
            mensagem = "Categoria sênior.";

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");
        
        leitor.close();

    }
}
