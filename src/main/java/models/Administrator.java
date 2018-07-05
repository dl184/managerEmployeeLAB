package models;

import javax.persistence.*;

@Entity
@Table(name="administrator")
public class Administrator extends Employee {

    private Manager manager;

    public Administrator() {
    }

    public Administrator(String name, int idNumber, int salary, Manager manager) {
        super(name, idNumber, salary);
        this.manager = manager;
    }

    @ManyToOne
    @JoinColumn(name="manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
