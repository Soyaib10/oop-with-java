package CarProject;

public class CarClass {
    // variables
    public String manufactureName;

    private final String modelName;
    private String carKeyValue;
    private double fuelAmount;

    int engineCC;


    protected int manufactureYear;

    // constructors
    public CarClass() {
        manufactureName = "";
        modelName = "";
        engineCC = 0;
        fuelAmount = 0;
        manufactureYear = 0;
    }

    public CarClass(String manufactureName, String modelName, String carKeyValue, int engineCC, int fuelAmount) {
        this.manufactureName = manufactureName;
        this.modelName = modelName;
        this.carKeyValue = carKeyValue;
        this.engineCC = engineCC;
        this.fuelAmount = fuelAmount;
    }

    public CarClass(String manufactureName, String modelName, String carKeyValue, int engineCC, int fuelAmount, int manufactureYear) {
        this(manufactureName, modelName, carKeyValue, engineCC, fuelAmount);
        this.manufactureYear = manufactureYear;
    }

    // setter and getter methods
    public double getFuelAmount() {
        return fuelAmount;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public String getModelName() {
        return modelName;
    }

    // other methods
    public boolean matchCarKeyValue(String userInput) {
        return userInput.equals(carKeyValue);
    }

    public void addFuel(double fuelAmount) {
        this.fuelAmount += fuelAmount;
    }

    public void runForSeconds(int timeInSecond) {
        double amountOfFuelConsumedPerSecond = 0.2;
        double usedFuel = timeInSecond * amountOfFuelConsumedPerSecond;
        fuelAmount -= usedFuel;
    }

    public void printInfo() {
        System.out.println("Manufacturer: " + manufactureName);
        System.out.println("Manufacturer: " + getModelName());
        System.out.println("Manufacturer: " + matchCarKeyValue("done"));
        System.out.println("Present amount of fuel: " + getFuelAmount() + "L");
        addFuel(2);
        System.out.println("After adding 2L fuel amount is : " + getFuelAmount());
        runForSeconds(50);
        System.out.println("After running the car fuel amount: " + getFuelAmount());
        System.out.println();
    }
}
