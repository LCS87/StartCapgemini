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
        /* L� apenas uma palavra, n�o � permitido o uso do caractere espa�o */
        String codigo = leitor.next();
        /* Leitura de texto com mais de uma palavra  */
        char c = leitor.next().charAt(0);
        /* precisamos pegar o caractere da
            primeira posi��o da palavra para isso usamos o m�todo charAt() na
            posi��o zero */

        System.out.print(" Imprime o valor de uma vari�vel");
        System.out.println("Imprime o valor de uma vari�vel conforme uma formata��o especificada");
        System.out.printf(" Imprime o valorm de uma vari�vel e pula uma linha");

    }
}
