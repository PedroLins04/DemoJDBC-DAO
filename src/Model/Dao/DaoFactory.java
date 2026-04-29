package Model.Dao;

import Model.Dao.impl.SellerDaoJDBC;
import Model.Entities.Seller;

public class DaoFactory {

    public static SellerDao CreateSellerDao() {
        return new SellerDaoJDBC();
    }
}
