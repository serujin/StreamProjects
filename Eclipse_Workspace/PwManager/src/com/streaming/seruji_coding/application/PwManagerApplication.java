package com.streaming.seruji_coding.application;

import com.streaming.seruji_coding.controller.PwManagerController;
import com.streaming.seruji_coding.io.PwManagerIO;
import com.streaming.seruji_coding.model.PwAccount;
import com.streaming.seruji_coding.model.PwEncrypter;

public class PwManagerApplication {
	public static void main(String[] args) {
//		PwEncrypter pw = new PwEncrypter("�adwdaAwadc))(()(");
//		System.out.println(pw.getEncryptedPw("contrase�a"));
//		System.out.println(pw.getDecryptedPw());
//		String pwManagerPassword = PwManagerIO.getInstance().getStringFromUser("Inserta tu contrase�a");
//		String url = PwManagerIO.getInstance().getStringFromUser("Inserta la url de la p�gina web");
//		String user = PwManagerIO.getInstance().getStringFromUser("Inserta tu usuario en la p�gina web");
//		String password = PwManagerIO.getInstance().getStringFromUser("Inserta tu contrase�a en la p�gina web");
//		PwAccount gmail = new PwAccount(url, user, password);
//		PwEncrypter pw = new PwEncrypter("mandalena");
//		System.out.println(pw.getEncryptedPw("contrase�a"));
//		System.out.println(pw.getDecryptedPw());
		PwManagerController.getInstance().start();
	}
}
