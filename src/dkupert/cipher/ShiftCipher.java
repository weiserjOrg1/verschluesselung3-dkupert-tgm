package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;
import dkupert.cipher.Exceptions.ShiftCipherException;

/**
 * Uses the parent class MonoAlphabeticCipher to encrypt and decrypt text using the 
 * ShiftCipher 
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public class ShiftCipher extends MonoAlphabeticCipher{
	/**
	 * This is a constructor for this class which sets the shift value
	 * @param value : the shift value
	 * @throws CipherException : throws the exception if the value ins't correct
	 */
	public ShiftCipher(int value) throws CipherException{
		String defaultAlphabet = "abcdefghijklmnopqrstuvwxyz����";
		String newAlphabet = "";
		int shiftValue = value; 
		
		if(value > 29  || value < 1) {
			throw new ShiftCipherException();
		}
		for(int i = 0; i < defaultAlphabet.length(); i++) {
			int shiftedPos = i + shiftValue;
			if(shiftedPos > 29) {
				shiftedPos = shiftedPos - 30;
			}
			newAlphabet += "" + defaultAlphabet.charAt(shiftedPos); 
			
		}
		
		super.setSecretAlphabet(newAlphabet);
	}
	/**
	 * This is a Method for this class which sets the shift value
	 * @param value : the shift value
	 * @throws CipherException : throws the exception if the value ins't correct
	 */
	public void setShiftCipher(int value) throws CipherException{
		String defaultAlphabet = "abcdefghijklmnopqrstuvwxyz����";
		String newAlphabet = "";
		int shiftValue = value; 
		
		if(value > 29  && value < 1) {
			throw new ShiftCipherException();
		}
		for(int i = 0; i < defaultAlphabet.length(); i++) {
			int shiftedPos = i + shiftValue;
			if(shiftedPos > 29) {
				shiftedPos = shiftedPos - 30;
			}
			newAlphabet += "" + defaultAlphabet.charAt(shiftedPos); 
			
		}
		super.setSecretAlphabet(newAlphabet);
	}
}
