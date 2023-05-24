package p2;

class Shape {
    public void printShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {

    public void printShape() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle extends Shape {
    @Override
    public void printShape() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    
    public void printShape() {
        System.out.println("Square is a rectangle.");
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();  
        Rectangle rectangle = new Rectangle();
        rectangle.printShape();  

        Shape shape = new Shape();
        shape.printShape(); 
    }
}

