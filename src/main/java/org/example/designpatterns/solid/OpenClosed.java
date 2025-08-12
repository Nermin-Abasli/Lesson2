package org.example.designpatterns.solid;

public class OpenClosed {
}
  // Bad example
class Shape{
    String type;

  }
  class AreaCalculate {
      public double calcuateArea(Shape shape) {
          if (shape.type.equals("Cricle")) {
              return 3.14 * 5 * 5;
          } else if (shape.type.equals("Rectangl")) {
              return 10 * 5;

          }
          return 0;
      }

  }
  interface Shape1{
    double area();

  }

  class Cricle implements Shape1{
    private double radius;
    public Cricle(double radius){
        this.radius=radius;
    }
    public  double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
      public double area(){
        return Math.PI*radius*radius;
    }
  }
  class REctangle implements Shape1{
    private double height;
    private double with;
    public REctangle(double with,double height){
        this.with=with;
        this.height=height;
    }
    @Override
      public double area(){
        return with*height;
    }
  }
  class AreaCalc{
    public double calculateArea(Shape1 shape){
         return shape.area();
    }
  }
