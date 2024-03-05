package Inheritance.Super.Problem;

public class Vehicle {
    String color;
    double weight;

    Vehicle(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    void attribute() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
