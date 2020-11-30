package com.streaming.seruji_coding.io;

import javax.swing.JOptionPane;

public class PwManagerIO {
	private PwManagerIO() {}
	
	public static String getStringFromUser(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static void sayToUser(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static void showError(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
}
