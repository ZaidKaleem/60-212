package Lab6_P1.Q1;


public class Instructor extends Person {

    private double salary;

    // Constructor
    public Instructor(String name, int year, double salary){

        super(name, year);
        setSalary(salary);
    }

    // Setter
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Getter
    public double getSalary(){
        return this.salary;
    }

    // toString override
    public String toString(){
        return "\nTeacher --" + super.toString() + "\nSalary: " + getSalary();
    }
}
