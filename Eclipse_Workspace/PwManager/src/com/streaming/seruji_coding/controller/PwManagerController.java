package com.streaming.seruji_coding.controller;

import com.streaming.seruji_coding.constants.PwManagerConstants;
import com.streaming.seruji_coding.io.PwManagerIO;
import com.streaming.seruji_coding.utils.PwManagerUtils;

public class PwManagerController {
	private static PwManagerController instance;
	
	private PwManagerController() {};
	
	public static PwManagerController getInstance() {
		if(instance == null) {
			instance = new PwManagerController();
		}
		return instance;
	}
	
	public void start() {
		manageAccount();
		userInteraction();
		stop();
	}
	
	private void manageAccount() {
		if(PwManagerUtils.getInstance().needToRegister()) {
			register();
		}
//		login();
	}
	
	private void userInteraction() {
		int option = getUserAction();
		while(option != PwManagerConstants.EXIT_OPTION) {
			doAction(option);
			option = getUserAction();
		}
	}
	
	private void stop() {
		PwManagerIO.getInstance().sayToUser(PwManagerConstants.TO_USER_MESSAGES[3]);
	}
	
	private void register() {
		String username = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
		String password = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		while(!PwManagerUtils.getInstance().isAValidLogin(username, password)) {
			PwManagerIO.getInstance().showError(PwManagerConstants.POSSIBLE_ERRORS[0]);
			username = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
			password = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		}
		PwManagerIO.getInstance().sayToUser(PwManagerConstants.TO_USER_MESSAGES[0]);
	}
	
	private void login() {
		String username = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
		String password = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		while(!PwManagerUtils.getInstance().isAValidLogin(username, password)) {
			PwManagerIO.getInstance().showError(PwManagerConstants.POSSIBLE_ERRORS[1]);
			username = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
			password = PwManagerIO.getInstance().getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		}
		PwManagerIO.getInstance().sayToUser(PwManagerConstants.TO_USER_MESSAGES[1]);
	}
	
	private void doAction(int option) {
		switch(option) {
			case 0:
				System.out.println("New password stored");
				break;
			case 1:
				System.out.println("Password copied to clipboard");
				break;
			case 2:
				System.out.println("Log out");
				break;
			default:
				System.out.println("Select exit");
		}
	}
	
	private void storePassword() {
		//TODO
	}
	
	private void takePassword() {
		//TODO
	}
	
	private void logOut() {
		//DISCONNECT FROM USER
		login();
	}
	
	private int getUserAction() {
		int option = PwManagerUtils.getInstance().showOptionsMenu(PwManagerConstants.TO_USER_MESSAGES[2], PwManagerConstants.OPTIONS_TITLE, PwManagerConstants.USER_ACTIONS);
		return option;
	}
}
