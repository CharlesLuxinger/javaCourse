package br.com.charles.designpattern.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "12345");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return con;
	}
}
