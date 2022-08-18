package base;

public class DiselEngine extends IcEngines{

    private String fuelType;
    private String emmission;

    public DiselEngine(long modelNumber, int displacement,
                       int maxPower, int maxRpm, int noOfCylinders, String fuelType, String emmission) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.fuelType = fuelType;
        this.emmission = emmission;
    }

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

        System.out.println(" Specificaton of Disel Engine ");
        System.out.println(getDisplacement());
        System.out.println(getMaxPower());
        System.out.println(getMaxRpm());
        System.out.println(getModelNumber());
        System.out.println(getNumberOfCylinders());
        System.out.println(getEmmission());
        System.out.println(getFuelType());
    }
}
