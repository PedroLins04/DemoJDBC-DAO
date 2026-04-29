package Model.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;
    private String Name;

    //CONSTRUCTORS

    public Department() {
    }

    public Department (Integer id, String name) {
        this.Id = id;
        this.Name = name;
    }

    //GETS AND SETS

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    //EQUALS AND HASHCODE

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(Id, that.Id) && Objects.equals(Name, that.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name);
    }

    //toString

    @Override
    public String toString() {
        return "Department{" +
                " Id= " + Id +
                ", Name= '" + Name + "'" +
                '}';
    }




}
