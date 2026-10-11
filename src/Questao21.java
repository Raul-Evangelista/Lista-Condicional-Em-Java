import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao21 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 21 - procedência de um produto | \n");

//      Primeira Entrada
        System.out.println("Informe, em reais, o preço do produto: ");
        double preco = leitor.nextDouble();

//      Validação do preço
        if (preco <= 0) {
            System.out.println("O preço do produto não pode ser menor ou igual a zero.");
            leitor.close();
            return;
        }

//      Segunda Entrada   
        System.out.println("Informe código de origem do produto: ");
        int codigo = leitor.nextInt();

//      Processamento Condicional
        String mensagem;

        switch (codigo) {

            case 1 ->
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Sul do Brasil.", preco);
            
            case 2 -> 
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Norte do Brasil.", preco);
            
            case 3 -> 
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Leste do Brasil.", preco);
            
            case 4 -> 
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Oeste do Brasil.", preco);
            
            case 5, 6 -> 
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Nordeste do Brasil.", preco);
            
            case 7, 8, 9 -> 
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Sudeste do Brasil.", preco);
            
            case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> 
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Centro-Oeste do Brasil.", preco);
            
            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30  -> 
                mensagem = String.format("Produto com preço de R$ %.2f tem origem no Nordeste do Brasil.", preco);
            
            default -> 
                mensagem = "Código de origem inválido.";  

        }

//      Saída
        System.out.println(mensagem);
        System.out.println(" | Fim do Programa | ");

        leitor.close();

    }
}
