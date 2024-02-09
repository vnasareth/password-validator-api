package com.example.demo;

public class PasswordValidatorTest {

	public static void main(String[] args) {
		testInvalidPasswords();
		testValidPasswords();
		testEdgeCasePasswords();
	}

	public static void testInvalidPasswords() {
		assertPasswordValid(false, "", "Vazia");
		assertPasswordValid(false, "aa", "Curta e sem diversidade");
		assertPasswordValid(false, "abAB!12", "Sem o comprimento mínimo");
		assertPasswordValid(false, "AAAbbbCc", "Sem caractere especial");
		assertPasswordValid(false, "AbTp9!foo", "Com caracteres repetidos");
		assertPasswordValid(false, "AbTp9!foA", "Com caracteres repetidos");
		assertPasswordValid(false, "AbTp9 fok", "Com espaço");
	}

	public static void testValidPasswords() {
		assertPasswordValid(true, "AbTp9!fok", "Senha válida");
		assertPasswordValid(true, "AaBbCc123!@#", "Senha válida com múltiplos caracteres especiais");
		assertPasswordValid(true, "12345678Aa!", "Senha válida no limite do comprimento");
	}

	public static void testEdgeCasePasswords() {
		assertPasswordValid(false, "Aa1!Aa1!", "Just below the minimum length");
		assertPasswordValid(true, "Aa1!Aa1!b", "Exactly at the minimum length");
	}

	private static void assertPasswordValid(boolean expected, String password, String message) {
		boolean isValid = PasswordValidator.isValid(password);
		if (isValid == expected) {
			System.out.println("Teste passou para condição: " + message);
		} else {
			System.out.println("Teste FALHOU para condição: " + message);
		}
	}
}
