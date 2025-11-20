package exam;
import java.sql.*;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final String DB = "jdbc:mysql://localhost:3306/students";
        final String USER = "anand";
        final String PWD = "1234";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB, USER, PWD);

            if (con != null) {
                System.out.println("Connection established successfully!");
            }

            String sql = "CREATE TABLE IF NOT EXISTS ClassA ("
                    + "rollno INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "sub1 INT, "
                    + "sub2 INT, "
                    + "sub3 INT)";

            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table created successfully!");

            String sql2 = "INSERT INTO ClassA (rollno, name, sub1, sub2, sub3) VALUES "
                    + "(2, 'Anita', 90, 88, 84),"
                    + "(3, 'Karan', 75, 80, 70),"
                    + "(4, 'Meera', 95, 89, 93),"
                    + "(5, 'Vikram', 60, 72, 68)";

            ps = con.prepareStatement(sql2);
            ps.executeUpdate();
            System.out.println("Data inserted successfully!");

            String sql3 = "SELECT rollno, name, sub1, sub2, sub3, "
                    + "(sub1 + sub2 + sub3) AS total "
                    + "FROM ClassA "
                    + "ORDER BY total DESC "
                    + "LIMIT 1";

            ps = con.prepareStatement(sql3);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Topper: " + rs.getString("name"));
                System.out.println("Total Marks: " + rs.getInt("total"));
            } else {
                System.out.println("No records found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
