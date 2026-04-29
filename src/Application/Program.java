import Model.Entities.Department;
import Model.Entities.Seller;

void main() {

    Department obj = new Department(1, "Books");
<<<<<<< HEAD

    Seller seller = new Seller(1, "Alex", "alex@gmail.com", new Date(), 5000.0, obj);
    IO.println(seller);
=======
>>>>>>> b709e77 (seller entitie class)

    Seller seller = new Seller(1, "Alex", "alex@gmail.com", new Date(), 5000.0, obj);

    IO.println(seller);
}
