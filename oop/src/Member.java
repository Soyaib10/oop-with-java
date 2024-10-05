class Member extends Person implements LibraryUser {
    private int memberID;
    private int booksBorrowed;

    // Constructor for Member
    public Member(String name, String phone, int memberID) {
        super(name, phone);
        this.memberID = memberID;
        this.booksBorrowed = 0;
    }

    // Borrow book method
    public void borrowBook() {
        if (booksBorrowed < 3) {
            booksBorrowed++;
            System.out.println(getName() + "has borrowed a book. Total borrowed" + booksBorrowed);
        } else {
            System.out.println("Can't borrow more than 3 books.");
        }
    }

    // Return book method
    public void returnBook() {
        if (booksBorrowed > 0) {
            booksBorrowed--;
            System.out.println(getName() + " has returned a book. Remaining borrowed: " + booksBorrowed);
        } else {
            System.out.println("No books to return.");
        }
    }
}











