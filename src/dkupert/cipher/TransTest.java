package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;

public class TransTest {
	public static void main(String[] args) throws CipherException {
		TranspositionCipher ts = new TranspositionCipher(3);
		String biba = "hl"+"\n"+"ao"+"\n"+"l"+"\n";
		System.out.println(ts.decrypt(biba));
	}

}
