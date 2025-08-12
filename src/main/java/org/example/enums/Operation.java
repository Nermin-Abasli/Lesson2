package org.example.enums;

public enum Operation {
    ADD {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    Subtract {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    Multiply {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    };

    public abstract int apply(int a, int b);

}
class  TestOperation{
    public static void main(String[] args){
        System.out.println(Operation.ADD.apply(1,2));
        System.out.println(Operation.Subtract.apply(2,1));
        System.out.println(Operation.Multiply.apply(3,2));
    }
}
