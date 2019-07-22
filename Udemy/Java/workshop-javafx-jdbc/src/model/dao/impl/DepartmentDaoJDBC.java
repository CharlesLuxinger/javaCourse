package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DBException;
import db.DBIntegrityException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn;

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("INSERT INTO DEPARTMENT (NAME)\r\n VALUES(?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getName());

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
	public void update(Department obj) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement("UPDATE DEPARTMENT SET NAME = ? WHERE ID = ?");

			st.setString(1, obj.getName());
			st.setInt(2, obj.getId());

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
			st = conn.prepareStatement("DELETE FROM DEPARTMENT WHERE ID = ?");

			st.setInt(1, id);

			Integer rowsAffected = st.executeUpdate();

			if (rowsAffected == 0) {
				throw new DBException("ID not found!!!");
			}

		} catch (SQLException sqle) {
			throw new DBIntegrityException(sqle.getMessage());
		} finally {
			DB.closeSatement(st);
		}

	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT DEPARTMENT.* FROM DEPARTMENT WHERE DEPARTMENT.ID = ?");

			st.setInt(1, id);

			rs = st.executeQuery();

			if (rs.next()) {
				Integer idDep = rs.getInt("Id");
				String nameDep = rs.getString("Name");
				Department dep = new Department(idDep, nameDep);

				return dep;
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
	public List<Department> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement("SELECT DEPARTMENT.* FROM DEPARTMENT ORDER BY ID");

			rs = st.executeQuery();

			List<Department> list = new ArrayList<Department>();

			while (rs.next()) {
				Integer idDep = rs.getInt("Id");
				String nameDep = rs.getString("Name");

				list.add(new Department(idDep, nameDep));
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
