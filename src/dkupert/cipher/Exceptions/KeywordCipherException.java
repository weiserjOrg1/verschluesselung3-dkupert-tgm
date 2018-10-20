package dkupert.cipher.Exceptions;
/**
 * 
 * @author dkupert
 * @version 2018-10-20
 */
public class KeywordCipherException extends CipherException{
	/**
	 *
	 * 
	 */
	public KeywordCipherException() {
		super("The Keyword does not match the requiements");
	}
	/**
	 * 
	 * @param string
	 */
	public KeywordCipherException(String string) {
		super(string);
	}
}
