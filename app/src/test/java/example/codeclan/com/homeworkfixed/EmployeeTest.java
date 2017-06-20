package example.codeclan.com.homeworkfixed;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/06/2017.
 */

public class EmployeeTest {

    Admin admin;
    Engineer engineer;
    Manager manager;
    Director director;

    @Before
    public void before(){
        admin = new Admin(12, "John", "1234", 20.00);
        engineer = new Engineer(23, "Alan", "4321", 21.00);
        manager = new Manager(12, "Ally", "5678", 30.00, "Hardware");
        director = new Director(12, "Steve", "8765", 50.00, "Software", 10.00);
    }

    @Test
    public void testsetNames(){
        admin.setName("Bill");
        assertEquals("Bill", admin.getName());

    }

    @Test
    public void testRaiseSalary(){
        admin.raiseSalary(10.00);
        assertEquals(30.00, admin.getSalary(), 0.01);
        director.raiseSalary(100.00);
        assertEquals(150.00, director.getSalary(), 0.01);
    }
}
