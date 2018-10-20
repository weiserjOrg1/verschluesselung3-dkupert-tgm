package dkupert.cipher.Exceptions;
/**
 * This class contains a custom exception which is used in MonoAlphabeticCipher
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public class ShiftCipherException extends CipherException{
	/**
	 * The default constructor for the new exception
	 */
	public ShiftCipherException() {
		super("The shift value does not match the requierments");
	}
}
