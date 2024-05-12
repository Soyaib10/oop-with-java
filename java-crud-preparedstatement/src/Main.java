import java.sql.*;

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

            // insert
//            String insert = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
//            // Statement statement = connection.createStatement();
//            PreparedStatement preparedStatement = connection.prepareStatement(insert);
//            preparedStatement.setString(1, "Zihad");
//            preparedStatement.setInt(2, 22);
//            preparedStatement.setDouble(3, 100.0);
//
//            int rowsAffected = preparedStatement.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data inserted Successfully!");
//            } else {
//                System.out.println("Data not Inserted!");
//            }

            // display data
//            String query = "SELECT marks FROM students WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, 1);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                System.out.println("Marks: " + resultSet.getDouble("marks"));
//            } else {
//                System.out.println("Marks not found!");
//            }

            // update
//            String update = "UPDATE students SET marks = ? WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(update);
//            preparedStatement.setDouble(1, 99.99);
//            preparedStatement.setInt(2, 3);
//            int rowsAffected = preparedStatement.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data Updated successfully!");
//            } else {
//                System.out.println("Data not updated!");
//            }

            // delete
            String delete = "DELETE FROM students WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, 3);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Deleted successfully!");
            } else {
                System.out.println("Data not Deleted!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}