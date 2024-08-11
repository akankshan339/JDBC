 import java.sql.*;
 class demo2 {
    Connection con =null;
    Statement stmt = null;
    demo2()throws ClassNotFoundException , SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root" ,"");
        stmt = con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from `hello world`");
        //System.out.println("Username \t age \t gender \t salary");
        while(rs.next())
        {
            System.out.println(rs.getInt("id") +"\t" +rs.getInt("name"));
        }
        con.close();
    }
    public static void main(String[] args)throws ClassNotFoundException , SQLException
     {
        new demo2();
    }
}

