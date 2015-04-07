package Lab6_P1.Q4;


public class Payment  {

    private double amount;

    //Setter
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Getter
    public double getAmount() {
        return amount;
    }

    //No-Arg
    public Payment(){

    }

    //Constructor
    public Payment(double amount){
        setAmount(amount);
    }

/*

    public String paymentDetails(){

    }

*/


}
