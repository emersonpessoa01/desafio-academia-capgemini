package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class escada {
	/* faz o escaneamento das teclas */
	static Scanner entrada = new Scanner(System.in);

	/* gera um novo arrayList e atribui para variável degraus */
	static List<String> degraus = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Digite a quantidade de vezes: ");
		int qtdDegraus = entrada.nextInt();

		/*
		 * no primeiro loop, repete 6 vezes espaço vazio menos a quantidade total de
		 * indice e concatena com numero de repeticoes de asterisco com incremento de 1
		 */
		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));

		}
		/* printa a quantidade de asteriscos enquanto não fechar o loop */
		for (String d : degraus) {
			System.out.println(d);
		}
	}

}
