package desafio;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validatePassword {
	/**
	 * M�todo main chama o m�todo validate() e retorna sua resposta;
	 * 
	 * @param String password recebe a palavra que ser� validada no metodo
	 *               validate()
	 * @return int value retorna um n�mero maior que 0 caso a a senha for validada
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
	 * M�todo validate() recebe uma string e analisa, atrav�s de express�es
	 * regulares, se a senha � forte ( senha == 0) ou fraca ( senha > 0).
	 * 
	 * @param passwordLowercase express�o regular que valida se a senha possui
	 *                          caracteres min�sculos
	 * @param passwordUppercase express�o regular que valida se a senha possui
	 *                          caracteres mai�sculos
	 * @param passwordDigit     express�o regular que valida se a senha possui
	 *                          caracteres num�ricos
	 * @param passwordSpecial   express�o regular que valida se a senha possui
	 *                          caracteres especiais
	 * 
	 * @param Boolean           para cada pattern -> Verdadeiro se cumpre os
	 *                          requisitos do pattern -> Falso se n�o cumpre os
	 *                          requisitos do pattern, adiciona 1 a x.
	 * 
	 * @return int x se o tamanho da senha mais o valor de x for maior que 6, sen�o
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
