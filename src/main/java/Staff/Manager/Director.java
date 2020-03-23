package Staff.Manager;
import Staff.Employee;

public class Director extends Manager {

    // instance var
    private double budget;

    // constructor
    public Director(String name, int niNum, double salary, String deptName, double budget) {
        super(name, niNum, salary, deptName);
        this.budget = budget;
    }

    // getter

    public double getBudget() {
        return budget;
    }

    // methods
    @Override
    public int payBonus(){
        int bonus = (int) ((this.getSalary() / 100) * 2);
        return (int) (bonus + this.getSalary());
    }
}
