package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;
/**
 * This class is used to test the transpositioncipher
 * @author dkupert
 * @version 2018-10-20
 */
public class TransTest {
	public static void main(String[] args) throws CipherException {
		TranspositionCipher ts = new TranspositionCipher(2);
		//String biba = "h"+"\n"+"a"+"\n"+"l"+"\n"+"l"+"\n"+"o"+"\n";
		System.out.println(ts.encrypt("Hallo"));
		System.out.println(ts.decrypt(ts.encrypt("Hallo")));
	}

}
