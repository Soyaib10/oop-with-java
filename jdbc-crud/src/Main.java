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
            Statement statement = connection.createStatement(); // sql query executor
            // dispaly data
//            String query = "SELECT * FROM students";
//            ResultSet resultSet = statement.executeQuery(query); // holds the table
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//                System.out.println("ID: " + id);
//                System.out.println("Name: " + name);
//                System.out.println("Age: " + age);
//                System.out.println("Marks: " + marks);
//            }

            // insert data
            String insert = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %o, %f)", "Rishan", 23, 110.0);
            int rowsAffected = statement.executeUpdate(insert);
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            }
            else {
                System.out.println("Data not inserted!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}