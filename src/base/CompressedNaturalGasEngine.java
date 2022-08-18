package base;

public class CompressedNaturalGasEngine extends IcEngines{
    public CompressedNaturalGasEngine(long modelNumber, int displacement, int maxPower, int maxRpm,
                                      int noOfCylinders, String fuelType, String emmission) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.fuelType = fuelType;
        this.emmission = emmission;
    }

    private String fuelType;
    private String emmission;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEmmission() {
        return emmission;
    }

    public void setEmmission(String emmission) {
        this.emmission = emmission;
    }
    public void display(){

        System.out.println(" Specification of a CNG ");
        System.out.println("Displacement = "+getDisplacement());
        System.out.println("Max power =" +getMaxPower());
        System.out.println("Max Rpm"+getMaxRpm());
        System.out.println("Model Number ="+getModelNumber());
        System.out.println("number Of cylinders" +getNumberOfCylinders());
        System.out.println("Emmission"+getEmmission());
        System.out.println(getFuelType());
    }
}
