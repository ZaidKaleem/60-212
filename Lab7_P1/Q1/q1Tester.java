package Lab7_P1.Q1;

/**
 * Created by ZaidK on 15-03-27.
 */
public class q1Tester {
    public static void main(String [] args){

        //Creating circle objects
        Circle c1 = new Circle(1);
        c1.setColor("Yellow");
        Circle c2 = new Circle(10);

        System.out.println((GeometricObject)c1.max(c1, c2));


        // Creating rectangle objects
        Rectangle r1 = new Rectangle(2 ,4);
        Rectangle r2 = new Rectangle(6 ,12);

        r1.setColor("Green");

        System.out.println((GeometricObject)r1.max(c1, c2));


    }
}
