import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteData {
 public static void main(String[] args) {
 // JDBC URL, username, and password of MySQL server
 String url = "jdbc:mysql://localhost:3307/pooja"; // replace 'mydatabase' with your database 
name
 String user = "root";
 String password = "root"; // replace 'your_password' with your MySQL password
 // SQL query to delete data from the table
 String sql = "DELETE FROM users WHERE name = ?";
 try (Connection conn = DriverManager.getConnection(url, user, password);
 PreparedStatement pstmt = conn.prepareStatement(sql)) {
 // Set the parameter
 pstmt.setString(1, "ram");
 // Execute the SQL query
 int rowsAffected = pstmt.executeUpdate();
 System.out.println(rowsAffected + " row(s) deleted.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
}