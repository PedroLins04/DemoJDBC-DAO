import Model.Dao.DaoFactory;
import Model.Dao.DepartmentDao;
import Model.Entities.Department;

void main () {

    DepartmentDao depDao = DaoFactory.CreateDepartmentDao();

    IO.println("====TEST N.1 -> Department-findById====");
    Department department = depDao.findById(2);
    IO.println(department);

    IO.println();

    IO.println("====TEST N.2 -> Department-findAll====");
    List <Department> list = depDao.findAll();
    IO.println(list);
}

