package Inheritance.PrivateMemberInheritance;

public class Teacher extends Person {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Qualification: " + qualification);
    }
}
