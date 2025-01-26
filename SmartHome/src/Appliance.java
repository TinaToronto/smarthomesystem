//Defines the basic operations that any appliance must implement.
public interface Appliance {
    void turnOn();
    void turnOff();
    String getStatus();
}