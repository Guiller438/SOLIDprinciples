package ocp;

public class SMS implements NotificationType{    
  public void send(String message) {        
    System.out.println("Sending SMS: " + message);    
  }
}