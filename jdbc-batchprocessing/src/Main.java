import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc-crud";
    private static final String userName = "root";
    private static final String password = "";

    public static void main(String[] args) {
        // load drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // database connection
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);

            // insert using batch-processing normal way
            while (true) {
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter marks: ");
                double marks = scanner.nextDouble();
                System.out.print("Enter more data(Y/N)?: ");
                String choice = scanner.next();
                String insert = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)", name, age, marks);
                statement.addBatch(insert);
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }

            int[] a = statement.executeBatch();
            boolean flag = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    System.out.println("Query no " + (i + 1) + " not executed successfully");
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Query successful!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}