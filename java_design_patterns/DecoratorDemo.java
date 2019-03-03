/**
 * Question 6: Implement the Decorator design pattern to decorate a pizza with toppings
 */

interface Pizza {
    void preparePizzaWithToppings();
}

class PeppyPaneer implements Pizza {
    String choiceOfCrust;
    boolean hasExtraCheese;
    
    public PeppyPaneer(String choiceOfCrust, boolean hasExtraCheese) {
        this.choiceOfCrust = choiceOfCrust;
        this.hasExtraCheese = hasExtraCheese;
    }
    
    @Override
    public void preparePizzaWithToppings() {
        System.out.println("a " + choiceOfCrust + " base and" + (hasExtraCheese ? " lots of " : " no ") + "extra cheese.");
    }
}

class VeggieParadise implements Pizza {
    String choiceOfCrust;
    boolean hasExtraOlives;
    
    public VeggieParadise(String choiceOfCrust, boolean hasExtraOlives) {
        this.choiceOfCrust = choiceOfCrust;
        this.hasExtraOlives = hasExtraOlives;
    }
    
    @Override
    public void preparePizzaWithToppings() {
        System.out.println("a " + choiceOfCrust + " base and" + (hasExtraOlives ? " lots of " : " no ") + "extra olives.");
    }
}

class PizzaMania implements Pizza {
    Pizza pizza;
    int numberOfPizzas;
    
    public PizzaMania(Pizza pizza, int numberOfPizzas) {
        this.pizza = pizza;
        this.numberOfPizzas = numberOfPizzas;
    }
    
    @Override
    public void preparePizzaWithToppings() {
        System.out.println("Here are the " + numberOfPizzas + " " + pizza.getClass().getName() + " pizzas you ordered!");
        System.out.print("Your pizzas have ");
        pizza.preparePizzaWithToppings();
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        PizzaMania pizzaMania1 = new PizzaMania(
                new PeppyPaneer("cheese burst", true),
                2);
        pizzaMania1.preparePizzaWithToppings();
        
        PizzaMania pizzaMania2 = new PizzaMania(
                new VeggieParadise("wheat thin crust", true),
                4);
        pizzaMania2.preparePizzaWithToppings();
    }
}
