package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;

/**
 * This class contains all the Methods which will be needed to Encrypt/Decrypt and switch Modes in the GUI
 * @author dkupert
 * @version 2018-10-18
 */
public class GUICipherModel {
	
	private MonoAlphabeticCipher mac;
	private TranspositionCipher tsp;
	private String mode;
	
	//Constructor
	/**
	 * This is the default constructor for this class. It initializes the Attributes for the Model
	 * @throws CipherException 
	 */
	public GUICipherModel() throws CipherException {
		this.mode = "normal";
		this.mac = new MonoAlphabeticCipher();
		this.tsp = new TranspositionCipher(2);
		
	}
	
	/**
	 * This Method uses the principle of polymorphism to switch the MonoAlphabeticCipher into 
	 * either the ShiftCipher or the SubstitutionCipher 
	 * 
	 * @param mode : dictates which Cipher should be used
	 * @param parameter : Either the SecretAlphabet or the ShiftValue
	 * @throws NumberFormatException :throws the Exception if the Mode is Shift but Parameter isn't a number 
	 * @throws CipherException : Throws the Exception if the Parameter can't be used 
	 */
	public void changeMode(String mode, String parameter) throws NumberFormatException, CipherException{
		switch(mode) {
			case "shift" :
				this.mac = new MonoAlphabeticCipher();
				this.mac = new ShiftCipher(Integer.parseInt(parameter));
				this.mode = "shift";
			break;
			case "sub" :
				this.mac = new MonoAlphabeticCipher();
				this.mac = new SubstitutionCipher(parameter);
				this.mode = "shift";
			break;
			case "key" :
				this.mac = new MonoAlphabeticCipher();
				this.mac = new KeywordCipher(parameter);
				this.mode = "key";
			break;
			case "trans" :
				this.tsp = new TranspositionCipher(Integer.parseInt(parameter));
				this.mode = "key";
			break;
		}
	}	
	/**
	 * Decrypts the Text
	 * @param text : which is to be decrypted 
	 * @return : returns the decrypted text
	 */
	public String decrypt(String text) {
		return this.mac.decrypt(text);
	}
	/**
	 * Encrypts the Text
	 * @param text : which is to be encrypted
	 * @return : returns the encrypted text
	 */
	public String encrypt(String text) {
		return this.mac.encrypt(text);
	}
	/**
	 * 
	 * @param text
	 * @return
	 */
	public String tDecrypt(String text) {
		return this.tsp.decrypt(text);
	}
	/**
	 * Encrypts the Text
	 * @param text : which is to be encrypted
	 * @return : returns the encrypted text
	 */
	public String tEncrypt(String text) {
		return this.tsp.encrypt(text);
	}
}
