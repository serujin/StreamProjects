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
			builder.append(getCharFromAscii(getDecryptedCharAscii(encrypted.charAt(i))));
		}
		return builder.toString();
	}
	
	private String encrypt(String password) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < password.length(); i++) {
			System.out.println("Encrypted char " + password.charAt(i) + " to --> char " + getCharFromAscii(getEncryptedCharAscii(password.charAt(i))));
			builder.append(getCharFromAscii(getEncryptedCharAscii(password.charAt(i))));
		}
		encrypted = builder.toString();
		return builder.toString();
	}
	
	private char getCharFromAscii(int number) {
		return (char) number;
	}
	
	private int getEncryptedCharAscii(char character) {
		return ((int) character) - numberKey;
	}
	
	private int getDecryptedCharAscii(char character) {
		return ((int) character) + numberKey;
	}
}
