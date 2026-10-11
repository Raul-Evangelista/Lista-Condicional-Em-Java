import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao17 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 17 - Programa que verifica a validade da senha fornecida pelo usuário | \n");

//      Entrada
        System.out.println("Informe a senha: ");
        String senha = leitor.nextLine();

//      Processamento Condicional
        String mensagem;

        if (!senha.equals("4531")) {
            mensagem = "Senha inválida: sem permissão de acesso";

        } else {
            mensagem = "Senha válida: acesso permitido";

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
