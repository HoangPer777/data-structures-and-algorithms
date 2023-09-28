package TH1;

// class MyCaesar
public class Task2 {

	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;// shift steps (right shift)

	public Task2(int shiftSteps) {
		this.n = shiftSteps;
	}

	public char encryptChar(char c) {
		char x = c;
		if ('a' <= c && c <= 'z') {
			x = (char) ((c - 'a' + n) % 26 + 'a');
		}
		if ('A' <= c && c <= 'Z') {
			x = (char) ((c - 'A' + n) % 26 + 'A');
		}
		if ('0' <= c && c <= '9') {
			x = (char) ((c - '0' + n) % 10 + '0');
		}
		return x;
	}

	// Encrypt a text using the above function for encrypting a charater.
	public String encrypt(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			sb.append(encryptChar(c));
		}
		return sb.toString();
	}

//	decrypt
	public char decryptChar(char c) {
		char x = c;
		if ('a' <= c && c <= 'z') {
			x = (char) ((c - 'a' - n + 26) % 26 + 'a');
		}
		if ('A' <= c && c <= 'Z') {
			x = (char) ((c - 'A' - n + 26) % 26 + 'A');
		}
		if ('0' <= c && c <= '9') {
			x = (char) ((c - '0' - n + 10) % 10 + '0');
		}
		return x;
	}

	public String decrypt(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			sb.append(decryptChar(c));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Task2 task = new Task2(4);

//		char characterToEncrypt = 'A'; // Ký tự muốn mã hóa
//		char encryptedChar = task.encryptChar(characterToEncrypt);
//		System.out.println("Original Char: " + characterToEncrypt);
//		System.out.println("Encrypted Char: " + encryptedChar);

		String encryptedStringByChar = task.encrypt("aHoangPer123789#!@ ProVip");
		System.out.println(encryptedStringByChar);

//		char characterToDecrypt = 'E'; // Ký tự muốn giải mã
//		char decryptedChar = task.decryptChar(characterToDecrypt);
//		System.out.println("Original Char: " + characterToDecrypt);
//		System.out.println("Decrypted Char: " + decryptedChar);

		String decryptedStringByChar = task.decrypt("eLserkTiv567123#!@ TvsZmt");
		System.out.println(decryptedStringByChar);
	}
}
