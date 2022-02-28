package br.com.emerson.desafio;

public class DesafioDois {

	/**
	 * @param input Parametro de entrada
	 * @return numero de caracteres para adicionar e deixar a senha forte.
	 */
	public int desafio2(String input) {
		String simbolos = "!@#$%^&*()-+"; 
		/*
		* guardando caracteres especiais para comparativo e subtrair no final. As
		* variaveis inteiro irao iniciar em 1. Se exista o que busca. Caso retorne
		* 0, não irá subtrair
		*/
		int senhaNumero = 1;
		int senhaMaiuscula = 1;
		int senhaMinuscula = 1;
		int senhaSimbolo = 1;
		char[] verificaSenha = input.toCharArray();
		for (char c : verificaSenha) { // faz verificao de caracter da senha.
			if (Character.isDigit(c)) {
				senhaNumero = 0;
			} else if (Character.UPPERCASE_LETTER == Character.getType(c)) {
				senhaMaiuscula = 0;
			} else if (Character.LOWERCASE_LETTER == Character.getType(c)) {
				senhaMinuscula = 0;
			} else if (simbolos.contains(String.valueOf(c))) {
				senhaSimbolo = 0;
			}
		}
		return (Math.max(6 - verificaSenha.length, (senhaNumero + senhaMaiuscula + senhaMinuscula + senhaSimbolo)));
	}
}
