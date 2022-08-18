package base;

public class PetrolEngine extends IcEngines{
    public PetrolEngine(long modelNumber, int displacement, int maxPower, int maxRpm,
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

        System.out.println(" Specifications of Petrol Engine");
        System.out.println(getEmmission());
        System.out.println(getFuelType());
        System.out.println(getDisplacement());
        System.out.println(getMaxPower());
        System.out.println(getMaxRpm());
        System.out.println(getModelNumber());
        System.out.println(getNumberOfCylinders());
    }
}
