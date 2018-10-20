package dkupert.cipher.Exceptions;

public class TranspositionException extends CipherException{
	public TranspositionException() {
		super("The TranspositionCipher does not match the requirments");
	}
	public TranspositionException(String msg) {
		super(msg);
	}

}
