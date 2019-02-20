/**
 * Question 9: Program to display values of enums using a constructor & getPrice() method
 * (Example display house & their prices)
 */

public enum EnumExample {
    HOGWARTS(179.6), SLYTHERIN(170.3), HUFFLEPUFF(140.5), RAVENCLAW(168.9);
    private double price;
    
    EnumExample(double price) {
        this.price = price;
    }
    
    void getPrice() {
        System.out.println("Price of " + this.name() + ": " + this.price);
    }
    
    public static void main(String[] args) {
        EnumExample houseOne = EnumExample.HOGWARTS;
        houseOne.getPrice();
        EnumExample houseTwo = EnumExample.SLYTHERIN;
        houseTwo.getPrice();
        EnumExample houseThree = EnumExample.HUFFLEPUFF;
        houseThree.getPrice();
        EnumExample houseFour = EnumExample.RAVENCLAW;
        houseFour.getPrice();
        
    }
}
