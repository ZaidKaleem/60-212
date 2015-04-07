package Lab7_P1.Q1;

/**
 * Created by ZaidK on 15-03-27.
 */

public class GeometricObject implements Comparable //extends Object
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     so, the get method name is isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    // Method to find the greatest object
    public static Comparable max(Comparable o1, Comparable o2){
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }

    public double getArea(){
        return  0;
    }

    @Override
    public int compareTo(Object o){
        GeometricObject g = (GeometricObject)o;
        return (int)(getArea()-g.getArea());
    }
}

//