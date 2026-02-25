import java.sql.*;

public class Bai1 {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/chuong5";
        String user = "root";
        String password = "123456";

        Connection conn = DriverManager.getConnection(url, user, password);

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM users");

        while (rs.next()) {
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String email = rs.getString("email");

            System.out.println(id + " - " + username + " - " + email);
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}
