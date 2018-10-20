package dkupert.cipher.Exceptions;

public class KeywordCipherNotSuitableException extends KeywordCipherException{
	
	public KeywordCipherNotSuitableException() {
		super("The Keyword should not contain special symbols");
	}

}
