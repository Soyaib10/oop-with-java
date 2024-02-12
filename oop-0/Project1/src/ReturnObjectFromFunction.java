public class ReturnObjectFromFunction {
    public static void main(String[] args) {
        People obj1 = new People();

        obj1.skinTone = "dark";
        // store the objPeople object from produce() in obj2
        People obj2 = obj1.produce();
    }
}

class People {
    String skinTone;

    // produce() return a object named objPeople
    public People produce() {
        People objPeople = new People();
        return objPeople;
    }
}
