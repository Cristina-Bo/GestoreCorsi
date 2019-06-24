package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	public static final String jdbcURL = "jdbc:mysql://127.0.0.1/iscritticorsi?user=root&password=Pallinomar99";
	
	public static Connection getConnection() {
		Connection conn;	
		try {
			conn = DriverManager.getConnection(jdbcURL);
		} catch (SQLException e) {
			System.err.println("Errore Connessione al DB");
			throw new RuntimeException(e);
		}
		return conn;
	}

}
