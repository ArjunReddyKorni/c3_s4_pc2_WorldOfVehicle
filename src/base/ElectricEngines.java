package base;

public class ElectricEngines extends Electrical{


    private double voltage;

    public ElectricEngines(long modelNumber, int displacement, int maxPower,String batteryType,
                            double voltage) {
        super(modelNumber, displacement, maxPower,batteryType);

        this.voltage = voltage;
    }



    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void display(){

        System.out.println(" Specipications of Electric Engines");
        System.out.println("MaxPower ="+getMaxPower());
        System.out.println("Max Rpm"+getMaxRpm());
        System.out.println("Model Number"+getModelNumber());
        System.out.println("Voltage ="+getVoltage());
        System.out.println("Battery type"+getBatteryType());
    }
}
