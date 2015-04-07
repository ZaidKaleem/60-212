package Lab6_P1.Q1;


public class Student extends Person {

    private String major;

    // Constructor
    public Student(String name, int year, String major){

        super(name, year);
        setMajor(major);
    }

    // Setter
    public void setMajor(String major){
        this.major = major;
    }

    // Getters
    public String getMajor(){
        return this.major;
    }

    // toString override
    public String toString(){
        return "\nStudent --" + super.toString() + "\nMajor: " + getMajor();
    }
}
