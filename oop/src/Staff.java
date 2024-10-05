public class Staff extends Person implements LibraryUser {
    private int staffID;

    // Constructor for Staff
    public Staff(String name, String phone, int staffID) {
        super(name, phone);
        this.staffID = staffID;
    }

    // Borrow book (staff specific)
    public void borrowBook() {
        System.out.println("Staff member " + getName() + " has borrowed a reference book for internal use.");
    }

    // Return book (staff specific)
    public void returnBook() {
        System.out.println("Staff member " + getName() + " has returned the reference book.");
    }

}
