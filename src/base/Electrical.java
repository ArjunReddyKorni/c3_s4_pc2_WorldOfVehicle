package base;

public class Electrical extends Engine{

    private String batteryType;
    public Electrical(long modelNumber, int maxPower, int maxRpm,String batteryType) {
        super(modelNumber, maxPower, maxRpm);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }
}
