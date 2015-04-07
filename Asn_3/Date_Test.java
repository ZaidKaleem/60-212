package Asn_3;

/**
 * Created by ZaidK on 15-02-08.
 */


// Name: Zaid Kaleem
// ID: 103619897
// Lab 3 | Part 1 - Problem 1

public class Date_Test {
    public static void main(String args []) {

        // Testing all the methods for d1 in the Date class
        Date d1 = new Date(26, 05, 99);
        System.out.println("Date 1");
        System.out.println(d1.getDay());
        d1.setDay(03);
        System.out.println(d1.getMonth());
        d1.setMonth(10);
        System.out.println(d1.getYear());
        d1.setYear(91);
        System.out.println(d1.toString());

        // Testing all the methods for d2 in the Date class
        Date d2 = new Date(8, 06, 94);
        System.out.println("\nDate 2");
        System.out.println(d2.getDay());
        d2.setDay(23);
        System.out.println(d2.getMonth());
        d2.setMonth(06);
        System.out.println(d2.getYear());
        d2.setYear(98);
        System.out.println(d2.toString());

        // Testing LessThan method;
        System.out.println("\nDate 1 is less than Date 2: " + d1.LessThan(d2));
        System.out.println("Date 2 is less than Date 1: " + d2.LessThan(d1));
    }
}

class Date {

    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int newDay) {
        day = newDay;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int newMonth) {
        month = newMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    // Constructor
    Date(int newDate, int newMonth, int newYear) {
        day = newDate;
        month = newMonth;
        year = newYear;
    }

    // Calculates which month the integer month corresponds too and displays the full date as a String
    public String toString(){
        String monthS[] = {"Jan","Feb", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        if (year % 100 < 10){
            return ( monthS[month-1] + " " + day +  ", '0" + year % 100);
        } else {
            return (monthS[month-1] + " " + day +  ", '" + year % 100);
        }
    }

    // Checks if a date is lower or higher than a given date
    public boolean LessThan(Date check){
        if  (year > check.year)
            return false;
        else if  (year < check.year)
            return true;
        else if (month < check.month)
            return true;
        else if (month > check.month)
            return false;
        else if (day < check.day )
            return true;
        else
            return false;
    }
}