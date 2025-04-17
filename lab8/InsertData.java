import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertData {
 public static void main(String[] args) {
 // JDBC URL, username, and password of MySQL server
 String url = "jdbc:mysql://localhost:3307/pooja"; // replace 'mydatabase' with your database 
name
 String user = "root";
 String password = "root"; // replace 'your_password' with your MySQL password
 // SQL query to insert data into the table
 String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
 try (Connection conn = DriverManager.getConnection(url, user, password);
 PreparedStatement pstmt = conn.prepareStatement(sql)) {
 // Set the parameters
 pstmt.setString(1, "ram");
 pstmt.setString(2, "ram7@gmail.com");
 // Execute the SQL query
 int rowsAffected = pstmt.executeUpdate();
 System.out.println(rowsAffected + " row(s) inserted.");
 } catch (SQLException e) {
e.printStackTrace();
 }
 }
}