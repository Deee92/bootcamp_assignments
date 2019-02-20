/**
 * Question 11: Create 3 subclasses of Bank SBI, BOI, ICICI
 * All four should have a method called getDetails()
 * which provide there specific details like rateofInterest etc
 * Print details of every banks
 */

public class Bank {
    String bankName;
    double rateOfInterest;
    
    Bank(String name, double interest) {
        bankName = name;
        rateOfInterest = interest;

    }
    void getDetails() {
        System.out.println("___Bank Details___");
        System.out.println("Name: " + this.bankName);
        System.out.println("Rate of Interest: " + this.rateOfInterest + "%");
    }
    
    public static void main(String[] args) {
        Bank myBank = new Bank("Parent Bank", 7.5);
        myBank.getDetails();
        ICICIBank icici = new ICICIBank("ICICI Bank", 7.6);
        icici.getDetails();
        SBIBank sbi = new SBIBank("State Bank of India", 7.8);
        sbi.getDetails();
        BOIBank boi = new BOIBank("Bank of India", 7.7);
        boi.getDetails();
    }
}
