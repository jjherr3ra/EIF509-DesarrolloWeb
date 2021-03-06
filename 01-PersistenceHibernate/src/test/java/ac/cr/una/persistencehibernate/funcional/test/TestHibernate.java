/*
 * Copyright (C) 2017 mguzmana
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Universidad Nacional de Costa Rica, Prof: Maikol Guzman Alan.
 */
package ac.cr.una.persistencehibernate.funcional.test;

import ac.cr.una.persistencehibernate.HibernateUtil;
import ac.cr.una.persistencehibernate.model.Department;
import ac.cr.una.persistencehibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mguzmana
 */
public class TestHibernate {

    public TestHibernate() {
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSave() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // begin a transaction 
        session.beginTransaction();

        //creating a department object
        Department department = new Department();
        department.setDeptName("developement");

        // save department object
        session.save(department);
        System.out.println("Department saved, id:  " + department.getId());

        //creating an employee object
        Employee employee = new Employee();
        employee.setFirstName("Mike");
        employee.setSalary(50000);
        //  set department of employee
        employee.setDepartment(department);

        // save employee object
        session.save(employee);
        System.out.println("Employee saved, id:  " + employee.getId());

        // commit transaction
        session.getTransaction().commit();

        session.close();
        HibernateUtil.shutdown();

    }
}
