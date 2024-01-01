
import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", "");
            Statement stmt = conn.createStatement();
            System.out.println("Connection Successful");
            String query="Create table reg (id int(20),name varchar(25), address varchar(30))";
            stmt.executeUpdate(query);
            System.out.println("Table Created Sucessfully");
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }
}
