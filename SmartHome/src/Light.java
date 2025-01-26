//implement the interface and provide specific implementations for turning on/off and checking status.
public class Light implements Appliance {
    private boolean isOn;
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light turned on.");
    }
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light turned off.");
    }
    @Override
    public String getStatus() {
        return isOn ? "Light is on" : "Light is off";
    }
}