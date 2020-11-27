package com.streaming.seruji_coding.constants;

public class PwManagerConstants {
	public static final int PW_LENGTH = 100;
	public static final int ASCII_MIN = 33;
	
	public static final String[] INVALID_STRINGS = {"", "null"};
	
	public static final String ERROR_MSG = "ERROR: ";
	public static final String[] POSSIBLE_ERRORS = {
		"The username or the password specified are not valid,\ntry to register again",	
		"The username or the password specified are not valid,\ntry to login again"	
	};
	public static final int ERROR_CODE = -1;
	
	public static final String OPTIONS_TITLE = "Select one option";
	public static final String[] TO_USER_MESSAGES = {
		"Succesfully registered",
		"Succesfully loged in!!",
		"What do you want to do?",
		"Thank you for using PwManager, see you soon!!"
	};
	public static final String[] USER_ACTIONS = {
		"Store new password",
		"Get stored password",
		"Log out",
		"Exit"
	};
	public static final int EXIT_OPTION = 3;
	
	public static final String LOGIN_USER_MSG = "Introduce your username";
	public static final String LOGIN_PASS_MSG = "Introduce your password";
	
	private PwManagerConstants() {}

}
