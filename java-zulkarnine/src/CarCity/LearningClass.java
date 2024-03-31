package CarProject;

public class LearningClass {
    public static void main(String[] args) {
        // CarClass object
        CarClass ourAnotherCar = new CarClass("Toyota", "Allion", "qwerty", 1500, 30);
        ourAnotherCar.printInfo();

        // SubCarClass object
        SubCarClass ourSubCar = new SubCarClass("BMW", "7SERIES", "asdfk", 2000, 40, "Red", 39.8);
        ourSubCar.printInfo();
    }
}
