package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in TranspositionCipher
 * 
 * @author dkupert
 * @version 2018-10-20
 */
public class TranspositionCipherToLowException extends TranspositionException{
	/**
	 * The default constructor for the new exception
	 */
	public TranspositionCipherToLowException() {
		super("The Value should go below 1");
	}
	
	

}
