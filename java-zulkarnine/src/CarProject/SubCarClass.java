package CarProject;

public class SubCarClass extends CarClass {
    private String colorString;
    private double chargeInBattery;

    // constructors
    public SubCarClass() {
        super();
    }

    public SubCarClass(String manufactureName, String modelName, String carKeyValue, int engineCC, int fuelAmount, String colorString, double chargeInBattery) {
        super(manufactureName, modelName, carKeyValue, engineCC, fuelAmount);
        this.colorString = colorString;
        this.chargeInBattery = chargeInBattery;
    }

    // setter and getter methods
    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }

    public double getChargeInBattery() {
        return chargeInBattery;
    }

    public void setChargeInBattery(double chargeInBattery) {
        this.chargeInBattery = chargeInBattery;
    }
}
