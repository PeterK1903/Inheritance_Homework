package Staff.Manager;
import Staff.Employee;


// class is a subclass of Employee
public class Manager extends Employee {


    // instance vars
    private String deptName;

    // constructor with super class and unique property for manager
    public Manager(String name, int niNum, double salary, String deptName) {
        super(name, niNum, salary);
        this.deptName = deptName;
    }

    // getter for deptName, no need for others as contained with super class

    public String getDeptName() {
        return deptName;
    }


}
