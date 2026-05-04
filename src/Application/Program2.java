import Model.Dao.DaoFactory;
import Model.Dao.DepartmentDao;
import Model.Entities.Department;

void main () {

    Scanner sc = new Scanner(System.in);

    DepartmentDao depDao = DaoFactory.CreateDepartmentDao();

    IO.println("====TEST N.1 -> Department-findById====");
    Department department = depDao.findById(2);
    IO.println(department);

    IO.println();

    IO.println("====TEST N.2 -> Department-findAll====");
    List <Department> list = depDao.findAll();
    IO.println(list);

    IO.println();

    //IO.println("====TEST N.3 -> Department-Insert");
    //Department newDep = new Department (null, "Food");
    //depDao.insert(newDep);
    //IO.println("New Department inserted! Id:" + newDep.getId());

    IO.println();

    //IO.println("====TEST N.4 -> Department-Update====");
    //department = depDao.findById(5);
    //department.setName("Games");
    //depDao.update(department);
    //IO.println("Department updated!");

    IO.println();

    IO.println("====TEST N.5 -> Department-Delete====");
    IO.print("Witch Id you want delete?");
    int Id = sc.nextInt();
    depDao.deleteById(Id);
    IO.print("Department " + Id + " deleted.");
}

