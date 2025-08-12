package org.example.designpatterns.solid;

public class LiskovSubstitution {
}
// bad practices
class Bird{
    public void  fly(){
        System.out.println("Bird fly");

    }
}
class Ostrich extends Bird{
    public void fly(){
        throw new RuntimeException("Ostrch can't fly");
    }

}
//good practice
interface Bird1{}
interface Flyable extends Bird1{
    void fly();
}
class Sparrow implements Flyable{
    @Override
    public void fly(){
        System.out.println("Sparrow fly");
    }
    class Ostirch1 extends Bird{}
}
