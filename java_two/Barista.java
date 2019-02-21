/**
 * Gets the next order from the queue
 * Prepares the coffee
 * Places the coffee in the completed order queue
 * Places a notification that order for token is ready
 */

public class Barista {
    void getNextOrder() {
        // Accesses order queue for next order
        System.out.println("Getting the next order from the order queue");
    }
    void prepareCoffee() {
        // Takes some time to prepare item(s) in order
        System.out.println("Preparing your coffee");
    }
    void serveCoffee() {
        // Notifies customer, serves order items when ready
        System.out.println("Enjoy your coffee!");
    }
    Barista() {
        System.out.println("I'm a barista working at JavaCafe.");
    }
}
