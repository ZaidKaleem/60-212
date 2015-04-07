package Lab6_P1.Q6;

class Person{
    protected String myName ; // name of the person
    protected int myAge; // person's age
    protected String myGender; // "M" for male, "F" for female

    //Getters

    public int getMyAge() {
        return this.myAge;
    }

    public String getMyGender() {
        return this.myGender;
    }

    public String getMyName() {
        return this.myName;
    }

    //Setters

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    //no-arg
    public Person(){

    }

    // constructor
    public Person(String name, int age, String gender)
    {
        myName = name; myAge = age ; myGender = gender;
    }
    public String toString()
    {
        return myName + "\nAge: " + myAge + "\nGender: " +myGender + "\n";
    }
}