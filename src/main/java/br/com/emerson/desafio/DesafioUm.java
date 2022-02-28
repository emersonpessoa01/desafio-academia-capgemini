package br.com.emerson.desafio;

public class DesafioUm {
	public void desafio1(String input) {
		/* conversao de String a um inteiro */
		int n = Integer.valueOf(input);
		/* varrendo de 1 até n */
		for (int i = 1; i <= n; i++) {
			/* printando espaço em branco de 1 até n */
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			/* printando o restante de n até i com '*' */
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}
