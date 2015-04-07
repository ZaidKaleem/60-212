package Lab6_P1.Q6;


public class Teacher extends Person {

    private double salary;
    private String subject;

    //Setters

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //Getters

    public double getSalary() {
        return this.salary;
    }

    public String getSubject() {
        return this.subject;
    }

    //Constructor
    public Teacher(String myName, int myAge, String myGender, String subject, double salary){
        super(myName, myAge, myGender);
        setSubject(subject);
        setSalary(salary);
    }

    //toString
    public String toString(){
        return "--Teacher--\nName: " + super.toString() + "Salary: $" + getSalary() + "\nSubject: " + getSubject();
    }


}
