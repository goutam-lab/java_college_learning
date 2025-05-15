//normal example of jdbc 

// //import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

// public class JdbcExample {
//     public static void main(String[] args) {
//         try {
//             // Load the JDBC driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establish a connection
//             String url = "jdbc:mysql://localhost:3306/mydatabase";
//             String username = "root";
//             String password = "password";
//             Connection connection = DriverManager.getConnection(url, username, password);

//             // Create a statement
//             Statement statement = connection.createStatement();

//             // Execute a query
//             String query = "SELECT * FROM users";
//             ResultSet resultSet = statement.executeQuery(query);

//             // Process the results
//             while (resultSet.next()) {
//                 int id = resultSet.getInt("id");
//                 String name = resultSet.getString("name");
//                 System.out.println("ID: " + id + ", Name: " + name);
//             }

//             // Close the connection
//             resultSet.close();
//             statement.close();
//             connection.close();
//         } catch (Exception e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }



// Using PreparedStatement
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;

// public class PreparedStatementExample {
//     public static void main(String[] args) {
//         try {
//             // Load the JDBC driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establish a connection
//             String url = "jdbc:mysql://localhost:3306/mydatabase";
//             String username = "root";
//             String password = "password";
//             Connection connection = DriverManager.getConnection(url, username, password);

//             // Create a prepared statement
//             String query = "SELECT * FROM users WHERE id = ?";
//             PreparedStatement preparedStatement = connection.prepareStatement(query);
//             preparedStatement.setInt(1, 1); // Set the parameter

//             // Execute the query
//             ResultSet resultSet = preparedStatement.executeQuery();

//             // Process the results
//             while (resultSet.next()) {
//                 int id = resultSet.getInt("id");
//                 String name = resultSet.getString("name");
//                 System.out.println("ID: " + id + ", Name: " + name);
//             }

//             // Close the connection
//             resultSet.close();
//             preparedStatement.close();
//             connection.close();
//         } catch (Exception e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }



// Using try-with-resources

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

// public class TryWithResourcesExample {
//     public static void main(String[] args) {
//         try {
//             // Load the JDBC driver
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establish a connection
//             String url = "jdbc:mysql://localhost:3306/mydatabase";
//             String username = "root";
//             String password = "password";

//             try (Connection connection = DriverManager.getConnection(url, username, password);
//                  Statement statement = connection.createStatement();
//                  ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {

//                 // Process the results
//                 while (resultSet.next()) {
//                     int id = resultSet.getInt("id");
//                     String name = resultSet.getString("name");
//                     System.out.println("ID: " + id + ", Name: " + name);
//                 }
//             }
//         } catch (Exception e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }


// inserting data 
// String query = "INSERT INTO users (name, email) VALUES (?, ?)";
// PreparedStatement preparedStatement = connection.prepareStatement(query);
// preparedStatement.setString(1, "Alice");
// preparedStatement.setString(2, "alice@example.com");
// preparedStatement.executeUpdate();



//updating 
// String query = "UPDATE users SET name = ? WHERE id = ?";
// PreparedStatement preparedStatement = connection.prepareStatement(query);
// preparedStatement.setString(1, "Alice Smith");
// preparedStatement.setInt(2, 1);
// preparedStatement.executeUpdate();


//deleting
// String query = "DELETE FROM users WHERE id = ?";
// PreparedStatement preparedStatement = connection.prepareStatement(query);
// preparedStatement.setInt(1, 1);
// preparedStatement.executeUpdate();

