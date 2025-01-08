import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends User{
    private List<Book> borrowedBooks;
    private static final int MAX_BORROW_LIMIT = 3;
    private static final int FINE_PER_DAY = 10;

    public Student(String userId, String userName) {
        super(userId, userName);
        this.borrowedBooks = new ArrayList<>();
    }

    public String borrowBook(Book book) {
        if (borrowedBooks.size() > MAX_BORROW_LIMIT) {
            return "Cannot borrow more books. Maximum limit reached!";
        }
        borrowedBooks.add(book);
        return getUserName() + " borrowed " + book.getBookName() + " successfully. " ;
    }

    public String returnBook(String bookId, int daysBorrowed) {
        for (Book i : borrowedBooks) {
            if (Objects.equals(i.getBookId(), bookId)) {
                borrowedBooks.remove(i);
                int fine = calculateFine(daysBorrowed);
                return "Book returned successfully. Total fine of " + getUserName() + " is " + fine;
            }
        }
        return "Book not found in borrowed list";
    }

    public int calculateFine(int daysBorrowed) {
        int gracePeriod = 3;
        if (daysBorrowed > gracePeriod) {
            return (daysBorrowed - gracePeriod) * FINE_PER_DAY;
        }
        return 0;
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
            return;
        }
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
