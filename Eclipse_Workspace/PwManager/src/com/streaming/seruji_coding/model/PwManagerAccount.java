package com.streaming.seruji_coding.model;

public class PwManagerAccount {
	private String username;
	private String password;
	
	public PwManagerAccount(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}	