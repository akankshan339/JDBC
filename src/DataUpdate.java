import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.io.*;

public class DataUpdate{
    

    public static void main(String[] args) throws ClassNotFoundException,SQLException,IOException{
        //InputStreamReader raed = new InputStreamReader(System.in)
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");

            
            PreparedStatement stmt = con.prepareStatement("update product_info set name = ? where id =?");
            stmt.setString(1, "ponds");
            stmt.setInt(2, 123);
        
            stmt = con.prepareStatement("insert into product_info values (36,'jasmine',89),(56,'rose',90)");
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