package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in MonoAlphabeticCipher
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public class CipherLetterNotSuitableException extends CipherException{
	/**
	 * The default constructor for the new exception
	 */
	public CipherLetterNotSuitableException() {
		super("One Letter in the Alphabet is not suitable for the secret Alphabet");
	}
}
