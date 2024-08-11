import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.io.*;

public class Entry2 {
    

    public static void main(String[] args) throws ClassNotFoundException,SQLException,IOException{
        //InputStreamReader raed = new InputStreamReader(System.in)
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into product_info values(?,?,?)");

            int id,qty;
            String name;
            System.out.println("Enter id, name and quantity :");
            id = Integer.parseInt(obj.readLine());
            System.out.println();
            name = obj.readLine();
            qty = Integer.parseInt(obj.readLine());
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3,qty);
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