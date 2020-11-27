package com.streaming.seruji_coding.model;

public class PwAccount {
	private String url;
	private String username; 
	private String password;
	
	public PwAccount(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "PwAccount [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
}
