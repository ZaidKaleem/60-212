package Lab6_P1.Q7;


public class Person {

    //Variable
    private String name;

    //Setters/Getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    //no-arg
    public Person() {

    }

    //Constructors

    public Person(String name) {
        setName(name);
    }

    public Person(Person theOject){

    }

    //toString
    public String toString() {
        return "Name: " + getName();
    }


    //equals method
    public boolean equals(Object other){
        return false;
    }
}
