import Model.Dao.DaoFactory;
import Model.Dao.DepartmentDao;
import Model.Entities.Department;

void main () {

    DepartmentDao depDao = DaoFactory.CreateDepartmentDao();

    IO.println("====TEST N.1 -> Department-findById====");
    Department department = depDao.findById(2);
    IO.println(department);
}

