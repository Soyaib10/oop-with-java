package ClassObjectProblem;

public class Box {
    double height, weight, depth;

    Box (double height, double weight, double depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    void displayVol() {
        System.out.println("Volume of the box: " + (height * weight * depth));
    }
}
