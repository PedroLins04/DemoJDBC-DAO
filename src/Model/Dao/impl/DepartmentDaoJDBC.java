package Model.Dao.impl;

import Model.Dao.DepartmentDao;
import Model.Entities.Department;

import java.sql.Connection;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC (Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer Id) {

    }

    @Override
    public Department findById(Integer Id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }
}
