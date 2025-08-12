package org.example.enums;

public enum Day {
   MONDAY,TUESDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
class TestClass{
    public static void main(String[] args){
        Day today=Day.MONDAY;
        System.out.println(today);
        switch (today){
            case MONDAY-> System.out.println("Heftenin ilk gunu");
            case SATURDAY,SUNDAY-> System.out.println("Heftenin son gunleri");
            default -> System.out.println("Ish gunu");
        }
            for (Day day:Day.values()){
                System.out.println(day);
            }
    }
}
