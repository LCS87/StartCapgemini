package ComandosEntradaSaida;

import java.util.Scanner;

/**
 * @author leandro
 */
public
        class Main {

    public static
            void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        float cotatacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        /* Lê apenas uma palavra, não é permitido o uso do caractere espaço */
        String codigo = leitor.next();
        /* Leitura de texto com mais de uma palavra  */
        char c = leitor.next().charAt(0);
        /* precisamos pegar o caractere da
            primeira posição da palavra para isso usamos o método charAt() na
            posição zero */

        System.out.print(" Imprime o valor de uma variável");
        System.out.println("Imprime o valor de uma variável conforme uma formatação especificada");
        System.out.printf(" Imprime o valorm de uma variável e pula uma linha");

    }
}
