/**
 * Question 3: Implement the Abstract Factory design pattern
 * to create cars of different categories from different countries
 */

enum CarCategory {
    MICRO, MINI, LUXURY
}

enum CarFactoryLocation {
    DEFAULT, USA, INDIA
}

abstract class Car {
    CarCategory carCategory;
    CarFactoryLocation carFactoryLocation;
    
    public Car(CarCategory carCategory, CarFactoryLocation carFactoryLocation) {
        this.carCategory = carCategory;
        this.carFactoryLocation = carFactoryLocation;
    }
    
    abstract void construct();
    
    @Override
    public String toString() {
        return ("___Car___" +
                "\ncategory: " + carCategory +
                "\nfacory location: " + carFactoryLocation);
    }
}

class LuxuryCar extends Car {
    public LuxuryCar(CarFactoryLocation carFactoryLocation) {
        super(CarCategory.LUXURY, carFactoryLocation);
    }
    
    @Override
    void construct() {
        System.out.println("Constructing a luxury car");
    }
}

class MiniCar extends Car {
    
    public MiniCar(CarFactoryLocation carFactoryLocation) {
        super(CarCategory.MINI, carFactoryLocation);
    }
    
    @Override
    void construct() {
        System.out.println("Constructing a mini car");
    }
}

class MicroCar extends Car {
    
    public MicroCar(CarFactoryLocation carFactoryLocation) {
        super(CarCategory.MINI, carFactoryLocation);
    }
    
    @Override
    void construct() {
        System.out.println("Constructing a micro car");
    }
}

class IndianCarFactory {
    static Car buildCar(CarCategory carCategory) {
        Car car = null;
        switch (carCategory) {
            case MICRO:
                car = new MicroCar(CarFactoryLocation.INDIA);
                break;
            case MINI:
                car = new MiniCar(CarFactoryLocation.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(CarFactoryLocation.INDIA);
                break;
        }
        return car;
    }
    
}

class DefaultCarFactory {
    static Car buildCar(CarCategory carCategory) {
        Car car = null;
        switch (carCategory) {
            case MICRO:
                car = new MicroCar(CarFactoryLocation.DEFAULT);
                break;
            case MINI:
                car = new MiniCar(CarFactoryLocation.DEFAULT);
                break;
            case LUXURY:
                car = new LuxuryCar(CarFactoryLocation.DEFAULT);
                break;
        }
        return car;
    }
}

class USACarFactory {
    static Car buildCar(CarCategory carCategory) {
        Car car = null;
        switch (carCategory) {
            case MICRO:
                car = new MicroCar(CarFactoryLocation.USA);
                break;
            case MINI:
                car = new MiniCar(CarFactoryLocation.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(CarFactoryLocation.USA);
                break;
        }
        return car;
    }
}

class CarFactory {
    Car car = null;
    static Car buildCar(CarCategory carCategory, CarFactoryLocation carFactoryLocation) {
        Car car = null;
        switch (carFactoryLocation) {
            case INDIA:
                car = IndianCarFactory.buildCar(carCategory);
                break;
            case USA:
                car = USACarFactory.buildCar(carCategory);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(carCategory);
                break;
        }
        return car;
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println(
                CarFactory.buildCar(CarCategory.MICRO, CarFactoryLocation.DEFAULT)
        );
    }
}

