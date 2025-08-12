package org.example.enums;

public enum OrderStatus {
    PENDING("sifaris gozlemede"),
    SHIPPED("sifarish gonderildi"),
    DELIVERED("sifarish catdirildi"),
    CANCELLED("sifarish legv olundu");

    private final String description;
    OrderStatus (String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
class OrderTest{
    public static void main(String[] args){
        OrderStatus status=OrderStatus.PENDING;

        System.out.println(status);
        System.out.println(status.getDescription());
    }
}
