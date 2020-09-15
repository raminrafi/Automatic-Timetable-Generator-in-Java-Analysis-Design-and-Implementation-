
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class AuthenticateUser 
{
    Timetable timet;
    Connection sectionCon;
    Statement sectionStmt;
    AuthenticateUser()
    {
        timet=null;
        try{
          
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.sectionStmt = (Statement) this.sectionCon.createStatement(); 

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    AuthenticateUser(Timetable tt)
    {
        timet=tt;
         try{
          
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.sectionStmt = (Statement) this.sectionCon.createStatement(); 

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    boolean AuthenticateUser(String name, String password)
    {
        
        int flag=1;
        try{
        PreparedStatement p=this.sectionCon.prepareStatement("select * from User");
       
       
        ResultSet rs=p.executeQuery("select * from User");
        
        while(rs.next())
        {
            if(rs.getString(2)== name && rs.getString(3)==password)
            {
                flag=0;
                break;
                
            }
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean AuthenticateUser(String name, String password, String email)
    {
        int flag=1;
        try
        {
            PreparedStatement p=this.sectionCon.prepareStatement("select * from User");
            ResultSet rs1=p.executeQuery("select * from User");


            while(rs1.next())
            {
                if(rs1.getString(2)== name && rs1.getString(3)==password && rs1.getString(4) == email)
                {
                    flag=0;
                    break;

                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * @return the timet
     */
    public Timetable getTimet() {
        return timet;
    }

    /**
     * @param timet the timet to set
     */
    public void setTimet(Timetable timet) {
        this.timet = timet;
    }
}



