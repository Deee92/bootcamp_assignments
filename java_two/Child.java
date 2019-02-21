/**
 * Question 12: Output on new Child();
 */

public class Child extends Parent {
    static {
        System.out.println("static - child");
    }
    
    {
        System.out.println("instance - child");
    }
    
    public Child() {
        System.out.println("constructor - child");
    }
}

class ChildTest {
    public static void main(String[] args) {
        Child c = new Child();
    }
}