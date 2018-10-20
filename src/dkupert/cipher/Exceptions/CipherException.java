package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in MonoAlphabeticCipher
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public class CipherException extends Exception{
	/**
	 * The default constructor for the new exception
	 */
	public CipherException() {
		super("secret Alphabet does not match the requierments");
	}

	/**
	 * Return a Message when a exception is thrown
	 * 
	 * @param msg : the message which will be displayed
	 */
	public CipherException(String msg) {
		super(msg);
	}

}
