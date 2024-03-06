package CarProject;

public class CarClass {
    public String manufactureName;
    private final String modelName;
    private String carKeyValue;
    public int engineCC;
    private double fuelAmount;

    // constructors
    public CarClass() {
        manufactureName = "";
        modelName = "";
        engineCC = 0;
        fuelAmount = 0;
    }

    public CarClass(String manufactureName, String modelName, String carKeyValue, int engineCC, int fuelAmount) {
        this.manufactureName = manufactureName;
        this.modelName = modelName;
        this.carKeyValue = carKeyValue;
        this.engineCC = engineCC;
        this.fuelAmount = fuelAmount;
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
}
