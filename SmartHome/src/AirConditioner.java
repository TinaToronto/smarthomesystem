//implement the interface and provide specific implementations for turning on/off and checking status.
public class AirConditioner implements Appliance {
    private boolean isOn;
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Air Conditioner turned on.");
    }
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Air Conditioner turned off.");
    }
    @Override
    public String getStatus() {
        return isOn ? "Air Conditioner is on" : "Air Conditioner is off";
    }
}