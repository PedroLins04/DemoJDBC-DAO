package Model.Dao;

import Model.Entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert (Seller obj);
    void update (Seller obj);
    void deleteById (Integer Id);
    Seller findById (Integer Id);
    List<Seller> findAll();
}
