package models;


import org.hibernate.annotations.Table;

import javax.persistence.*;


/* don't need a table name in an abstract class */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {

    private int id;
    private String name;
    private int idNumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int idNumber, int salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "id_number")
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
