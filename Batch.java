
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Batch 
{
    private String batchID;
    private int year;
    private String discipline;
    
    Connection sectionCon;
    Statement sectionStmt;
    Batch()
    {
        batchID="";
        year=0;
        discipline="";
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
    public void setBatchDetailsUsingDatabase(String bID)
    {
        try{
          
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.sectionStmt = (Statement) this.sectionCon.createStatement(); 

            try{
             
                String query = "select * from Batch where batchID = ?";
                
                PreparedStatement preparedStmt = this.sectionCon.prepareStatement(query);
                preparedStmt.setString(1, bID);
                ResultSet rs = preparedStmt.executeQuery();
                rs.next(); 
                this.batchID=bID;
                this.discipline=rs.getString(3);
                this.year=rs.getInt(2);
                
                
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void printBatch()
    {
        System.out.println("BatchID: "+batchID+"\nYear:"+year+"\nDiscipline: "+discipline);
    }
    
    Batch(String bid, int y, String dis)
    {
        batchID=bid;
        year=y;
        discipline=dis;
    }
    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDiscipline() {
        return discipline;
    }

    
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
    
    
}

