package Lab6_P1.Q2;


public class Manager extends Employee {
    private String department;

    // No-arg constructor
    public Manager(){}


    //Constructor
    public Manager(String name, double salary, String department){
        super(name, salary);
        setDepartment(department);
    }

    //Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    //Getter
    public String getDepartment() {
        return this.department;
    }

    // toString override
    public String toString(){
        return "--Manager--" + super.toString() + "\nDepartment: " + getDepartment();
    }
}
