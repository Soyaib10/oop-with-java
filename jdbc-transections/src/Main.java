import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/len-den";
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
            connection.setAutoCommit(false);

            String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
            String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter account number: ");
            int account_number = scanner.nextInt();
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            debitPreparedStatement.setDouble(1, amount);
            debitPreparedStatement.setInt(2, account_number);
            creditPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2, 102);
            debitPreparedStatement.executeUpdate();
            creditPreparedStatement.executeUpdate();

            if (isSufficient(connection, account_number, amount)) {
                connection.commit();
                System.out.println("Transaction successful!");
            } else {
                connection.rollback();
                System.out.println("Transaction failed!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isSufficient(Connection connection, int account_number, double amount) {
        String query = "SELECT balance FROM accounts WHERE account_number = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_number);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                if (current_balance >= amount) {
                    return true;
                } else {
                    System.out.println("Transaction failed: Insufficient funds!");
                }
            } else {
                System.out.println("Transaction failed: Account not found!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}