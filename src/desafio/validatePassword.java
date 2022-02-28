package desafio;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validatePassword {
	/**
	 * Método main chama o método validate() e retorna sua resposta;
	 * 
	 * @param String password recebe a palavra que será validada no metodo
	 *               validate()
	 * @return int value retorna um número maior que 0 caso a a senha for validada
	 *         como fraca ou 0 se a senha for validada como forte.
	 */

	public static void main(String[] args) {
		String password;
		int value;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Entre com sua senha: ");
			password = scanner.next();
		}
		value = validate(password);

		System.out.println(value);

	}

	/**
	 * Método validate() recebe uma string e analisa, através de expressões
	 * regulares, se a senha é forte ( senha == 0) ou fraca ( senha > 0).
	 * 
	 * @param passwordLowercase expressão regular que valida se a senha possui
	 *                          caracteres minúsculos
	 * @param passwordUppercase expressão regular que valida se a senha possui
	 *                          caracteres maiúsculos
	 * @param passwordDigit     expressão regular que valida se a senha possui
	 *                          caracteres numéricos
	 * @param passwordSpecial   expressão regular que valida se a senha possui
	 *                          caracteres especiais
	 * 
	 * @param Boolean           para cada pattern -> Verdadeiro se cumpre os
	 *                          requisitos do pattern -> Falso se não cumpre os
	 *                          requisitos do pattern, adiciona 1 a x.
	 * 
	 * @return int x se o tamanho da senha mais o valor de x for maior que 6, senão
	 *         retorna int y, indicando quantos digitos faltam para formar uma senha
	 *         forte.
	 * 
	 */
	public static Integer validate(String password) {
		int length = password.length();
		int x = 0;
		int y;

		boolean passwordLowercase = Pattern.matches("^(?=.*[a-z]).+$", password),
				passwordUppercase = Pattern.matches("^(?=.*[A-Z]).+$", password),
				passwordDigit = Pattern.matches("^(?=.*\\d).+$", password),
				passwordSpecial = Pattern.matches("^(?=.*[-+_!@#$%^&*.,?]).+$", password);
		if (passwordLowercase == false) {
			x += 1;
		}
		if (passwordUppercase == false) {
			x += 1;
		}
		if (passwordDigit == false) {
			x += 1;
		}
		if (passwordSpecial == false) {
			x += 1;
		}
		if (length + x >= 6) {
			return x;
		} else {
			y = (6 - length);
			return y;
		}

	}

}
