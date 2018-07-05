package models;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {

    private int id;
    private Manager manager;
    private String title;

    public Department(){
        }

    public Department(Manager manager, String title) {
        this.manager = manager;
        this.title = title;
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


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="department_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
