package Model.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;
    private String Name;
    private String Email;
    private Date BirthDate;
    private Double BaseSalary;
    private Department department;

    //CONSTRUCTORS

    public Seller () {}

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        Id = id;
        Name = name;
        Email = email;
        BirthDate = birthDate;
        BaseSalary = baseSalary;
        this.department = department;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //EQUALS AND HASH

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(Id, seller.Id) && Objects.equals(Name, seller.Name) && Objects.equals(Email, seller.Email) && Objects.equals(BirthDate, seller.BirthDate) && Objects.equals(BaseSalary, seller.BaseSalary) && Objects.equals(department, seller.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, Email, BirthDate, BaseSalary, department);
    }

    //toString

    @Override
    public String toString() {
        return "Seller: "
                + "Id=" + Id
                + ", Name='" + Name + '\''
                + ", Email='" + Email + '\''
                + ", BirthDate=" + BirthDate
                + ", BaseSalary=" + BaseSalary
                + ", " + department
                + ".";
    }
}


