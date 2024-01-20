//Rebecca Pina Partidas
// CIS3362

import java.util.Scanner;

public class AffineEncrypt {

	public static void main(String[] args) {
		// Variable initializations
		Scanner scanner = new Scanner(System.in);
		String plaintext = "";
		String encryptedCode = "";
		char encryptedLetter;
		int a;
		int b;
		int j;
		
		//Ea,b(x) = (ax + b) mod 26
		
		// User input for encrypted code
		System.out.println("Please enter the plaintext:");
		plaintext = scanner.nextLine();
		
		// User input for a
		System.out.println("Please enter encryption key a:");
		a = scanner.nextInt();
		
		// User input for b
		System.out.println("Please enter encryption key b:");
		b = scanner.nextInt();
		
		System.out.println("Encrypted Code:");
		
		// Loop through each letter and multiply letter by a and add b
		for (j = 0; j < plaintext.length(); j++) {
			encryptedLetter = (char)(((plaintext.charAt(j)- 'a') * a + b)%26 +'a'); 
			encryptedCode = encryptedCode + encryptedLetter;
		}
		
		// Prints out encrypted code
		System.out.println(encryptedCode);

		scanner.close();

	}

}
