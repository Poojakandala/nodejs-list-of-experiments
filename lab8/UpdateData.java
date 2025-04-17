import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateData {
 public static void main(String[] args) {
 // JDBC URL, username, and password of MySQL server
 String url = "jdbc:mysql://localhost:3307/mydatabase"; // replace 'mydatabase' with your 
database name
 String user = "root";
 String password = "root"; // replace 'your_password' with your MySQL password
 // SQL query to update data in the table
 String sql = "UPDATE users SET email = ? WHERE name = ?";
 try (Connection conn = DriverManager.getConnection(url, user, password);
 PreparedStatement pstmt = conn.prepareStatement(sql)) {
 // Set the parameters
 pstmt.setString(1, "ram7@gmail.com");
 pstmt.setString(2, "balu");
 // Execute the SQL query
 int rowsAffected = pstmt.executeUpdate();
 System.out.println(rowsAffected + " row(s) updated.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
}