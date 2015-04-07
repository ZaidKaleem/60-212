package Lab6_P1.Q6;


class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    //Setters

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    //Getters
    public double getMyGPA() {
        return this.myGPA;
    }

    public String getMyIdNum() {
        return this.myIdNum;
    }

    //no-arg
    public Student(){

    }

    // constructor
    public Student(String name, int age, String gender,  String idNum, double gpa) {

    // use the super class' constructor
        super(name, age, gender);

    // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }
}
