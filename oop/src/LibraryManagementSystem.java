import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter member name:");
        String memberName = scanner.nextLine();

        System.out.println("Enter member phone:");
        String memberPhone = scanner.nextLine();

        System.out.println("Enter member ID:");
        int memberID = scanner.nextInt();
        scanner.nextLine();  // Consume newline character after int input

        Member member = new Member(memberName, memberPhone, memberID);

        System.out.println("Enter staff name:");
        String staffName = scanner.nextLine();

        System.out.println("Enter staff phone:");
        String staffPhone = scanner.nextLine();

        System.out.println("Enter staff ID:");
        int staffID = scanner.nextInt();

        Staff staff = new Staff(staffName, staffPhone, staffID);

        LibraryUser user;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Member borrows a book");
            System.out.println("2. Member returns a book");
            System.out.println("3. Staff borrows a book");
            System.out.println("4. Staff returns a book");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user = member;
                    user.borrowBook();
                    break;
                case 2:
                    user = member;
                    user.returnBook();
                    break;
                case 3:
                    user = staff;
                    user.borrowBook();
                    break;
                case 4:
                    user = staff;
                    user.returnBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
