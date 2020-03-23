package Staff;

public class Employee {

    // instance vars
    private String name;
    private int niNum;
    private double salary;

    // constructor
    public Employee(String name, int niNum, double salary) {
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getNiNum() {
        return niNum;
    }

    public double getSalary() {
        return salary;
    }


    // setters

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public void setNiNum(int niNum) {
        this.niNum = niNum;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // methods

    public double raiseSalary(double raise){
        if(raise >= 0) {
            return (this.salary + raise);
        }
        return this.salary;
    }

    public int payBonus(){
        int bonus = (int) (this.salary / 100);
        return (int) (bonus + this.salary);
    }

}
