package com.streaming.seruji_coding.controller;

public class PwManagerController {
	private static PwManagerController instance;
	
	private PwManagerController() {};
	
	public static PwManagerController getInstance() {
		if(instance == null) {
			instance = new PwManagerController();
		}
		return instance;
	}
}
