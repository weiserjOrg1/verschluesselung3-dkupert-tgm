package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in TranspositionCipher
 * 
 * @author dkupert
 * @version 2018-10-20
 */
public class TranspositionException extends CipherException{
	/**
	 * The default constructor for the new exception
	 */
	public TranspositionException() {
		super("The TranspositionCipher does not match the requirments");
	}
	/**
	 * Return a customized message
	 * @param msg : the message
	 */
	public TranspositionException(String msg) {
		super(msg);
	}

}
