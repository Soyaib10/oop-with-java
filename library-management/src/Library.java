public class Library {
    public static void main(String[] args) {
        Student student = new Student("U001", "Rrid");

        Book book1 = new Book("B001", "Effective Java", "Joshua Bloch", 2);
        Book book2 = new Book("B002", "Clean Code", "Robert C. Martin", 3);

        System.out.println(student.borrowBook(book1));
        System.out.println(student.borrowBook(book2));

        student.displayBorrowedBooks();

        System.out.println(student.returnBook("B001", 15));
        student.displayBorrowedBooks();

        System.out.println(student.returnBook("B003", 7));
        student.displayBorrowedBooks();
    }
}
