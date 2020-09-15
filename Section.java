
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Section {
    private int currentSeats;
    private int maxCapacity;
    private String name;
    private String courseID;
    
    Connection sectionCon;
    Statement sectionStmt;
    
    public Section()
    {
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
    
    public void setSectionDetailsUsingDatabase(String name, String course){
        try{
          
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.sectionStmt = (Statement) this.sectionCon.createStatement(); 
            try{
                String query = "select * from Section where name = ? and courseID =?";

                PreparedStatement preparedStmt = this.sectionCon.prepareStatement(query);
                preparedStmt.setString(1, name);
                preparedStmt.setString(2, course);
                ResultSet rs = preparedStmt.executeQuery();

                rs.next();

                this.name = rs.getString(1);
                this.currentSeats = rs.getInt(2);
                this.maxCapacity = rs.getInt(3);
                this.courseID=rs.getString(4);
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
    
    public Section(int currSeats, int max, String name, String c)
    {
        this.currentSeats=currSeats;
        this.maxCapacity=max;
        this.name=name;
        this.courseID=c;
    }
    
    public Section(Section sect)
    {
        currentSeats=sect.currentSeats;
        maxCapacity=sect.maxCapacity;
        name=sect.name;
        courseID=sect.courseID;
    }
    
    public int getCurrentSeats()
    {
        return currentSeats;
    }
    
    public void setCurrentSeats(int curr)
    {
        currentSeats=curr;
    }
    
    public int getMaxCapacity()
    {
        return maxCapacity;
    }
    
    public void setMaxCapacity(int max)
    {
        maxCapacity=max;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name=n;
    }
    
    public String getCourse()
    {
        return courseID;
    }
    
    public void setCourse(String course)
    {
        courseID=course;
    }
}

