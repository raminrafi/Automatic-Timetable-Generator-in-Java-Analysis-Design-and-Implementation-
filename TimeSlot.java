
package javaframes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TimeSlot {
    private String startTime;
    private String day;
    private String venueID;
    private float duration;
    private String endTime;
    Connection timeSlotCon;
    Statement timeSlotStmt;
    
    public TimeSlot()
    {
        try{
          
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.timeSlotCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.timeSlotStmt = (Statement) this.timeSlotCon.createStatement(); 

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void setTimeSlotDetailsUsingDatabase(String venue, String day){
        try{  
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.timeSlotCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.timeSlotStmt = (Statement) this.timeSlotCon.createStatement(); 
            try{
                String query = "select * from TimeSlot where Venue = ? and [Day] =?";

                PreparedStatement preparedStmt = this.timeSlotCon.prepareStatement(query);
                preparedStmt.setString(1, venue);
                preparedStmt.setString(2, day);
                ResultSet rs = preparedStmt.executeQuery();

                rs.next();

                this.startTime = rs.getString(1);
                this.endTime = rs.getString(2);
                this.day = rs.getString(3);
                this.duration=rs.getFloat(4);
                this.venueID=rs.getString(5);
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
    
    
    public TimeSlot(String st, String day, String venueID, float duration, String et)
    {
        this.startTime=st;
        this.day=day;
        this.venueID=venueID;
        this.duration=duration;
        this.endTime=et;
    }
    
    public TimeSlot(TimeSlot time)
    {
        startTime=time.startTime;
        day=time.day;
        venueID=time.venueID;
        duration=time.duration;
        endTime=time.endTime;
    }
    
   
    public String getStartTime()
    {
        return startTime;
    }
    
    public String getDay()
    {
        return day;
    }
    public String getVenueID()
    {
        return venueID;
    }
    public float getDuration()
    {
        return duration;
    }
    public String getEndTime()
    {
        return endTime;
    }
    public void setStartTime(String s)
    {
        this.startTime=s;
    }
    public void setEndTime(String e)
    {
        this.endTime=e;
    }
    public void setDay(String d)
    {
        this.day=d;
    }
    public void setVenueID(String v)
    {
        this.venueID=v;
    }
    public void setDuration(float d)
    {
        this.duration=d;
    }
}

