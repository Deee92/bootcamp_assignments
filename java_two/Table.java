abstract class Table {
    Table() {
        System.out.println("This is a table");
    }
}

class WoodenTable extends Table implements Furniture {
    static String tableType = "wooden";
    
    WoodenTable() {
        super();
        System.out.println("This is a " + tableType + " table");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Wooden tables have low resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Wooden tables have moderate resistance to stress");
    }
}

class MetallicTable extends Table implements Furniture {
    static String tableType = "Metallic";
    
    MetallicTable() {
        System.out.println("This is a " + tableType + " table");
    }
    
    @Override
    public void fireTest() {
        System.out.println("Metallic tables have high resistance to fire");
    }
    
    @Override
    public void stressTest() {
        System.out.println("Metallic tables have high resistance to stress");
    }
}