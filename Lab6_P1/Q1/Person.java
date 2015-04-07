package Lab6_P1.Q1;

public class Person {

    private String name;
    private int year;

    // No-arg Constructor
    public Person(){

    }

    // Constructor
    public Person(String name, int year){

        setName(name);
        setYear(year);
    }


    // Setters

    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    // Getters

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    // toString method returns the data
    public String toString(){
        return "\nName: " + getName() + "\nYear: " + getYear();
    }

}
