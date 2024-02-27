//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create and object
        Human obj1 = new Human("Zihad"); // obj1 is a reference object, meaning creating copy of the Human() class for mome
        Human obj2 = new Human("Rrid", 22, 1.78);

        obj1.print();
        obj2.print();
    }
}