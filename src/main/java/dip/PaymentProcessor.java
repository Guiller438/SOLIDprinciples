package dip;

public class PaymentProcessor{
  private PaymentType paymentType;


  public PaymentProcessor(PaymentType paymentType){
    this.paymentType = paymentType;
  }
  public void makePayment(double amount){
    System.out.println("Pay is being made");
    paymentType.processPayment(amount);
  }
}