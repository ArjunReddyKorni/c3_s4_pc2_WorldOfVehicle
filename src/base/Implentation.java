package base;

public class Implentation {

    public static void main(String[] args) {

        PetrolEngine petrolEngine = new PetrolEngine(324,550,30,3000,4,"petrol","high");
        DiselEngine diselEngine = new DiselEngine(43527,54,4578,345,4,"Disel","high");
        CompressedNaturalGasEngine compressedNaturalGasEngine = new CompressedNaturalGasEngine(1234,34,45,56,4,"Cng","Medium");
        ElectricEngines electricEngines = new ElectricEngines(984563,345,876,"Lithium",4550);

        petrolEngine.display();
        diselEngine.display();
        compressedNaturalGasEngine.display();
        electricEngines.display();

    }
}
