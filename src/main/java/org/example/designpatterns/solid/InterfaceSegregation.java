package org.example.designpatterns.solid;

public class InterfaceSegregation {
}
//bad pracice
interface Machine{
    void print;
    void scan;

}
class Printer implements Machine{
    @Override
    public  void print(){
        System.out.println("I am using Printer");
    }
    @Override
    public void scan(){
        System.out.println("I dont using printer");
    }

}
//good practice
interface Printer1{
    void print();
}
interface Scanner1{
    void scan();
}
class SimplePrinter implements  Printer1{
    @Override
    public void print1();
}
class FunctionalPrinter implements Scanner1,Printer1{
    @Override
    public void print1();
    public void scan1();
}
