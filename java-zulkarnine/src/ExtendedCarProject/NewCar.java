package ExtendedCarProject;

import CarProject.CarClass;
import CarProject.LearningClass;
import CarProject.SubCarClass;

public class NewCar {
    public static void main(String[] args) {
        CarClass aCar = new CarClass("NOT", "Allion", "qwerty", 1500, 30);

        SubCarClass aSubCar = new SubCarClass("Nissan", "350Z", "asdf", 4900, 30, 2011, "Blue", 12);
        aSubCar.printInfo();
        aCar.printInfo();
    }
}
