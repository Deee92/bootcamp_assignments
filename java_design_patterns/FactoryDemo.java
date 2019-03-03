/**
 * Question 2: Implement the Factory design pattern to get polygons of different types
 */

interface Polygon {
    void generatePolygon();
}

class Triangle implements Polygon {
    @Override
    public void generatePolygon() {
        System.out.println("I'm a triangle, which is a kind of polygon");
    }
}

class Quadrilateral implements Polygon {
    @Override
    public void generatePolygon() {
        System.out.println("I'm a square, which is a kind of polygon");
    }
}

class Pentagon implements Polygon {
    @Override
    public void generatePolygon() {
        System.out.println("I'm a pentagon, which is a kind of polygon");
    }
}

class Hexagon implements Polygon {
    @Override
    public void generatePolygon() {
        System.out.println("I'm a hexagon, which is a kind of polygon");
    }
}

class PolygonFactory {
    static Polygon getPolygonFactory(String polygonType) {
        switch (polygonType) {
            case "triangle":
                return new Triangle();
            
            case "quadrilateral":
                return new Quadrilateral();
            
            case "pentagon":
                return new Pentagon();
            
            case "hexagon":
                return new Hexagon();
            
            default:
                return null;
        }
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Polygon hexagonalPolygon = PolygonFactory.getPolygonFactory("hexagon");
        hexagonalPolygon.generatePolygon();
        Polygon pentagonalPolygon = PolygonFactory.getPolygonFactory("pentagon");
        pentagonalPolygon.generatePolygon();
    }
}
