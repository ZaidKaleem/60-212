package Lab6_P1.Q2;


public class Executive extends Manager {

    //Constructor
    public Executive(String name, double salary, String department){
        super(name, salary, department);
    }

    //toString override
    public String toString(){
        return "\n--Executive --" + "\nName: " + getName() + "\nSalary: $" + getSalary() + "\nDepartment: " + getDepartment();
    }
}
