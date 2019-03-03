/**
 * Question 5: Implement the Bridge design pattern for Color and Shape such that
 * Shape and Color can be combined together
 * eg.: BlueSquare, RedSquare, PinkTriangle, etc
 */

// Implementor
interface Color {
    String getColor();
}

// Concrete implementation
class Red implements Color {
    @Override
    public String getColor() {
        return "red";
    }
}

// Concrete implementation
class Blue implements Color {
    @Override
    public String getColor() {
        return "blue";
    }
}

// Concrete implementation
class Pink implements Color {
    @Override
    public String getColor() {
        return "pink";
    }
}

// Concrete implementation
class Violet implements Color {
    @Override
    public String getColor() {
        return "violet";
    }
}

// Abstraction
abstract class Shape {
    Color color;
    String type;
    
    public Shape(Color color) {
        this.color = color;
    }
}

// Refined abstraction
class Square extends Shape {
    
    public Square(Color color) {
        super(color);
        type = "square";
    }
    
    void getSquare() {
        System.out.println("I'm a " + type + " of color " + color.getColor());
    }
}

// Refined abstraction
class Triangle2 extends Shape {
    
    Triangle2(Color color) {
        super(color);
        type = "triangle";
    }
    
    void getTriangle2() {
        System.out.println("I'm a " + type + " of color " + color.getColor());
    }
}

// Refined abstraction
class Dodecahedron extends Shape {
    Dodecahedron(Color color) {
        super(color);
        type = "dodecahedron";
    }
    
    void getDodecahedron() {
        System.out.println("I'm a " + type + " of color " + color.getColor());
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Square square1 = new Square(new Blue());
        Square square2 = new Square(new Red());
        Triangle2 triangle2 = new Triangle2(new Pink());
        Dodecahedron dodecahedron = new Dodecahedron(new Violet());
        square1.getSquare();
        square2.getSquare();
        triangle2.getTriangle2();
        dodecahedron.getDodecahedron();
    }
}
