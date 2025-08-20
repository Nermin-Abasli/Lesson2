package org.example.behavioral;

public class Strategy {
}
interface PaymentStrategy{
    void pay(int amount);
}
class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid with Creditcard"+ amount);
    }
}
class DebitcartPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("PAID with Debit card"+amount);
    }
}
class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
    public static void main(String[] args){
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkout(50);

        shoppingCart.setPaymentStrategy(new DebitcartPayment());
        shoppingCart.checkout(10);
    }
}