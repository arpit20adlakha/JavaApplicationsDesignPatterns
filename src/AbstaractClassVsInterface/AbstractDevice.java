package AbstaractClassVsInterface;

import java.util.AbstractList;

public abstract class AbstractDevice implements ManagedDevice {

    protected String serialNumber;
    protected boolean on;

    public AbstractDevice(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected void setOn(boolean on) {
        this.on = on;
    }

}
