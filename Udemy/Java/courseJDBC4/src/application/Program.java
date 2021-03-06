package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("UPDATE seller " + "SET BaseSalary = ? " + "WHERE Id= ?",
					Statement.RETURN_GENERATED_KEYS);
			st.setDouble(1, 3000.0);
			st.setInt(2, 7);

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Rows affected: " + rowsAffected);

			} else {
				System.out.println("No rown affected!!!");
			}

		} catch (SQLException sqle) {
			System.out.println("SQL ERROR: " + sqle.getMessage());
		} finally {
			DB.closeSatement(st);
			DB.closeConnection();
		}

	}

}
