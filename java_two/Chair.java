abstract class Chair {
    Chair() {
        System.out.println("This is a chair");
    }
}

class WoodenChair extends Chair implements Furniture {
    static String chairType = "wooden";
    
    WoodenChair() {
        super();
        System.out.println("This is a " + chairType + " chair");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Wooden chairs have low resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Wooden chairs have moderate resistance to stress");
    }
}

class MetallicChair extends Chair implements Furniture {
    static String chairType = "metallic";
    
    MetallicChair() {
        System.out.println("This is a " + chairType + " chair");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Metallic chairs have high resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Metallic chairs have high resistance to stress");
    }
}