package Model.Dao.impl;

import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;
import db.DB;
import db.DbException;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC (Connection conn) {
      this.conn=conn;
    }

    public SellerDaoJDBC() {
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer Id) {

    }

    @Override
    public Seller findById(Integer Id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName  \n"
                            + "FROM seller INNER JOIN department  \n"
                            + "ON seller.DepartmentId = department.Id  \n"
                            + "WHERE seller.Id = ? ");

                    st.setInt (1, Id);
                    rs= st.executeQuery();
                    if (rs.next()) {
                       Department dep = new Department();
                       dep.setId(rs.getInt("Id"));
                       dep.setName(rs.getString ("Name"));
                       Seller obj = new Seller();
                       obj.setId(rs.getInt("Id"));
                       obj.setName(rs.getString ("Name"));
                       obj.setEmail(rs.getString("Email"));
                       obj.setBirthDate(rs.getDate("BirthDate"));
                       obj.setBaseSalary(rs.getDouble("BaseSalary"));
                       obj.setDepartment(dep);
                       return obj;
                    }
                    return null;
        }
        catch (SQLException e) {
          throw new DbException (e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
