package dkupert.cipher;

import dkupert.cipher.Exceptions.CipherException;
import dkupert.cipher.Exceptions.KeywordCipherException;
import dkupert.cipher.Exceptions.KeywordCipherNotSuitableException;

/**
 * 
 * @author dkupert
 * @version 2018-10-20
 */
public class KeywordCipher extends MonoAlphabeticCipher{
	
	public static final int IndexOfa = 97;
	public static final int IndexOfz = 122;
	
	public static final int IndexOfö = 246;
	public static final int IndexOfä = 228;
	public static final int IndexOfü = 252;
	public static final int IndexOfß = 223;
	
	/**
	 * 
	 * @param keyword
	 */
	public KeywordCipher(String keyword) throws CipherException{
		String defaultAlp = "abcdefghijklmnopqrstuvwxyzäöüß";
		String newAlp = "";
		String key = keyword.toLowerCase();
		
		for(int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if((c >= IndexOfa  && c <= IndexOfz) ||
					(c == IndexOfß) || (c == IndexOfä) || (c == IndexOfö) ||
					(c == IndexOfü)
					) 
			{	
			}else {
				throw new KeywordCipherNotSuitableException();
			}
			boolean repeat = false;
			for(int j = 0; j < i; j++) {
				if(key.charAt(i) == key.charAt(j)) {
					repeat = true;
				}
			}
			if(repeat == false) {
				newAlp = newAlp + c;	
			}
		}
		for(int i = 0; i < defaultAlp.length(); i++) {
			char c = defaultAlp.charAt(i);
			boolean contains = false;
			for(int j = 0; j < newAlp.length(); j++) {
				if(defaultAlp.charAt(i) == newAlp.charAt(j)) {
					contains = true;
				}
			}
			if(contains == false) {
				newAlp = newAlp + c;
			}
		}
		System.out.println(newAlp);
	}
	/**
	 * 
	 * @param keyword
	 * @throws CipherException 
	 */
	public void setKeyword(String keyword) throws CipherException {
		String defaultAlp = "abcdefghijklmnopqrstuvwxyzäöüß";
		String newAlp = "";
		String key = keyword.toLowerCase();
		
		for(int i = 0; i < key.length(); i++) {
			char c = key.charAt(i);
			if((c >= IndexOfa  && c <= IndexOfz) ||
					(c == IndexOfß) || (c == IndexOfä) || (c == IndexOfö) ||
					(c == IndexOfü)
					) 
			{	
			}else {
				throw new KeywordCipherNotSuitableException();
			}
			boolean repeat = false;
			for(int j = 0; j < i; j++) {
				if(key.charAt(i) == key.charAt(j)) {
					repeat = true;
				}
			}
			if(repeat == false) {
				newAlp = newAlp + c;	
			}
		}
		for(int i = 0; i < defaultAlp.length(); i++) {
			char c = defaultAlp.charAt(i);
			boolean contains = false;
			for(int j = 0; j < newAlp.length(); j++) {
				if(defaultAlp.charAt(i) == newAlp.charAt(j)) {
					contains = true;
				}
			}
			if(contains == false) {
				newAlp = newAlp + c;
			}
		}
	}
}
