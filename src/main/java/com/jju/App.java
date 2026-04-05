import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SmartDevice> home = new ArrayList<>();

        home.add(new SmartLight("Living Room Lamp"));
        home.add(new SmartThermostat("Hallway Nest"));

        System.out.println("--- Activating Smart Home ---");
        for (SmartDevice device : home) {
            System.out.print(device.getName() + ": ");
            device.activate(); // Polymorphism happens here!
        }
    }
}
