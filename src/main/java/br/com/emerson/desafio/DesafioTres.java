package br.com.emerson.desafio;

import java.util.Arrays;

public class DesafioTres {
	/**
	 * @param input atributo de entrada
	 * @return numero de anagramas achados
	 */
	public int desafio3(String input) {
		int tamanhoAnagrama;
		int contador = 0;
		
		/* inicia em 1 e vai até o tamanho - 1 */
		for (tamanhoAnagrama = 1; tamanhoAnagrama <= input.length() - 1; tamanhoAnagrama++) {
			for (int i = 0; i <= input.length() - tamanhoAnagrama; i++) {
				for (int j = input.length(); j > i + tamanhoAnagrama; j--) {
					if (anagrama(input.substring(i, i + tamanhoAnagrama), input.substring(j - tamanhoAnagrama, j))) {
						contador++;
						break;
					}
				}
			}
		}
		return contador;
	}

	/**
	 * @param s1 String para comparacao no anagrama
	 * @param s2 String para comparacao no anagrama
	 * @return caso as strings forem anagramas.Retornará verdadeiro, senao falso
	 */
	public boolean anagrama(String s1, String s2) {
		/*ordenação do tipo char para encontrar o anagrama
		caso sejam iguais são anagramas.
		*/
		char[] lista1 = s1.toCharArray();
		char[] lista2 = s2.toCharArray();
		
		Arrays.sort(lista1);
		Arrays.sort(lista2);
		if (Arrays.equals(lista1, lista2)) {/*Comparativo de vetores inteiro*/
			return true;
		}
		return false;
	}
}
