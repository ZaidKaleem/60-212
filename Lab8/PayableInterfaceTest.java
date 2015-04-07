// Zaid Kaleem
// 103619897
// Lab 8


package Lab8;

public class PayableInterfaceTest {
   public static void main(String args[]) {

      // create six-element Payable array
      Payable payableObjects[] = new Payable[6];

      // populate array with objects that implement Payable
      payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
      payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      payableObjects[3] = new HourlyEmployee("Karen ", "Price", "222-22-2222", 16.75, 40.00);
         /* create an HourlyEmployee object */
      payableObjects[4] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000.00, 0.06);
         /* create a CommissionEmployee object */
      payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
         /* create a BasePlusCommissionEmployee object */

      System.out.println(
              "Invoices and Employees processed polymorphically:\n");

      // generically process each element in array payableObjects
      for (Payable currentPayable : payableObjects) {

         // output currentPayable and its appropriate payment amount
         System.out.printf("%s \n", currentPayable.toString());
            
         /* write code to determine whether currentPayable is a 
            BasePlusCommissionEmployee object */
         if (currentPayable instanceof BasePlusCommissionEmployee) {
            /* write code to give a raise (10%) */
            ((BasePlusCommissionEmployee) currentPayable).setBaseSalary(((BasePlusCommissionEmployee) currentPayable).getBaseSalary() + ((BasePlusCommissionEmployee) currentPayable).getBaseSalary() * 0.10);
            /* write code to output results of the raise */
            System.out.println("new base salary with 10% increase: " + ((BasePlusCommissionEmployee) currentPayable).getBaseSalary());
         } // end if

         System.out.printf("%s: $%,.2f\n\n",
                 "payment due", currentPayable.getPaymentAmount());

      } // end for
   } // end main
}   // end class PayableInterfaceTest
