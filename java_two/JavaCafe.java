/**
 * Question 10: Design classes having attributes and method (only skeleton) for
 * a coffee shop. There are three different actors in our scenario -
 * Cashier, Customer, and Barista, and they have different actions
 */

import java.util.*;

public class JavaCafe {
    private Barista barista;
    private Cashier cashier;
    Queue<CafeOrder> cafeOrderQueue;
    Queue<Customer> customerQueue;
    
    JavaCafe() {
        System.out.println("Welcome to Java Cafe!");
        this.cafeOrderQueue = new LinkedList<>();
    }
    
    
    public void setBarista(Barista barista) {
        this.barista = barista;
    }
    
    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }
    
    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }
    
    public void startServingCustomers(Cashier cashier) {
        for (Customer c : this.customerQueue) {
            c.placeOrder(cashier);
        }
    }
    
    public static void main(String[] args) {
        JavaCafe javaCafe = new JavaCafe();
        Barista barista = new Barista();
        Cashier cashier = new Cashier();
        javaCafe.setCashier(cashier);
        javaCafe.setBarista(barista);
        // Create customers
        Customer customerOne = new Customer();
        Customer customerTwo = new Customer();
        Customer customerThree = new Customer();
        Customer customerFour = new Customer();
        Queue<Customer> customerQueue = new LinkedList<>();
        customerQueue.add(customerOne);
        customerQueue.add(customerTwo);
        customerQueue.add(customerThree);
        customerQueue.add(customerFour);
        javaCafe.setCustomerQueue(customerQueue);
        // Begin operations
        javaCafe.startServingCustomers(cashier);
    }
}
