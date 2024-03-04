package VariableLengthArgument;

public class VarArgs {
    void add(int ... nums) { // can take any length of argument.
        int sum = 0;
        for (int i : nums) sum += i;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        VarArgs obj = new VarArgs();
        obj.add(10, 34);
        obj.add(10, 34, 24);
        obj.add(10, 34, 4, 3);
    }
}
