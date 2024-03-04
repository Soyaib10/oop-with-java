package ReturningValueFromMethod;

public class ReturningValue {
    int squaree(int value) {
        return value * value;
    }
}

// public class test likhle error dey- java: class test is public,
// should be declared in a file named test.java. why?
class test {
    public static void main(String[] args) {
        ReturningValue obj = new ReturningValue();
        int result = obj.squaree(5);
        System.out.println("output: " + result);
    }
}
