import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Employee;
import models.Manager;

import javax.persistence.ManyToOne;
import java.util.List;

public class Runner {


    public static void main(String[] args) {



        Manager manager = new Manager("adri", 666, 10000, 2000000);
        DBHelper.save(manager);

        Department department = new Department(manager, "cool kids");

        Administrator administrator1 = new Administrator("cleyra", 223, 23500, manager);
        DBHelper.save(administrator1);
        Administrator administrator2 = new Administrator("Derek", 225, 23501, manager);
        DBHelper.save(administrator2);

        List<Employee> allEmployeesForManager = DBManager.getEmployeesForManager(manager);
    }
}


