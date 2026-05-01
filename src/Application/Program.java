import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Seller;

void main() {

    SellerDao sellerDao = DaoFactory.CreateSellerDao();

    IO.println("====TEST N.1 -> Seller-findById====");
    Seller seller = sellerDao.findById(3);

    IO.println("Welcome " + seller);
}
