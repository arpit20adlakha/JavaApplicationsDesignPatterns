package AbstaractClassVsInterface;

public class Kettle extends AbstractDevice {
    protected double volume;

    public Kettle(String serialNumber, double volume) {
        super(serialNumber);
        this.volume = volume;
    }

    @Override
    public void on() {
        // logic to activate all electronice components
        setOn(true);
    }

    @Override
    public  void off() {
        setOn(false);
    }
}
