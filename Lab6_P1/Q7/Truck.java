package Lab6_P1.Q7;


public class Truck extends Vehicle {

    //variables
    private double load;
    private int towing;

    // setters/getters
    public double getLoad() {
        return this.load;
    }

    public int getTowing() {
        return this.towing;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public void setTowing(int towing) {
        this.towing = towing;
    }

    //no-arg
    public Truck(){

    }

    //constructor
    public Truck(String manName, int cylinders, Person owner, double load, int towing){
        super(manName, cylinders, owner);
        setLoad(load);
        setTowing(towing);
    }

    //toString
    public String toString (){
        return super.toString() + "\nLoad Capacity: " + getLoad() + "\nTowing Capacity: " + getTowing();
    }


}

