package isp;

class Phone implements Device, DeviceRechargeable {

  public void turnOn() {
    System.out.println("Turning on the phone");
  }

  public void turnOff() {
    System.out.println("Turning off the phone");
  }

  public void charge() {
    System.out.println("Charging");
  }

}