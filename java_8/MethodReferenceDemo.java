/**
 * Question 3: Using (instance) method reference create and apply
 * add and subtract method and using (static) method reference
 * create and apply multiplication method for the functional interface created
 */

@FunctionalInterface
interface Processor {
    int processIntegers(int numberOne, int numberTwo);
}

public class MethodReferenceDemo {
    int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    
    int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
    
    static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    
    public static void main(String[] args) {
        Processor processor = new MethodReferenceDemo()::add;
        System.out.println("Adding: " + processor.processIntegers(12, 12));
        processor = new MethodReferenceDemo()::subtract;
        System.out.println("Subtract: " + processor.processIntegers(12, 12));
        processor = MethodReferenceDemo::multiply;
        System.out.println("Multiplying: " + processor.processIntegers(12, 12));
    }
}
