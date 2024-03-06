package CarProject;

public class LearningClass {
    public static void main(String[] args) {
        // CarClass object
        CarClass ourAnotherCar = new CarClass("Toyota", "Allion", "qwerty", 1500, 30);
        System.out.println("Manufacturer: " + ourAnotherCar.manufactureName);
        System.out.println("Manufacturer: " + ourAnotherCar.getModelName());
        System.out.println("Manufacturer: " + ourAnotherCar.matchCarKeyValue("done"));
        System.out.println("Present amount of fuel: " + ourAnotherCar.getFuelAmount() + "L");
        ourAnotherCar.addFuel(2);
        System.out.println("After adding 2L fuel amount is : " + ourAnotherCar.getFuelAmount());
        ourAnotherCar.runForSeconds(50);
        System.out.println("After running the car fuel amount: " + ourAnotherCar.getFuelAmount());
        System.out.println();

        // SubCarClass object
        SubCarClass ourSubCar = new SubCarClass("BMW", "7SERIES", "asdfk", 2000, 40, "Red", 39.8);
        System.out.println("Manufacturer: " + ourSubCar.manufactureName);
        System.out.println("Manufacturer: " + ourSubCar.getModelName());
        System.out.println("Manufacturer: " + ourSubCar.matchCarKeyValue("done"));
        System.out.println("Present amount of fuel: " + ourSubCar.getFuelAmount() + "L");
        ourSubCar.addFuel(2);
        System.out.println("After adding 2L fuel amount is : " + ourSubCar.getFuelAmount());
        ourSubCar.runForSeconds(50);
        System.out.println("After running the car fuel amount: " + ourSubCar.getFuelAmount());
        System.out.println("Car color: " + ourSubCar.getColorString());
        System.out.println("Charge in battery: " + ourSubCar.getChargeInBattery());

    }
}
