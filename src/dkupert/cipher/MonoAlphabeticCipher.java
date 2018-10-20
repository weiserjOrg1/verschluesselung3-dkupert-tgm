package dkupert.cipher;
import dkupert.cipher.Exceptions.CipherException;
import dkupert.cipher.Exceptions.CipherIdencticalLetterException;
import dkupert.cipher.Exceptions.CipherLetterNotSuitableException;
import dkupert.cipher.Exceptions.CipherTooLongOrShortException;

/**
 * This class provides all the methods to encrypt and decrypt text
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public class MonoAlphabeticCipher implements Cipher{
	//Constants
	public static final String defaultAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
	
	public static final int AlphabetLength = 30;
		
	public static final int IndexOfa = 97;
	public static final int IndexOfz = 122;
	
	public static final int IndexOfö = 246;
	public static final int IndexOfä = 228;
	public static final int IndexOfü = 252;
	public static final int IndexOfß = 223;
	//Attributes
	private String secretAlphabet;
	
	//Constructor
	/**
	 * This is the default constructor for this class. It initializes the secret ALphabet with our normal Alphabet
	 */
	public MonoAlphabeticCipher() {
		this.secretAlphabet = defaultAlphabet;
	}
	/**
	 * This Method return the String
	 * @return return the secretAlphabet 
	 */
	public String getSecretAlphabet() {
		return this.secretAlphabet;
	}
	/**
	 * Changes the secret alphabet after it passes the exception
	 * @param secretAlphabet : is the new secret alphabet
	 * @throws CipherException : throws the exception if a problem is found
	 */
	protected void setSecretAlphabet(String secretAlphabet) throws CipherException{
		this.secretAlphabet = checkSecretAlphabet(secretAlphabet);
	}
	/**
	 * Encrypts a Text
	 * 
	 * @param text : Text which will be encrypted
	 * @return : the encrypted text
	 */
	public String encrypt(String text) {
		String encryptedText = "";
		text = text.toLowerCase();
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int place = defaultAlphabet.indexOf(c);
			if(place == -1) {
				encryptedText = encryptedText + c;
			}else {
				encryptedText = encryptedText + this.secretAlphabet.charAt(place);
			}
		}
		return encryptedText;
	}
	/**
	 * Decrypts a Text
	 * 
	 * @param text : Text which will be decrypted
	 * @return : the decrypted text
	 */
	public String decrypt(String text) {
		String decryptedText = "";
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int place = this.secretAlphabet.indexOf(c);
			if(place == -1) {
				decryptedText = decryptedText + c;
			}else {
				decryptedText =  decryptedText + defaultAlphabet.charAt(place);
			}
		}
		return decryptedText;
	}
	//Exception
	/**
	 * This Method is used to check the secret Alphabet after specific criteria
	 * 
	 * @param alph : The new secret Alphabet
	 * @return : return the alphabet if it passes the tests
	 * @throws CipherException : throws the exception if a problem is found
	 */
	public static String checkSecretAlphabet(String alph) throws CipherException{
		alph = alph.toLowerCase();
		if(alph.length() == AlphabetLength) {
			for(int i = 0; i < alph.length(); i++) {
				int charCounter = 0;
				for(int j = 0; j < alph.length(); j++) {
					if(alph.charAt(i) == alph.charAt(j)) {
						charCounter++;
					}
				}
				if(charCounter > 1) {
					throw new CipherIdencticalLetterException();
				}
			}
		}else {
			throw new CipherTooLongOrShortException();
		}
		for(int i = 0; i < alph.length(); i++) {
			char c = alph.charAt(i);
			if((c >= IndexOfa  && c <= IndexOfz) ||
					(c == IndexOfß) || (c == IndexOfä) || (c == IndexOfö) ||
					(c == IndexOfü)
					) 
			{
			}else {
				throw new CipherLetterNotSuitableException();
			}
		}
		return alph;
	}
}