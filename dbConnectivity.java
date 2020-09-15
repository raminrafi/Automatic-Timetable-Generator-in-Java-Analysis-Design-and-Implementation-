
package javaframes;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;  
import java.sql.ResultSet;


public class dbConnectivity {
    Connection con;
    Statement stmt;
    
    dbConnectivity()
    {
        try
        {
            String s = "jdbc:sqlserver://localhost:1433;databaseName=project";
            con = DriverManager.getConnection(s,"ramin_rafi","12569");
            stmt = con.createStatement();
            
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }
}
