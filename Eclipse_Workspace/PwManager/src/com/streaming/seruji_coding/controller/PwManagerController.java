package com.streaming.seruji_coding.controller;

import com.streaming.seruji_coding.constants.PwManagerConstants;
import com.streaming.seruji_coding.io.PwManagerIO;
import com.streaming.seruji_coding.utils.PwManagerUtils;

public class PwManagerController {
	private PwManagerController() {};
	
	public void start() {
		manageAccount();
		userInteraction();
		stop();
	}
	
	private static void manageAccount() {
		if(PwManagerUtils.needToRegister()) {
			register();
		}
//		login();
	}
	
	private static void userInteraction() {
		int option = getUserAction();
		while(option != PwManagerConstants.EXIT_OPTION) {
			doAction(option);
			option = getUserAction();
		}
	}
	
	private static void stop() {
		PwManagerIO.sayToUser(PwManagerConstants.TO_USER_MESSAGES[3]);
	}
	
	private static void register() {
		String username = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
		String password = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		while(!PwManagerUtils.isAValidLogin(username, password)) {
			PwManagerIO.showError(PwManagerConstants.POSSIBLE_ERRORS[0]);
			username = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
			password = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		}
		PwManagerIO.sayToUser(PwManagerConstants.TO_USER_MESSAGES[0]);
	}
	
	private static void login() {
		String username = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
		String password = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		while(!PwManagerUtils.isAValidLogin(username, password)) {
			PwManagerIO.showError(PwManagerConstants.POSSIBLE_ERRORS[1]);
			username = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_USER_MSG);
			password = PwManagerIO.getStringFromUser(PwManagerConstants.LOGIN_PASS_MSG);
		}
		PwManagerIO.sayToUser(PwManagerConstants.TO_USER_MESSAGES[1]);
	}
	
	private static void doAction(int option) {
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
	
	private static void storePassword() {
		//TODO
	}
	
	private static void takePassword() {
		//TODO
	}
	
	private static void logOut() {
		//DISCONNECT FROM USER
		login();
	}
	
	private static int getUserAction() {
		int option = PwManagerUtils.showOptionsMenu(PwManagerConstants.TO_USER_MESSAGES[2], PwManagerConstants.OPTIONS_TITLE, PwManagerConstants.USER_ACTIONS);
		return option;
	}
}
