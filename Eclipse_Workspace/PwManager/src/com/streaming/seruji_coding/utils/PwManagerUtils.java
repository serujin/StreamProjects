package com.streaming.seruji_coding.utils;

import javax.swing.JOptionPane;
import com.streaming.seruji_coding.constants.PwManagerConstants;

public class PwManagerUtils {	
	private PwManagerUtils() {}
	
	public static int showOptionsMenu(String message, String title, String[] options) {
		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, PwManagerConstants.ERROR_CODE);
	}
	
	public static boolean needToRegister() {
		return false;
	}
	
	public static boolean isAValidLogin(String username, String password) {
		return PwManagerUtils.isAValidString(username) && PwManagerUtils.isAValidString(password);
	}

	public static boolean isAValidString(String str) {
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
