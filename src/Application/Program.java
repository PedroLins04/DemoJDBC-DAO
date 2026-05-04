import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

void main() {

    Scanner sc = new Scanner(System.in);
    SellerDao sellerDao = DaoFactory.CreateSellerDao();

    IO.println("====TEST N.1 -> Seller-findById====");
    Seller seller = sellerDao.findById(5);
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

    //IO.println("====TEST N.4 -> Seller-insert====");
    //Date d = new Date(104, 03, 16);
    //Seller newSeller = new Seller (null, "Peter Jack", "petjack@gmail.com", d, 3090.0, department);
    //sellerDao.insert(newSeller);
    //IO.println("Inserted! New Seller Id = " + newSeller.getId());

    IO.println();

    //IO.println("====TEST N.5 -> Seller-update====");
    //seller = sellerDao.findById(1);
    //seller.setEmail("B.Wayne@gmail.com");
    //sellerDao.update(seller);
    //IO.println("Updated completed!");

    IO.println();

    IO.println("====TEST N.6 -> Seller-delete====");
    IO.print("Enter id for delete test: ");
    int Id = sc.nextInt();
    sellerDao.deleteById(Id);
    IO.println("Seller " + Id + " deleted.");
}
