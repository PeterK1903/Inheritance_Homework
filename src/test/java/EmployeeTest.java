import Staff.Employee;
import Staff.Manager.Manager;
import Staff.techStaff.DatabaseAdmin;
import Staff.techStaff.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    // Manager Tests

    @Test
    public void managerAsEmployee(){
        employee = new Manager("Peter", 12345, 40000, "HR");
        assertEquals("Peter", employee.getName());
        assertEquals(12345, employee.getNiNum());
        assertEquals(40000, employee.getSalary(), 0.1);
    }

    @Test
    public void hasManagerMethodsWhenCast(){
        employee = new Manager("Peter", 12345, 40000, "HR");
        Manager manager = (Manager) employee;
        assertEquals(40000, manager.getSalary(), 0.1);
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canRaiseManagerSalary(){
        employee = new Manager("Peter", 12345, 40000, "HR");
        assertEquals(45000, employee.raiseSalary(5000), 0.1);
    }

    @Test
    public void canPayManagerBonus(){
        employee = new Manager("Peter", 12345, 40000, "HR");
        assertEquals(40400, employee.payBonus(), 0.1);
    }

    // Developer Tests

    @Test
    public void developerAsEmployee(){
        employee = new Developer("Gavin", 678910, 25000);
        assertEquals("Gavin", employee.getName());
        assertEquals(678910, employee.getNiNum());
        assertEquals(25000, employee.getSalary(), 0.1);
    }

    @Test
    public void hasDeveloperMethodsWhenCast(){
        employee = new Developer("Gavin", 678910, 25000);
        Developer developer = (Developer) employee;
        assertEquals(25000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseDeveloperSalary(){
        employee = new Developer("Gavin", 678910, 25000);
        assertEquals(30000, employee.raiseSalary(5000), 0.1);
    }

    @Test
    public void canPayDeveloperBonus(){
        employee = new Developer("Gavin", 678910, 25000);
        assertEquals(25250, employee.payBonus(), 0.1);
    }


    // DBA Tests

    @Test
    public void dbaAsEmployee(){
        employee = new DatabaseAdmin("Wilson", 98765, 75000);
        assertEquals("Wilson", employee.getName());
        assertEquals(98765, employee.getNiNum());
        assertEquals(75000, employee.getSalary(), 0.1);
    }

    @Test
    public void hasDBArMethodsWhenCast(){
        employee = new DatabaseAdmin("Wilson", 98765, 75000);
        DatabaseAdmin databaseAdmin = (DatabaseAdmin) employee;
        assertEquals(75000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseDBASalary(){
        employee = new DatabaseAdmin("Wilson", 98765, 75000);
        assertEquals(80000, employee.raiseSalary(5000), 0.1);
    }

    @Test
    public void canPayDBABonus(){
        employee = new DatabaseAdmin("Wilson", 98765, 75000);
        assertEquals(75750, employee.payBonus(), 0.1);
    }


}
