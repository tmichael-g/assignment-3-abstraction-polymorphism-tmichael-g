public abstract class SmartDevice {
    private String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    // This is the "Contract" - Every device MUST have an activate method
    public abstract void activate();
}
