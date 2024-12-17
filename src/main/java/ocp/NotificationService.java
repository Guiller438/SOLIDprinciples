package ocp;
public class NotificationService {    
    public void sendNotification(NotificationType type, String message) 
    {        
      type.send(message);    
    }
}