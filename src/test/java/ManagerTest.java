import Staff.Manager.Director;
import Staff.Manager.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Test
    public void directorAsManager(){
        manager = new Director("John", 190395, 120000, "Board of Directors", 1000000);
        assertEquals("John", manager.getName());
        assertEquals(190395, manager.getNiNum());
        assertEquals(120000, manager.getSalary(), 0.1);
        assertEquals("Board of Directors", manager.getDeptName());
    }

    @Test
    public void hasDirectorMethodsWhenCast(){
        manager = new Director("John", 190395, 120000, "Board of Directors", 1000000);
        Director director = (Director) manager;
        assertEquals(120000, director.getSalary(), 0.1);
        assertEquals("Board of Directors", director.getDeptName());
        assertEquals(1000000, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseDirectorSalary(){
        manager = new Director("John", 190395, 120000, "Board of Directors", 1000000);
        assertEquals(125000, manager.raiseSalary(5000), 0.1);
    }

    @Test
    public void canPayDirectorBonus(){
        manager = new Director("John", 190395, 120000, "Board of Directors", 1000000);
        assertEquals(122400, manager.payBonus(), 0.1);
    }


}
