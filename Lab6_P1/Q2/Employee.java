package Lab6_P1.Q2;


public class Employee {

    private String name;
    private double salary;

    // No-arg constructor
    public Employee(){

    }


    // Constructor
    public Employee(String name, double salary){
        setName(name);
        setSalary(salary);
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String toString(){
        return "\nName: " + getName() + "\nSalary: $" + getSalary();
    }

}
