import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Seller;

void main() {

    SellerDao sellerDao = DaoFactory.CreateSellerDao();

    Seller seller = sellerDao.findById(3);

    IO.println("Welcome " + seller);
}
