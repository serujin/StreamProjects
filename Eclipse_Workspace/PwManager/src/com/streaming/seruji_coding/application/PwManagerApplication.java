package com.streaming.seruji_coding.application;

import com.streaming.seruji_coding.controller.PwManagerController;
import com.streaming.seruji_coding.io.PwManagerIO;
import com.streaming.seruji_coding.model.PwAccount;
import com.streaming.seruji_coding.model.PwEncrypter;

public class PwManagerApplication {
	public static void main(String[] args) {
//		PwEncrypter pw = new PwEncrypter("¿adwdaAwadc))(()(");
//		System.out.println(pw.getEncryptedPw("contraseña"));
//		System.out.println(pw.getDecryptedPw());
//		String pwManagerPassword = PwManagerIO.getInstance().getStringFromUser("Inserta tu contraseña");
//		String url = PwManagerIO.getInstance().getStringFromUser("Inserta la url de la página web");
//		String user = PwManagerIO.getInstance().getStringFromUser("Inserta tu usuario en la página web");
//		String password = PwManagerIO.getInstance().getStringFromUser("Inserta tu contraseña en la página web");
//		PwAccount gmail = new PwAccount(url, user, password);
//		PwEncrypter pw = new PwEncrypter("mandalena");
//		System.out.println(pw.getEncryptedPw("contraseña"));
//		System.out.println(pw.getDecryptedPw());
		PwManagerController.getInstance().start();
	}
}
