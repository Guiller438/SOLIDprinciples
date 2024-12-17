package ocp;

public class Email implements NotificationType {
    public void send(String message) {        
        System.out.println("Sending SMS: " + message);    
      }
}