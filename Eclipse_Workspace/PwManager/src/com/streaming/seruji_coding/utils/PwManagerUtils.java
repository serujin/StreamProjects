package com.streaming.seruji_coding.utils;

import javax.swing.JOptionPane;

import com.streaming.seruji_coding.constants.PwManagerConstants;

public class PwManagerUtils {
	private static PwManagerUtils instance;
	
	private PwManagerUtils() {}
	
	public static PwManagerUtils getInstance() {
		if(instance == null) {
			instance = new PwManagerUtils();
		}
		return instance;
	}
	
	public int showOptionsMenu(String message, String title, String[] options) {
		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, PwManagerConstants.ERROR_CODE);
	}
	
	public boolean needToRegister() {
		return false;
	}
	
	public boolean isAValidLogin(String username, String password) {
		return isAValidString(username) && isAValidString(password);
	}

	public boolean isAValidString(String str) {
		if(str == null) {
			return false; //MAYBE CHANGE THIS TO WANT TO EXIT FROM THE PROGRAM
		}
		for(String toCheck : PwManagerConstants.INVALID_STRINGS) {
			if(str.equals(toCheck)) {
				return false;
			}
		}
		return true;
	}
}
