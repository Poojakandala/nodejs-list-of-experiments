import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Create_DB {
 public static void main(String[] args) {
 // JDBC URL, username, and password of MySQL server
 String url = "jdbc:mysql://localhost:3307/";
 String user = "root";
 String password = "root"; // replace 'your_password' with your MySQL password // SQL query to create a database
 String sql = "CREATE DATABASE pooja";
 try (Connection conn = DriverManager.getConnection(url, user, password);
 Statement stmt = conn.createStatement()) {
 // Execute the SQL query
 stmt.executeUpdate(sql);
 System.out.println("Database created successfully.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
}