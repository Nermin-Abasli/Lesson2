package org.example.structural;

public class Decorator {
}
interface Coffee{
    String getDescription();
    double getPrice();
}
class SimpleCoffee implements Coffee{
    public String getDescription()
    {
        return "Simple coffee";
    }
    public double getPrice(){
        return 1.5;
    }
}
class MilkDecorator implements Coffee{
    private final Coffee coffee;
      public MilkDecorator  (Coffee coffee){
    this.coffee=coffee;

}
public String getDescription(){
          return coffee.getDescription()+",Milk-";
      }
      public double getPrice(){
          return  coffee.getPrice()+1;
      }
      public  static  void  main(String[] args){
          MilkDecorator milkDecorator=new MilkDecorator(new SimpleCoffee());
          System.out.println(milkDecorator.getDescription()+milkDecorator.getPrice()+"$");
      }
}