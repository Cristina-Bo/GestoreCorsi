package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	static private final String jdbcURL = "jdbc:mysql://127.0.0.1/iscritticorsi?user=root&password=Pallinomar99";
	static private Connection connection = null;
	
	public static Connection getConnection() {
			
		try {
			if(connection == null) {
			connection = DriverManager.getConnection(jdbcURL);
			} 
			Connection connection = DriverManager.getConnection(jdbcURL);
			return connection;
		}
			catch (SQLException e) {
			System.err.println("Errore Connessione al DB");
			throw new RuntimeException(e);
		}
	}

}
