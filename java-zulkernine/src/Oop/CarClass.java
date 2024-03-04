package Oop;

public class CarClass {
    public String manufacturerName;
    public String modelName;
    public int engineCC;
    public float fuelAmount;

    public CarClass() {
        manufacturerName = new String();
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;
    }

    public CarClass(String carName) {
        manufacturerName = carName;
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;
    }

    public CarClass(String carName, String modelName, int engineCC, int fuelAmount) {
        manufacturerName = carName;
        engineCC = 0;
        fuelAmount = 0;
    }

    public float presentAmountOfFuel() {
        return fuelAmount;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }
}
