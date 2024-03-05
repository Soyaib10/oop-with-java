package Encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("hello");
        System.out.println(obj.getName());

        obj.setAge(23);
        System.out.println(obj.getAge());
    }
}
