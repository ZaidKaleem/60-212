package Asn_2;


// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 9


import javax.swing.JOptionPane;

    class Customer
    {
        int aNumber, bBalance, iCharged, tCredit, aLimit;

        public void balance()
        {
            int newBalance = bBalance + iCharged - tCredit;

            JOptionPane.showMessageDialog(null, "New Balance: " + newBalance);

            if (newBalance > aLimit)
            {
                JOptionPane.showMessageDialog(null, "Credit limit exceeded");
                System.exit(0);
            }
        }
    }

    public class Nine {
        public static void main(String[] args)
        {

            Customer c1 = new Customer(); // Customer 1
            Customer c2 = new Customer(); // Customer 2

            String accountNumber, beginningBalance, itemsCharged, totalCredits, creditAllowed;

            // Customer 1
            accountNumber = JOptionPane.showInputDialog("Customer 1 | Account number: ");
            creditAllowed = JOptionPane.showInputDialog("Customer 1 | Credit limit: ");
            beginningBalance = JOptionPane.showInputDialog("Customer 1 | Beginning balance: ");
            itemsCharged = JOptionPane.showInputDialog("Customer 1 | Charged amount: ");
            totalCredits = JOptionPane.showInputDialog("Customer 1 | Total Credits: ");

            c1.aNumber = Integer.parseInt(accountNumber);
            c1.aLimit = Integer.parseInt(creditAllowed);
            c1.bBalance = Integer.parseInt(beginningBalance);
            c1.iCharged = Integer.parseInt(itemsCharged);
            c1.tCredit = Integer.parseInt(totalCredits);

            // Customer 2
            accountNumber = JOptionPane.showInputDialog("Customer 2 | Account number: ");
            creditAllowed = JOptionPane.showInputDialog("Customer 2 | Credit limit: ");
            beginningBalance = JOptionPane.showInputDialog("Customer 2 | Beginning balance: ");
            itemsCharged = JOptionPane.showInputDialog("Customer 2 | Charged amount: ");
            totalCredits = JOptionPane.showInputDialog("Customer 2 | Total Credits: ");

            c2.aNumber = Integer.parseInt(accountNumber);
            c2.aLimit = Integer.parseInt(creditAllowed);
            c2.bBalance = Integer.parseInt(beginningBalance);
            c2.iCharged = Integer.parseInt(itemsCharged);
            c2.tCredit = Integer.parseInt(totalCredits);

            // Results
            JOptionPane.showMessageDialog(null, "Click Ok to view result for Customer 1");
            c1.balance();

            JOptionPane.showMessageDialog(null, "Click Ok to view result for Customer 2");
            c2.balance();

        }
    }

