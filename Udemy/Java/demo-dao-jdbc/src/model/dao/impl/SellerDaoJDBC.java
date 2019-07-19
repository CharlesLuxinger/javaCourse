package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import db.DB;
import db.DBException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection conn;

	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement(
					"SELECT SELLER.*, DEPARTMENT.NAME AS DepName\r\n" + "FROM SELLER INNER JOIN DEPARTMENT\r\n"
							+ "ON SELLER.DEPARTMENTID = DEPARTMENT.ID\r\n" + "WHERE SELLER.ID = ?");

			st.setInt(1, id);

			rs = st.executeQuery();
			if (rs.next()) {
				Integer idDep = rs.getInt("DepartmentId");
				String nameDep = rs.getString("DepName");
				Department dep = new Department(idDep, nameDep);

				Integer idSel = rs.getInt("Id");
				String nameSel = rs.getString("Name");
				String email = rs.getString("Name");
				Double baseSalary = rs.getDouble("BaseSalary");
				Date birthDate = rs.getDate("BirthDate");
				Seller seller = new Seller(idSel, nameSel, email, birthDate, baseSalary, dep);
				return seller;
			}
			return null;
		} catch (SQLException sqle) {
			throw new DBException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
