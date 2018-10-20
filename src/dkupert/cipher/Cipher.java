package dkupert.cipher;
/**
 * This interface is used to reserve the method names, which will be used in
 * later classes
 * 
 * @author dkupert
 * @version 2018-10-17
 */
public interface Cipher {
	/**
	 * Encrypts a Text
	 * 
	 * @param text : Text which will be encrypted
	 * @return : the encrypted text
	 */
	public String encrypt(String text);

	/**
	 * Decrypts a Text
	 * 
	 * @param text : Text which will be decrypted
	 * @return : the decrypted text
	 */
	public String decrypt(String text);
}

