package Lab7_P2;

/**
 * Created by ZaidK on 15-03-21.
 */
public class Commission extends Hourly {

    //variables
    private double totalSales;
    private double commissionRate;

    //Setters
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    //Getters
    public double getCommissionRate() {
        return this.commissionRate/100; //Converting % to decimal. E.g: 20% to 0.2
    }

    public double getTotalSales() {
        return this.totalSales;
    }

    //Constructor
    public Commission(String name, String address, String phone, String socSecNumber, double hourlyRate, double commissionRate){

        super(name, address, phone, socSecNumber, hourlyRate);
        setCommissionRate(commissionRate);
    }

    //Method to calculate total sales
    public void addSales(double sales){
        totalSales += sales;
    }

    //Method to calculate total pay
    public double pay(){
        double payment = super.pay() + getCommissionRate() * getTotalSales();
        setTotalSales(0);
        return payment;
    }

    //Method to print the data
    public String toString(){
        String output = super.toString();
        output += "\nTotal Sales: " + getTotalSales();
        return output;
    }
}
