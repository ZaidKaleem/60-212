package Lab6_P1.Q6;


public class UniversityStudent extends Student {

    private String major;
    private int year;


    //Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //Getters
    public String getMajor() {
        return this.major;
    }

    public int getYear() {
        return this.year;
    }

    //Constructor
    public UniversityStudent(String myName, int myAge, String myGender, String myIDNum, double myGPA, int year, String major){
        super(myName, myAge, myGender, myIDNum, myGPA);
        setMajor(major);
        setYear(year);
    }

    //toString
    public String toString(){
        return "\n--University Student -- " + "\nName: " + super.toString() + "ID: " + getMyIdNum() + "\nYear: " + getYear() +
                "\nMajor: " + getMajor() + "\nGPA: " + getMyGPA();
    }
}
