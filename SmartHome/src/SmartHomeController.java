//Manages the collection of appliances, provides functions for turning them on and off, and checks their status.
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
public class SmartHomeController {
    private List<Appliance> appliances;
    public SmartHomeController() {
        appliances = new ArrayList<>();
    }
    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
        System.out.println("Added: " + appliance.getStatus());
    }
    public void turnOnAll() {
        for (Appliance appliance : appliances) {
            appliance.turnOn();
        }
    }
    public void turnOffAll() {
        for (Appliance appliance : appliances) {
            appliance.turnOff();
        }
    }
    public void statusCheck() {
        for (Appliance appliance : appliances) {
            System.out.println(appliance.getStatus());
        }
    }
    public void scheduleYearlyUpdate() {
        Timer timer = new Timer();
        
        // Find the next January 1st at 1:00 AM
        Calendar nextUpdate = Calendar.getInstance();
        int currentYear = nextUpdate.get(Calendar.YEAR);
        
        // If today is after January 1st, set to the next year's January 1st
        if (nextUpdate.get(Calendar.MONTH) == Calendar.JANUARY 
            && nextUpdate.get(Calendar.DAY_OF_MONTH) > 1) {
            nextUpdate.set(Calendar.YEAR, currentYear + 1);
        }
        nextUpdate.set(Calendar.MONTH, Calendar.JANUARY);
        nextUpdate.set(Calendar.DAY_OF_MONTH, 1);
        nextUpdate.set(Calendar.HOUR_OF_DAY, 1);
        nextUpdate.set(Calendar.MINUTE, 0);
        nextUpdate.set(Calendar.SECOND, 0);
        
        // If the set time is in the past, add one year
        if (nextUpdate.getTimeInMillis() < System.currentTimeMillis()) {
            nextUpdate.add(Calendar.YEAR, 1);
        }
        // Schedule the task
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Scheduled update. Turning off all devices.");
                turnOffAll();
            }
        }, nextUpdate.getTime()); // run at the calculated next January 1st
    }
}
