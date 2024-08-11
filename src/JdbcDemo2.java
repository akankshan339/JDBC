import java.sql.*;

public class JdbcDemo2 {
    Connection con=null;
    Statement stmt = null;
    JdbcDemo2() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","");
        stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from student");
        System.out.println("roll_no \t name \t course \t marks");
        while(rs.next())
        {
            System.out.println(rs.getInt("roll_no") +"\t" + rs.getString("name")+  "\t" + rs.getString("course")+ "\t"+ rs.getInt("marks"));
        }
        con.close();

    }
    public static void main(String args[]) throws ClassNotFoundException ,SQLException
    {
        new JdbcDemo2();
    }
}
