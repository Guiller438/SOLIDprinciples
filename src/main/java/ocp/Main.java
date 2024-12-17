package ocp;

public class Main {
    public static void main(String[] args) {
        NotificationService ns = new NotificationService();
        ns.sendNotification(new SMS(), "123");
        ns.sendNotification(new Email(), "123");
        ns.sendNotification(new PushNotification(), "123");
    }
}