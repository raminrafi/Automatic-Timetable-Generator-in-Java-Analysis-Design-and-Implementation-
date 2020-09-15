
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Instructor extends User {
    private int numOfCourses;
    private ArrayList <String>course ;
    private MessagingThread thread;
    
    Connection sectionCon;
    Statement sectionStmt;
    
    Instructor()
    {
        numOfCourses=0;
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
     public void setInstructorDetailsUsingDatabase(String instructorID)
     {
        try{

            String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
            this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
            this.sectionStmt = (Statement) this.sectionCon.createStatement();     
            try{
               //String namee=this.firstname+" "+this.lastname;
               String query1 = "select * from Instructor where instructorID = ?";
               PreparedStatement pmt = this.sectionCon.prepareStatement(query1);
               pmt.setString(1, instructorID);
               ResultSet rs1 = pmt.executeQuery();
               rs1.next();
               this.numOfCourses=rs1.getInt(2);
               this.userID=instructorID;
               //System.out.println("userID = "+this.userID);
               this.setUserDetailsUsingDatabase(this.userID);
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

    void printInstructor()
    {
        super.printUser();
        System.out.println("");
    }
    
    void printInstructorName()
    {
        super.printUserNameOnly();
       
    }
    
    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public ArrayList<String> getCoursesList() {
        return course;
    }
    
    public void setCourse(String c)
    {
        this.course.add(c);
    }

    public MessagingThread getThread() {
        return thread;
    }

    public void setThread(MessagingThread thread) {
        this.thread = thread;
    }
}

