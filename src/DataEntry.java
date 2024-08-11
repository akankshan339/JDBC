import java.sql.*;


public class DataEntry {
    

    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
            PreparedStatement stmt = con.prepareStatement("insert into product_info values(?,?,?)");
            stmt.setInt(1, 12);
            stmt.setString(2, "nirma");
            stmt.setInt(3,34);
            int i= stmt.executeUpdate();
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
 // int id,qty;
            // String name;
            // System.out.println("Enter id, name and quantity :");
            // id = Integer.parseInt(obj.readLine());
            // System.out.println();
            // name = obj.readLine();
            // qty = Integer.parseInt(obj.readLine());
            // stmt.setInt(1, id);
            // stmt.setString(2, name);
            // stmt.setInt(3,qty);
            // stmt = con.prepareStatement("insert into product_info values (36,'jasmine',89),(56,'rose',90)");
            // int i= stmt.executeUpdate();
