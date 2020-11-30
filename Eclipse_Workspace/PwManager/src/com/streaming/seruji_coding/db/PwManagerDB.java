package com.streaming.seruji_coding.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.streaming.seruji_coding.constants.PwManagerConstants;

public class PwManagerDB {
	private static PwManagerDB instance;
	private Connection connection;
	
	private PwManagerDB() throws SQLException {
		connection = DriverManager.getConnection(PwManagerConstants.DB_CONNECT, "", PwManagerConstants.DB_PASSWORD);
	}
	
	public static PwManagerDB getInstance() throws SQLException {
		if(instance == null) {
			instance = new PwManagerDB();
		}
		return instance;
	}
}
