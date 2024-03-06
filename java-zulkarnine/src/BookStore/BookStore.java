package BookStore;

import java.util.Scanner;

public class BookStore {
    static String[] books = {"Java", "Go", "Python"};
    static final double teacherDiscount = 0.3;
    static final double studentDiscount = 0.4;
    static final double alienDiscount = 0.0;

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--------WELCOME TO OUR BOOKSTORE--------");
        System.out.print("Which book do you want?\nAns: ");
        String userChoice = myScanner.nextLine();

        if (books[0].equalsIgnoreCase(userChoice)) {
            System.out.println("You opted for " + books[0] + " book.");
            calculatePrice(books[0]);
        }
        else if (books[1].equalsIgnoreCase(userChoice)) {
            System.out.println("You opted for " + books[1] + " book.");
            calculatePrice(books[1]);
        }
        else if (books[2].equalsIgnoreCase(userChoice)) {
            System.out.println("You opted for " + books[2] + " book.");
            calculatePrice(books[2]);
        }
        else {
            System.out.println("Sorry, we don't have this book.");
        }
    }

    static void calculatePrice(String bookName) {
        System.out.print("Are you a student or a teacher or a alien?\nAns: ");
        String answer = myScanner.nextLine();

        double price = 200;

        if (answer.equalsIgnoreCase("teacher")) {
            price = price - price * teacherDiscount;
            showPrice(price);
        } else if (answer.equalsIgnoreCase("student")) {
            price = price - price * studentDiscount;
            showPrice(price);
        } else if (answer.equalsIgnoreCase("alien")) {
            price = price - price * alienDiscount;
            showPrice(price);
        } else {
            System.out.println("Sorry, we can't serve you.");
        }
    }

    static void showPrice(double price) {
        System.out.println("Your total amount: " + price);
        System.out.println("--------Thank you for shopping! Come again please--------");
    }
}
