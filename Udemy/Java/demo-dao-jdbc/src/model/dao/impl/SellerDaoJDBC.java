package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO SELLER (NAME, EMAIL, BIRTHDATE, BASESALARY, DEPARTMENTID)\r\n"
					+ "		VALUES(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			st.setDouble(4, obj.getBaseSalary());
			st.setInt(5, obj.getDepartment().getId());

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DBException("Unexpected Error!!! No rows affected!!!");
			}
		} catch (SQLException sqle) {
			throw new DBException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
		}

	}

	@Override
	public void update(Seller obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("UPDATE SELLER\r\n"
					+ "SET NAME = ?, EMAIL = ?, BIRTHDATE = ?, BASESALARY = ?, DEPARTMENTID = ?\r\n"
					+ "WHERE ID = ?");

			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			st.setDouble(4, obj.getBaseSalary());
			st.setInt(5, obj.getDepartment().getId());
			st.setInt(6, obj.getId());

			st.executeUpdate();

		} catch (SQLException sqle) {
			throw new DBException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
		}

	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("DELETE FROM SELLER WHERE ID = ?");

			st.setInt(1, id);

			Integer rowsAffected = st.executeUpdate();
			
			if (rowsAffected == 0) {
				throw new DBException("ID not found!!!");
			}

		} catch (SQLException sqle) {
			throw new DBException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
		}

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
				Department dep = instantiateDepartment(rs);

				Seller seller = instantiateSeller(rs, dep);

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

	private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
		Integer idSel = rs.getInt("Id");
		String nameSel = rs.getString("Name");
		String email = rs.getString("Email");
		Double baseSalary = rs.getDouble("BaseSalary");
		Date birthDate = rs.getDate("BirthDate");
		Seller seller = new Seller(idSel, nameSel, email, birthDate, baseSalary, dep);

		return seller;
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Integer idDep = rs.getInt("DepartmentId");
		String nameDep = rs.getString("DepName");
		Department dep = new Department(idDep, nameDep);
		return dep;
	}

	@Override
	public List<Seller> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement(
					"SELECT SELLER.*, DEPARTMENT.NAME AS DepName\r\n" + "FROM SELLER INNER JOIN DEPARTMENT\r\n"
							+ "ON SELLER.DEPARTMENTID = DEPARTMENT.ID\r\n" + "ORDER BY SELLER.NAME");

			rs = st.executeQuery();

			List<Seller> list = new ArrayList<Seller>();

			Map<Integer, Department> map = new HashMap<Integer, Department>();

			while (rs.next()) {
				Department dep = map.get(rs.getInt("DepartmentId"));
				if (dep == null) {
					dep = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}

				list.add(instantiateSeller(rs, dep));
			}

			return list;

		} catch (SQLException sqle) {
			throw new DBException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT SELLER.*, DEPARTMENT.NAME AS DepName\r\n"
					+ "FROM SELLER INNER JOIN DEPARTMENT\r\n" + "ON SELLER.DEPARTMENTID = DEPARTMENT.ID\r\n"
					+ "WHERE DEPARTMENT.ID = ?\r\n" + "ORDER BY SELLER.NAME");

			st.setInt(1, department.getId());

			rs = st.executeQuery();

			List<Seller> list = new ArrayList<Seller>();

			Map<Integer, Department> map = new HashMap<Integer, Department>();

			while (rs.next()) {
				Department dep = map.get(rs.getInt("DepartmentId"));
				if (dep == null) {
					dep = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}

				list.add(instantiateSeller(rs, dep));
			}

			return list;

		} catch (SQLException sqle) {
			throw new DBException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
			DB.closeResultSet(rs);
		}
	}

}
