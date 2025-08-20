package org.example.creational;

public class Factory {
}
interface Shape{
    void draw();
}
class Cricle implements Shape{
    @Override
    public void draw() {
        System.out.println("Cricle");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equals("Cricle")) {
            return new Cricle();
        }
        if (shapeType.equals("Square")) {
            return new Square();
        }
        return null;
    }
}
class Main {
    public static void main(String[] args){
        ShapeFactory factory=new ShapeFactory();
        factory.getShape("Square").draw();
        factory.getShape("Cricle").draw();
    }
}
