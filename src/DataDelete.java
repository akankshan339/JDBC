import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.io.*;

public class DataDelete{
    

    public static void main(String[] args) throws ClassNotFoundException,SQLException,IOException{
        //InputStreamReader raed = new InputStreamReader(System.in)
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
           
            PreparedStatement stmt = con.prepareStatement("delete from product_info where id=123");
            int i= stmt.executeUpdate();
            System.out.println("No of rows affected : "+i);
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    
    }
}