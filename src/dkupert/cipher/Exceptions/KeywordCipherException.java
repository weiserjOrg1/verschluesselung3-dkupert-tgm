package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in Keywordcipher
 * @author dkupert
 * @version 2018-10-20
 */
public class KeywordCipherException extends CipherException{
	/**
	 * The default constructor for the new exception
	 */
	public KeywordCipherException() {
		super("The Keyword does not match the requiements");
	}
	/**
	 * Constructor which return a customized message
	 * @param string : the message
	 */
	public KeywordCipherException(String string) {
		super(string);
	}
}
