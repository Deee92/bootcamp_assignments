/**
 * Question 3: Produce NoClassDefFoundError and ClassNotFoundException exception
 */

class UnfoundClass {
    UnfoundClass() {
        System.out.println("I will not be found at runtime");
    }
}

public class ClassExceptions {
    public static void main(String[] args) {
        try {
            // ClassNotFoundException
            // Class.forName("deepika.tiwari");
            // NoClassDefFoundError
            UnfoundClass ufc = new UnfoundClass();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("I'm in finally block");
        }
    }
}
