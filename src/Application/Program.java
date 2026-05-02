import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

void main() {

    SellerDao sellerDao = DaoFactory.CreateSellerDao();

    IO.println("====TEST N.1 -> Seller-findById====");
    Seller seller = sellerDao.findById(2);
    IO.println(seller);

    IO.println();

    IO.println("====TEST N.2 -> Seller-findByDepartment====");
    Department department = new Department(2, "Electronics");
    List<Seller> list = sellerDao.findByDepartment(department);
    for (Seller obj : list) {
        IO.println(obj);
    }

    IO.println();

    IO.println("====TEST N.3 -> Seller-findAll====");
    list = sellerDao.findAll();
    for (Seller obj : list) {
        IO.println(obj);
    }

    IO.println();

    IO.println("====TEST N.4 -> Seller-insert====");
    Date d = new Date(104, 04, 16);
    Seller newSeller = new Seller (null, "Peter Jack", "petjack@gmail.com", d, 3090.0, department);
    sellerDao.insert(newSeller);
    IO.println("Inserted! New Seller Id = " + newSeller.getId());
    
}
