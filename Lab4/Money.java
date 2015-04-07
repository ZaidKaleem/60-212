package Lab4;

/**
 * Created by ZaidK on 15-02-23.
 */

public class Money {

    int d, c;

    // Constructor
    public Money(int newD, int newC){
        this.d = newD;
        this.c = newC;
    }

    // Constructor
    public Money(int newD){
        this.d = newD;
    }

    // Empty Constructor
    public Money(){

    }

    // Setters
    public void setD(int newD){
        this.d = newD;
    }

    public void setC(int newC){
        this.c = newC;
    }

    // Getters
    public int getD(){
        return this.d;
    }

    public int getC(){
        return this.c;
    }


    // Method to add two amounts
    public static Money add(Money amount1, Money amount2){

        int d1 = amount1.d;
        int c1 = amount1.c;

        int d2 = amount2.d;
        int c2 = amount2.c;

        int totalD = d1+d2;
        int totalC = c1+c2;

        Money total = new Money(totalD, totalC);


        return total;
    }

    // Method to subtract two amounts
    public static Money sub(Money amount1, Money amount2){

        int d1 = amount1.d;
        int c1 = amount1.c;

        int d2 = amount2.d;
        int c2 = amount2.c;

        int totalD = d1-d2;
        int totalC = c1-c2;

        Money total = new Money(totalD, totalC);

        return total;
    }

/*
    // Method to add two amounts (Different Implementation)
    public

    //toString method
    public String toString(){

        return this.d + ".." + this.c;

    }
*/
}