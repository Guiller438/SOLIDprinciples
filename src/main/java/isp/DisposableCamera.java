package isp;

class DisposableCamera implements Device {

    public void turnOn() {
        System.out.println("Disposable camera is turning on.");
    }

    public void turnOff() {
        System.out.println("Disposable camera is turning off.");
    }
}