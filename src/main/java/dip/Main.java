package dip;

public class Main{
    public static void main(String[] args) {
    PaymentType card = new CreditCardPayment();
      PaymentProcessor processor = new PaymentProcessor(card);
      processor.makePayment(100.0);
      
    
    }
}