import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
    static Connection con =null;
    static Statement stmt = null;

    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from  product_info");
        System.out.println("Product ID\t Product Name\tQuantity");
        while (rs.next())
        {
            System.out.println(rs.getInt("id")+"  \t"+ rs.getString("name")+"  \t"+rs.getInt("qty"));
        }
        con.close();
    }
}
