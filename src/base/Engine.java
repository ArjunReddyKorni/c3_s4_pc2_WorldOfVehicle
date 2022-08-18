package base;

public class Engine {
    private  long modelNumber;

    private int maxPower;
    private int maxRpm;


    public Engine(long modelNumber,  int maxPower, int maxRpm) {
        this.modelNumber = modelNumber;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;

    }

    public long getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(long modelNumber) {
        this.modelNumber = modelNumber;
    }



    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }


    public void display(){
        System.out.println("modelNumber = " + modelNumber);
        System.out.println("maxPower = " + maxPower);
        System.out.println("maxRpm = " + maxRpm);

    }
}
