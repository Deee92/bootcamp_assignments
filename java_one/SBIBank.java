public class SBIBank extends Bank {
    SBIBank(String name, double interest) {
        super(name, interest);
    }
    
    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Thanks for visiting " + this.bankName + ".");
    }
}
