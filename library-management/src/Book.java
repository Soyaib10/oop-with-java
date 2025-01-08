public class Book {
    private String bookId;
    private String bookName;
    private String bookAuthorName;
    private int bookAmount;

    // Constructor
    public Book(String bookId, String bookName, String bookAuthorName, int bookAmount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;

        // Validate bookAmount
        if (bookAmount < 0) {
            throw new IllegalArgumentException("Book amount cannot be negative.");
        }
        this.bookAmount = bookAmount;
    }

    // Getters and Setters
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(int bookAmount) {
        if (bookAmount < 0) {
            throw new IllegalArgumentException("Book amount cannot be negative.");
        }
        this.bookAmount = bookAmount;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookAmount=" + bookAmount +
                '}';
    }
}
