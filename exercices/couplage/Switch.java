public class Switch {
    private Device device;
    Switch(Device device)
    {
        this.device=device;
    }
    public void activate()
    {
        device.turnOn();
    }
}
