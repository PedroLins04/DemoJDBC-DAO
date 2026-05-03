package Model.Dao;

import Model.Dao.impl.DepartmentDaoJDBC;
import Model.Dao.impl.SellerDaoJDBC;
import Model.Entities.Seller;
import db.DB;

public class DaoFactory {

    public static SellerDao CreateSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao CreateDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
