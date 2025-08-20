package org.example.creational;

public class Singleton {
    private static Singleton Instance;
    private Singleton (){}
    public static Singleton getInstance(){
        if (Instance==null) Instance= new Singleton();
        return Instance;
    }
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();
        System.out.println(s1);
        Singleton s2=Singleton.getInstance();
        System.out.println(s2);
    }
}
