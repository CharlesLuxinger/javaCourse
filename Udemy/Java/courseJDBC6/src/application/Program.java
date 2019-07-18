package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

			if (rows1 > 0) {
				System.out.println("Rows 1 affected: " + rows1);
			}
			
			if (rows2 > 0) {
				System.out.println("Rows 2 affected: " + rows2);
				//throw new SQLException("Fake ERROR");
			}
			
			if (!(rows1 > 0 && rows2 > 0)) {
				System.out.println("No rown affected!!!");
			}
			
			conn.commit();
		} catch (SQLException sqle) {
			DB.rollBack(conn, sqle.getMessage());
		} finally {
			DB.closeSatement(st);
			DB.closeConnection();
		}

	}

}
