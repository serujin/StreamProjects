package com.streaming.seruji_coding.utils;

import java.util.Random;

import com.streaming.seruji_coding.constants.PwManagerConstants;

public class PwManagerUtils {
	private static PwManagerUtils instance;
	private Random random;
	
	private PwManagerUtils() {
		random = new Random();
	}
	
	public static PwManagerUtils getInstance() {
		if(instance == null) {
			instance = new PwManagerUtils();
		}
		return instance;
	}
	
	public String getHashedPassword(String password) {
		return getConvertedPassword(password);
	}
	
	private String getConvertedPassword(String password) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < password.length(); i++) {
			builder.append(PwManagerConstants.HASH_SYMBOLS[i]);
		}
		return builder.toString();
	}
 	
	private String getPasswordWithSymbols(String password) {
		StringBuilder builder = new StringBuilder(password);
		for(int i = password.length(); i < PwManagerConstants.PW_LENGTH; i++) {
			builder.append(getRandomSymbol());
		}
		return builder.toString();
	}
	
	private String getRandomSymbol() {
		return PwManagerConstants.HASH_SYMBOLS[random.nextInt(PwManagerConstants.HASH_SYMBOLS.length)];
	}
}
