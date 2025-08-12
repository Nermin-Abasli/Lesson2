package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age=age;
    }

  private void SayHello(){
        System.out.println("Hello" +name+ " !");
  }
    }
    class ReflectionExcample{
    public static void main(String[] args) throws Exception{
        Class <?> clazz=Person.class;
        System.out.println("Class" + clazz.getSimpleName());
        for (Field field: clazz.getDeclaredFields()){
            System.out.println("Field: "+ field.getName() +" :" + field.getType().getSimpleName());

        }
        for (Method method: clazz.getDeclaredMethods()){
            System.out.println("Method: " + method.getName()+ ":" + method.getReturnType().getSimpleName());

        }
        Person person =new Person("Kenan",25);
        Method method=Person.class.getDeclaredMethod("sayHello");
        method.setAccessible(true);
        method.invoke(person);
        Constructor<Person> constructor=Person.class.getDeclaredConstructor(String.class,int.class);
        Person p=constructor.newInstance("Test",100);
        method.invoke(p);
    }
    }

