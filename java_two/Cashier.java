/**
 * Takes an order and payment from the customer
 * Upon payment, creates an order and places it into the order queue
 * Intimates the customer that he has to wait for his token and gives him his token
 * Assumption: Token returned to the customer is the order id. Order queue is unlimited.
 * With a simple modification, we can design for a limited queue size
 */

public class Cashier {
    int createOrder() {
        // Creates a new order, returns its ID
        new CafeOrder(1);
        return 1;
    }
    Cashier() {
        System.out.println("I'm a cashier working at JavaCafe.");
    }
    
}
