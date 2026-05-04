package Model.Dao.impl;

import Model.Dao.DepartmentDao;
import Model.Entities.Department;
import db.DB;
import db.DbException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC (Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department dpt) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO department "
                            + "(Name) "
                            + "VALUES (?) ",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, dpt.getName());


            int RowsAffected = st.executeUpdate();
            if (RowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int Id = rs.getInt(1);
                    dpt.setId(Id);
                }
                DB.closeResultSet(rs);
            }

        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void update(Department dpt) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE department "
                    + "SET Name = ? "
                    + "WHERE Id = ? ");

            st.setString(1, dpt.getName());
            st.setInt(2, dpt.getId());

            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void deleteById(Integer Id) {

    }

    @Override
    public Department findById(Integer Id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT department.* "
                            + "FROM department "
                            + "WHERE department.Id = ? ");

            st.setInt(1, Id);
            rs = st.executeQuery();
            if (rs.next()){
                Department dpt = InstantiateDepartment(rs);
                return dpt;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT department.* "
                            + "FROM department "
                            + "ORDER BY Id ");

            rs = st.executeQuery();
            List <Department> list = new ArrayList<>();
            while (rs.next()) {
                Department dpt = InstantiateDepartment(rs);
                list.add(dpt);
            }
            return list;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    private Department InstantiateDepartment (ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));
        return dep;
    }
}
