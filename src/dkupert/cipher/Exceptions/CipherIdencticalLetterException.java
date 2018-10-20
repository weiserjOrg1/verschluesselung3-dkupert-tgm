package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in MonoAlphabeticCipher
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public class CipherIdencticalLetterException extends CipherException{
	/**
	 * The default constructor for the new exception
	 */
	public CipherIdencticalLetterException() {
		super("Secret Alphabet contains two identica Letters");
	}
}
