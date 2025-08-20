package org.example.creational;

public class Builder {
    private String name;
    private String surname;
    public static class DataBuilder{
        private String name;
        private String surname;
        public DataBuilder name(String name){
            this.name=name;
            return this;
        }

        public DataBuilder(String surname) {
            this.surname = surname;
        }
        public Builder build(){
            Builder b=new Builder();
            b.name=name;
            b.surname=surname;
            return  b;
        }
    }
}
