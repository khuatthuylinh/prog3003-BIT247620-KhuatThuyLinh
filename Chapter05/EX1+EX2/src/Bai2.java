import java.sql.*;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/chuong5";
        String user = "root";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID cần xóa: ");
        int id = sc.nextInt();

        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows == 0) {
            System.out.println("Không tìm thấy user để xóa");
        } else {
            System.out.println("Đã xóa");
        }

        ps.close();
        conn.close();
    }
}