import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/?user=root";
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
            Statement statement = connection.createStatement(); // sql query executor
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}