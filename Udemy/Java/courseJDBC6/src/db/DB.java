package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	private static Connection conn = null;

	// M�todo para carregar os dados de conex�o
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.Properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException ioe) {
			throw new DBException(ioe.getMessage());
		}
	}

	// M�todo para conectar ao DB
	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException sqle) {
				throw new DBException(sqle.getMessage());
			}
		}
		return conn;
	}

	// M�todo para fechar conex�o ao DB
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException sqle) {
				throw new DBException(sqle.getMessage());
			}

		}
	}

	// M�todo auxiliar para fechar Statements
	public static void closeSatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException sqle) {
				throw new DBException(sqle.getMessage());
			}
		}
	}

	// M�todo auxiliar para fechar ResultSet
	public static void closeResultSet(ResultSet rst) {
		if (rst != null) {
			try {
				rst.close();
			} catch (SQLException sqle) {
				throw new DBException(sqle.getMessage());
			}
		}
	}
	
	// M�todo auxiliar para Rollback 
	public static void rollBack(Connection conn, String msg) {
		if (conn != null) {
			try {
				conn.rollback();
				throw new DBException("Transaction Rolled back!!! Caused: by: " + msg);
			} catch (SQLException e) {
				throw new DBException("Error trying to rollback!!! Caused: by: " + e.getMessage());
			}
		}
	}
}
