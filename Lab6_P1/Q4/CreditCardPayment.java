package Lab6_P1.Q4;


public class CreditCardPayment extends Payment {

    private String name;
    private String expDate;
    private int cardNum;

    //Setters
    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Getters
    public int getCardNum() {
        return this.cardNum;
    }

    public String getExpDate() {
        return this.expDate;
    }

    public String getName() {
        return this.name;
    }

    //Constructor
    public CreditCardPayment(double amount, String name, String expDate, int cardNum){

        super(amount);
        setCardNum(cardNum);
        setExpDate(expDate);
        setName(name);
    }

/*

    // Override paymentDetails
    public String paymentDetails(){

    }

*/

}
