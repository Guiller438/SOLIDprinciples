package dip;

public class CreditCardPayment implements PaymentType
{
  
  public void processPayment(double amount){
    System.out.println("Processing credit card payment of amount: " + amount);
  }  
  
}