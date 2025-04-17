import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTable {
 public static void main(String[] args) {
 // JDBC URL, username, and password of MySQL server
 String url = "jdbc:mysql://localhost:3307/pooja"; // replace 'mydatabase' with your database 
name
 String user = "root";
 String password = "root"; // replace 'your_password' with your MySQL password
 // SQL query to create a table
String sql = "CREATE TABLE users (" +
 "id INT AUTO_INCREMENT PRIMARY KEY," +
 "name VARCHAR(255) NOT NULL," +
 "email VARCHAR(255) NOT NULL" +
 ")";
 try (Connection conn = DriverManager.getConnection(url, user, password);
 Statement stmt = conn.createStatement()) {
 // Execute the SQL query
 stmt.executeUpdate(sql);
 System.out.println("Table created successfully.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
}
