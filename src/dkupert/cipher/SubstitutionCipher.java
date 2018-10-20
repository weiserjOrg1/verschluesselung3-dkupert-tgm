package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;

/**
 * Uses the parent class MonoAlphabeticCipher to encrypt and decrypt text using the 
 * SubstitutionCipher 
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public class SubstitutionCipher extends MonoAlphabeticCipher {
	/**
	 * Replaces the default Alphabet with the new secret one.
	 * @param secretAlphabet: the new secret alphabet
	 * @throws CipherException:  throws the exception if a problem is found
	 */
	public SubstitutionCipher(String secretAlphabet) throws CipherException {
		super.setSecretAlphabet(secretAlphabet);
	}

	/**
	 * Replaces the default Alphabet with the new secret one.
	 * @param secretAlphabet: the new secret alphabet
	 * @throws CipherException:  throws the exception if a problem is found
	 */
	public void setSecretAlphabet(String secretAlphabet) throws CipherException {
		super.setSecretAlphabet(secretAlphabet);
	}

}
