import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

void main() {

    Department obj = new Department(1, "Books");

    Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

    SellerDao sellerDao = DaoFactory.CreateSellerDao();

    IO.println(seller);
}
