package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in Keywordcipher
 * @author dkupert
 * @version 2018-10-20
 */
public class KeywordCipherNotSuitableException extends KeywordCipherException{
	/**
	 * The default constructor for the new exception
	 */
	public KeywordCipherNotSuitableException() {
		super("The Keyword should not contain special symbols");
	}

}
