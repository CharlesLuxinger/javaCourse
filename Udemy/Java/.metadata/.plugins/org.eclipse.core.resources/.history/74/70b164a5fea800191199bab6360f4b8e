package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
				    "VALUES (?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Maria Joaquina");
			st.setString(2, "maria@email.com");
			st.setDate(3, new java.sql.Date(sdf.parse("10/06/1988").getTime()));
			st.setDouble(4, 1000.0);
			st.setInt(5, 1);

			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0 ) {
				System.out.println("Rows affected: " + rowsAffected);
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("DONE! ID: " + id);
				}
				
			}else {
				System.out.println("No rown affected!!!");
			}
				
			

		} catch (SQLException sqle) {
			System.out.println("SQL ERROR: " + sqle.getMessage());;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			DB.closeSatement(st);
			DB.closeConnection();

		}

	}

}
