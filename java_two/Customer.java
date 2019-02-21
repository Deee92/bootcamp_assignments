/**
 * Pays the cash to the cashier and places his order, gets a token number back
 * Waits for the intimation that order for his token is ready
 * Upon intimation/notification he collects the coffee and enjoys his drink
 * Assumption: Customer waits till the coffee is done, he wont timeout and
 * cancel the order. Customer always likes the drink served.
 * Exceptions like he not liking his coffee, he getting wrong coffee are not
 * considered to keep the design simple.
 */

public class Customer {
    int tokenNumber;
    
    // Calls createOrder() in Cashier
    void placeOrder(Cashier cashier) {
        tokenNumber = cashier.createOrder();
    }
    void enjoyDrink() {
        // Notified by barista when order ready
        System.out.println("Thanks for the coffee!");
    }
    Customer() {
        System.out.println("I'm a customer in JavaCafe.");
    }
}
