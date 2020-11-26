package com.streaming.seruji_coding.application;

import com.streaming.seruji_coding.utils.PwManagerUtils;

public class PwManagerApplication {
	public static void main(String[] args) {
		System.out.println(PwManagerUtils.getInstance().getHashedPassword("pepe"));
	}
}
