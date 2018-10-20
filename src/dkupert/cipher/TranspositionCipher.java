package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;
import dkupert.cipher.Exceptions.TranspositionCipherToLowException;
/**
 * This class encrypts and decrypts a Text based on the transposition cipher principle 
 * @author dkupert
 * @version 2018-10-20
 */
public class TranspositionCipher implements Cipher{
	
	private int transpositionLevel; 	
	/**
	 * This is a constructor for this class which initializes the transpositiolevel
	 * @param level : the transposition lvl
	 * @throws CipherException : throws the exception if the lvl is not correct 
	 */
	public TranspositionCipher(int level) throws CipherException{
		if(level < 1) {
			throw new TranspositionCipherToLowException();
		}
		this.transpositionLevel = level;
	}
	/**
	 * This Method set the transposition lvl
	 * @param level : the transposition lvl
	 * @throws CipherException : throws the exception if the lvl is not correct 
	 */
	public void setTranspositionLevel(int level) throws CipherException{
		if(level < 1) {
			throw new TranspositionCipherToLowException();
		}
		this.transpositionLevel = level;
	}
	@Override
	/**
	 * Encrypts the Text
	 */
	public String encrypt(String text) {
		//
		//
		text = text.replace(" ", "");
		String[] placeHolder = new String[this.transpositionLevel];
		for(int i = 0; i < placeHolder.length; i++) {
			placeHolder[i] = "";
		}
		String encryptedText = "";
		
		int counter = 0;
		for(int i = 0; i < text.length(); i++) {
			int resetVal = counter%this.transpositionLevel;
			if(resetVal == 0) {
				counter = 0;
			}
			placeHolder[counter] = placeHolder[counter] + text.charAt(i);
			counter++;
		}
		//
		for(int i = 0; i < placeHolder.length; i++) {
			encryptedText = encryptedText + placeHolder[i] + " "; 
		}
		return encryptedText;
	}

	@Override
	/**
	 * Decryptes the text
	 */
	public String decrypt(String text) {
		// check if \n == translvl
		int count = text.length() - text.replace(" ", "").length();
		if(count != this.transpositionLevel) {
			return text;
		}
		
		
		String usedText = text;
		String[] textFragments = new String[this.transpositionLevel];
		
		String decryptedText = "";
		
		for(int i = 0; i < textFragments.length; i++) {
			textFragments[i] = "";
		}
		//splitting the Text
		for(int i = 0; i < this.transpositionLevel;) {
			int help = usedText.indexOf(" ");
			textFragments[i] = usedText.substring(0, usedText.indexOf(" "));
			i++;
			if(i < this.transpositionLevel) {
				usedText = usedText.substring(usedText.indexOf(" ")+1, usedText.length());
			}
		}
		int counter = 0;
		int[] counters = new int[this.transpositionLevel];
		for(int i = 0; i < text.length()-this.transpositionLevel; i++) {
			int resetVal = counter%this.transpositionLevel;
			if(resetVal == 0) {
				counter = 0;
			}
			decryptedText = decryptedText + textFragments[counter].charAt(counters[counter]);
			counters[counter] = counters[counter] + 1;
			counter++;
		}
		return decryptedText;
	}

}
