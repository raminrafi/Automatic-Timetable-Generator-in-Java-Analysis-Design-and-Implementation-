
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Course 
{
    private String courseID;
    private String name;
    private int creditHrs;
    private double timeduration;
    private  String prereq;
    private  ArrayList<Instructor> Instructor;
    int Section;
    
    //private ArrayList<Section> Section;

    Connection sectionCon;
    Statement sectionStmt;
    Course(String cousid,String n,int cH,double tD,String preq,ArrayList<Instructor> i, int s)
    {
        courseID=cousid;
        name=n;
        creditHrs=cH;
        timeduration=tD;
        prereq=preq;
        ArrayList <Instructor> Instructor = i;
        Section=s;
    }
    Course()
    {
        courseID="";
        name="";
        creditHrs=0;
        timeduration=0;
        prereq="";
        ArrayList <Instructor> Instructor = new ArrayList <Instructor>();
        Section=0;
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

     public void setCourseDetailsUsingDatabase(String id, String name)
     {
          try{ 
                Connection con;
                Statement stmt;
                String connection = "jdbc:sqlserver://localhost:1433;databaseName=project"; //check
                con= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
                stmt = (Statement) con.createStatement(); 
                try{
                    String query = "select * from Course where courseID = ? and name =?";

                    PreparedStatement preparedStmt = this.sectionCon.prepareStatement(query);
                    preparedStmt.setString(1, id);
                    preparedStmt.setString(2, name);

                    ResultSet rs = preparedStmt.executeQuery();

                    rs.next();
                    this.courseID=rs.getString(1);
                    this.name=rs.getString(2);
                    this.creditHrs=rs.getInt(3);
                    this.timeduration=rs.getFloat(4);
                    this.prereq=rs.getString(5);
                    int count=1;
                    String query2="Select * from Section where courseID = ?";
                    PreparedStatement preparedStmt2 = this.sectionCon.prepareStatement(query2);
                    preparedStmt2.setString(1, id);
                    ResultSet rs2=preparedStmt2.executeQuery();
                    while(rs2.next())
                    {
                        count++;
                    }
                    this.Section=count;   
                    Instructor i=new Instructor();
                    i.setInstructorDetailsUsingDatabase(rs.getString(6));
                    i.setCourse(id);
                    this.Instructor.add(i);
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

    Course(Course C)
    {
        this.courseID=C.courseID;
        this.name=C.name;
        this.creditHrs=C.creditHrs;
        this.timeduration=C.timeduration;
        this.prereq=C.prereq;
        this.Instructor=this.Instructor;
        this.Section=this.Section;

    }
    
    void printCourse()
    {
        System.out.println("CourseID: "+courseID+"\nName: "+name+"\nCredit Hours: "+creditHrs+"\nTime Duration: "+
                timeduration+"\nPre-requisite: "+prereq+"\nTaught by: ");
        
        for(int i=0;i<Instructor.size();i++)
            Instructor.get(i).printInstructorName();
        
        System.out.println("\nNo. of sections: "+Section);

    }
    //getters
    public String getcourseID()
    {
        return courseID;
    }
    public String getCoursename()
    {
        return name;
    }
    public int getcreditHrs()
    {
        return creditHrs;
    }
    public  double getDuration()
    {
        return timeduration;
    }
    public Instructor getInstructor(int i)
    {
        return Instructor.get(i);
    }
    public String getPrereq()
    {
        return prereq;
    }
    //setters
    public void setcourseID(String id)
    {
        courseID=id;
    }
    public void setCoursename(String n)
    {
        name=n;
    }
    public void setcreditHrs(int ch)
    {
        creditHrs=ch;
    }
    public void setDuration(double td)
    {
        timeduration=td;
    }
    public void setPrereq(String preq)
    {
        prereq=preq;
    }
    public void setSection(int s)
    {
        Section=s;
    }
    public void setInstructor(Instructor i)
    {
        Instructor.add(i);
    }
}