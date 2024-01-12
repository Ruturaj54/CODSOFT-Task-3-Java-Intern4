package bank.management.system;
import java.sql.*;

public class Conn
{
    Connection c;
    Statement s;
    Conn()
    {
        try
        {
            c = DriverManager.getConnection("jdbc:mysql://localhost/bankmanagementsystem","root","Rutu");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
          
               
    }
    
}
