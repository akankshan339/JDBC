import java.sql.*;
public class JdbcEmployee {
    Connection con =null;
    Statement stmt = null;
    JdbcEmployee()throws ClassNotFoundException , SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root" ,"");
        stmt = con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from emp");
        System.out.println("Username \t age \t gender \t salary");
        while(rs.next())
        {
            System.out.println(rs.getString("Username") +"\t" +rs.getInt("age") +"\t"+rs.getString("gender")+"\t"+rs.getInt("salary"));
        }
        con.close();
    }
    public static void main(String[] args)throws ClassNotFoundException , SQLException
     {
        new JdbcEmployee();
    }
}
