package com.streaming.seruji_coding.io;

import javax.swing.JOptionPane;

public class PwManagerIO {
	private static PwManagerIO instance;	
	
	private PwManagerIO() {}
	
	public static PwManagerIO getInstance() {
		if(instance == null) {
			instance = new PwManagerIO();
		}
		return instance;
	}
	
	public String getStringFromUser(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
}
