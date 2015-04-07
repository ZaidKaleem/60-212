package Lab6_P1.Q4;


public class PaymentTester {
    public static void main(String [] args){

        //CashPayment object 1
        CashPayment cash1 = new CashPayment(50000);

        // cash1.paymentDetails();


        //CashPayment object 2
        CashPayment cash2 = new CashPayment(100000);

        // cash2.paymentDetails();


        //CreditCardPayment object 1
        CreditCardPayment credit1 = new CreditCardPayment(50000, "Zaid Kaleem", "19/12/2018", 123456789);

        //credit1.paymentDetails();


        //CreditCardPayment object 2
        CreditCardPayment credit2 = new CreditCardPayment(100000, "John Doe", "09/06/206", 586862156);

        //credit2.paymentDetails();



    }
}
