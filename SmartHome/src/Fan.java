//implement the interface and provide specific implementations for turning on/off and checking status.
public class Fan implements Appliance {
    private int speed; // 0 = off, 1 = low speed, 2 = high speed
    @Override
    public void turnOn() {
        speed = 1; // Default to low speed
        System.out.println("Fan turned on at low speed.");
    }
    @Override
    public void turnOff() {
        speed = 0;
        System.out.println("Fan turned off.");
    }
    @Override
    public String getStatus() {
        return speed == 0 ? "Fan is off" : "Fan is on at speed " + speed;
    }
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 2) {
            this.speed = speed;
            System.out.println("Fan speed set to " + speed);
        } else {
            System.out.println("Invalid speed. Speed must be 0, 1, or 2.");
        }
    }
}