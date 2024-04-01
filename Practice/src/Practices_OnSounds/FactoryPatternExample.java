package Practices_OnSounds;

//Product interface
interface Shape {
 void draw();
}

//Concrete Product: Circle
class Circle implements Shape {
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Concrete Product: Square
class Square implements Shape {
 public void draw() {
     System.out.println("Drawing a Square");
 }
}

//Factory interface
interface ShapeFactory {
 Shape createShape();
}

//Concrete Factory: CircleFactory
class CircleFactory implements ShapeFactory {
 public Shape createShape() {
     return new Circle();
 }
}

//Concrete Factory: SquareFactory
class SquareFactory implements ShapeFactory {
 public Shape createShape() {
     return new Square();
 }
}

//Client code using the Factory Method pattern
public class FactoryPatternExample {
 public static void main(String[] args) {
     // Create a Circle using CircleFactory
     ShapeFactory circleFactory = new CircleFactory();
     Shape circle = circleFactory.createShape();
     circle.draw();

     // Create a Square using SquareFactory
     ShapeFactory squareFactory = new SquareFactory();
     Shape square = squareFactory.createShape();
     square.draw();
 }
}
