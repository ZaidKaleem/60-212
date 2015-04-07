// Zaid Kaleem
// 103619897
// Lab 8

package Lab8;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee( String first, String last,
                                      String ssn, double sales, double rate, double salary )
   {
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); // validate and store base salary
   } // end six-argument BasePlusCommissionEmployee constructor

   // set base salary
   public void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // non-negative
   } // end method setBaseSalary

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } // end method getBaseSalary

   // calculate earnings; override CommissionEmployee implementation of 
   // interface Payable method
   /* write a method header to satisfy the Payable interface */

   @Override
   public double getPaymentAmount() {
      return  getBaseSalary() + super.getPaymentAmount() ;
   }
   /* calculate and return the BasePlusCommissionEmployee's earnings */
   // end method getPaymentAmount

   // return String representation of BasePlusCommissionEmployee object
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f ",
              "base-salaried", super.toString(),
              "base salary", getBaseSalary());
   } // end method toString
} // end class BasePlusCommissionEmployee
