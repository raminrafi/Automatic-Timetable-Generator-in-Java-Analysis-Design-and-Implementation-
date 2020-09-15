
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Department 
{
    private String name;
    private String departmentID;
    private ArrayList<String> coursesOffered;
    Connection sectionCon;
    Statement sectionStmt;

    Department(String n,String dID,int Cofferedsize, ArrayList<String> c)
    {
        name=n;
        departmentID=dID;
        coursesOffered=c;
    }
    Department()
    {
        name="";
        departmentID="";
        coursesOffered=new ArrayList<String>();
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
    public void setDepartmentDetailsUsingDatabase(String deptID){
        try{

            String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
            this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
            this.sectionStmt = (Statement) this.sectionCon.createStatement(); 
            try{
                String query = "select * from Department where departmentID = ?";

                PreparedStatement preparedStmt = this.sectionCon.prepareStatement(query);
                preparedStmt.setString(1, deptID);
                ResultSet rs = preparedStmt.executeQuery();

                rs.next();

                this.departmentID=rs.getString(1);
                this.name=rs.getString(2);

                String query2 = "select courseID from Course where departmentID = ?";

                PreparedStatement pmt = this.sectionCon.prepareStatement(query2);
                pmt.setString(1, deptID);
                ResultSet rs2 = pmt.executeQuery();
                while(rs2.next())
                {
                    this.coursesOffered.add(rs2.getString(1));
                } 
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
    Department(Department d)
    {

        this.name=d.name;
        this.departmentID=d.departmentID;
        this.coursesOffered=d.coursesOffered;
    }
    //getters
    public String getname()
    {
        return name;
    }
    public String getdepartmentID()
    {
        return departmentID;
    }
    public ArrayList<String> getCoursesOffered()
    {
         return coursesOffered;
    }
    //setters
    public void setname(String n)
    {
        name=n;
    }
    public void setdepartmentID(String departID)
    {
        departmentID=departID;
    }
    public void setCourseOffered(String c)
    {
        coursesOffered.add(c);
    }
}

