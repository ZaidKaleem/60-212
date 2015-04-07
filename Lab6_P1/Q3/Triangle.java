package Lab6_P1.Q3;


public class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;


    //Default Constructor
    public Triangle(){

    }

    //Constructor
    public Triangle(Double side1, Double side2, Double side3){

        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }


    //Setters
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    //Getters
    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    //Returns area of the Triangle
    public double getArea(){
        double halfPerimeter = getPerimeter() * 0.5;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    //Returns the perimeter of the Triangle
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    //Returns string description of the Triangle
    public String toString(){
        return "\nTriangle -- " + super.toString() + "\nSide 1: " + getSide1() + "\nSide 2: " + getSide2() + "\nSide 3: " + getSide3() +
                "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }

}
