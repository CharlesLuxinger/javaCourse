package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DBIntegrityException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE FROM department " + "WHERE Id= ?");
			st.setInt(1, 8);

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Rows affected: " + rowsAffected);

			} else {
				System.out.println("No rown affected!!!");
			}

		} catch (SQLException sqle) {
			throw new DBIntegrityException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
			DB.closeConnection();
		}

	}

}
