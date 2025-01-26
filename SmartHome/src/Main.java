//Demonstrates the creation of appliances, their addition to the controller, turning them on, and managing their states.
public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();
        // Create appliances
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();
        AirConditioner ac = new AirConditioner();
        // Add appliances to the controller
        controller.addAppliance(livingRoomLight);
        controller.addAppliance(ceilingFan);
        controller.addAppliance(ac);
        // Turn on all appliances
        controller.turnOnAll();
        // Set fan speed
        ceilingFan.setSpeed(2); // Set to high speed
        controller.statusCheck();
        //System.out.println(controller.statusCheck());
        // Schedule the yearly update
        controller.scheduleYearlyUpdate();
    }
}