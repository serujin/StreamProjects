package com.streaming.seruji_coding.model;

import com.streaming.seruji_coding.constants.PwManagerConstants;

public class PwEncrypter {
	private String key;
	private int numberKey;
	private String encrypted; //DELETE THIS WHEN WE HAVE DATABASE (TAKE IT FROM THERE)
	
	public PwEncrypter(String key) {
		this.key = key;
		initAscii();
	}
	
	public String getEncryptedPw(String password) {
		return encrypt(password);
	}
	
	public String getDecryptedPw() {
		return decrypt();
	}
	
	private void initAscii() {
		numberKey = 0;
		int keyLength = key.length();
		for(int i = 0; i < keyLength; i++) {
			numberKey += (int)key.charAt(i);
		}
		numberKey = (numberKey / keyLength) - PwManagerConstants.ASCII_MIN;
	}
	
	private String decrypt() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < encrypted.length(); i++) {
			builder.append(getDecryptedChar(encrypted.charAt(i)));
		}
		encrypted = builder.toString();
		return builder.toString();
	}
	
	private String encrypt(String password) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < password.length(); i++) {
			builder.append(getEncryptedChar(password.charAt(i)));
		}
		encrypted = builder.toString();
		return builder.toString();
	}
	
	private char getEncryptedChar(char toEncrypt) {
		int ascii = (int) toEncrypt;
		int encryptedAscii = ascii - numberKey; //TODO : IT WILL MAYBE FAIL IF WE IMPLEMENT THE DATABASE
		return (char) encryptedAscii;
	}
	
	private char getDecryptedChar(char toDecrypt) {
		int ascii = (int) toDecrypt;
		int decryptedAscii = ascii + numberKey; //TODO : IT WILL MAYBE FAIL IF WE IMPLEMENT THE DATABASE
		return (char) decryptedAscii;
	}
}
