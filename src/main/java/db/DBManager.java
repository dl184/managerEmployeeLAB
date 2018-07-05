package db;

import models.Administrator;
import models.Employee;
import models.Manager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBManager {

    private static Session session;
    private static Transaction transaction;


    public static List<Employee> getEmployeesForManager(Manager manager) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees = null;
        try {
            Criteria cr = session.createCriteria(Administrator.class);
            cr.add(Restrictions.eq("manager", manager));
            employees = cr.list();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employees;

    }
}
