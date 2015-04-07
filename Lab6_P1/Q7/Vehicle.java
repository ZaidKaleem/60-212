package Lab6_P1.Q7;


public class Vehicle {

    //variables
    private String manName;
    private int cylinders;
    Person owner = new Person();

    // setters/getters
    public void setManName(String manName) {
        this.manName = manName;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }
    public Person getOwner() {
        return owner;
    }
    public String getManName() {
        return manName;
    }

    // no-arg
    public Vehicle(){

    }

    //constructor
    public Vehicle(String manName, int cylinders, Person owner){
        setCylinders(cylinders);
        setManName(manName);
        setOwner(owner);
    }

    //toString
    public String toString(){
        return "\nOwner's " + owner.toString() + "\nManufacturer's Name: " + getManName() + "\nCylinders: " + getCylinders();
    }


}
