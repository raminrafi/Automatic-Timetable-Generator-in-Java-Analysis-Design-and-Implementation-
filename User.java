
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class User {
    protected String firstname;
    protected String lastname;
    protected String department;
    protected String email;
    protected String phoneNum;
    protected String userID;
    protected String password;
    int role;
    
    Connection sectionCon;
    Statement sectionStmt;
    User()
    {
        firstname="";
        lastname="";
        department="";
        email="";
        phoneNum="";
        userID="";
        password="";
        role=0;
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
    User(String fn, String ln, String d, String e, String pn, String u, String p,int role)
    {
        firstname=fn;
        lastname=ln;
        department=d;
        email=e;
        phoneNum=pn;
        userID=u;
        password=p;
        role=0;
        try{
          
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.sectionStmt = (Statement) this.sectionCon.createStatement(); 

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public void setUserDetailsUsingDatabase(String userid)
    {
        try{
        String query= "select * from [User] where userID = ?";
        PreparedStatement p=this.sectionCon.prepareStatement(query);
        p.setString(1,userid);
        ResultSet rs3=p.executeQuery();
        rs3.next();
        this.firstname=rs3.getString(2);
        this.lastname=rs3.getString(3);
        this.email=rs3.getString(5);
        this.department=rs3.getString(4);
        this.password=rs3.getString(6);
        this.phoneNum=rs3.getString(7);
        this.role=rs3.getInt(8);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void printUser()
    {       
      System.out.println("UserID: "+userID+"\nPassword: "+password+"\nFirst name: "+firstname+"\nLast name: "+lastname+"\nDepartment: "+
                department+"\nEmail: "+email+"Phone number: "+phoneNum);
    }
    
    void printUserNameOnly()
    {
        System.out.println(firstname+" "+lastname);
    }
    
    
    String getFirstName()
    {
        return this.firstname;
    }
    String getLastName()
    {
        return this.lastname;
    }
    String getDepartment()
    {
        return this.department;
    }
    String getemail()
    {
        return this.email;
    }
    String getphoneNum()
    {
        return this.phoneNum;
    }
    String getuserID()
    {
        return this.userID;
    }
    String getpassword()
    {
        return this.password;
    }
    void setFirstName(String fn)
    {
        this.firstname=fn;
    }
    void setLastName(String ln)
    {
        this.lastname=ln;
    }
    void setDepartment(String d)
    {
        this.department=d;
    }
     void setemail(String e)
    {
        this.email=e;
    }
    void setphoneNum(String pn)
    {
        this.phoneNum=pn;
    }
    void setuserID(String u)
    {
        this.userID=u;
    }
    void setPassword(String p)
    {
        this.password=p;
    }
    int getRole()
    {
        return role;
    }
    void setRole(int r)
    {
        this.role=r;
    }
    User(User U)
    {
        firstname=U.firstname;
        lastname=U.lastname;
        department=U.department;
        email=U.email;
        phoneNum=U.phoneNum;
        userID=U.userID;
        password=U.password;
        role=U.role;
    }
    boolean signup(String fname, String lname, String email, String password , String dept , String phone,String userID, int role,int login)
    {
        boolean flag = true;
        try{ 
            
            String query = " insert into [User]"
                                + " values (?, ?, ?, ?, ? , ? , ? , ?,? )";
                       
                        // create the mysql insert preparedstatement
                        PreparedStatement preparedStmt = sectionCon.prepareStatement(query);
                        preparedStmt.setString (1, userID);
                        preparedStmt.setString (2,fname);
                        preparedStmt.setString(3, lname);
                        preparedStmt.setString(4,dept);
                        preparedStmt.setString(5,email);
                        preparedStmt.setString(6,password);
                        preparedStmt.setString(7,phone);
                        preparedStmt.setInt(8,role);
                        preparedStmt.setInt(9,login);
                       // execute the preparedstatement
                        boolean x = preparedStmt.execute();

            //int x = preparedStmt.executeUpdate(query);

            if(x==true)
            {
                System.out.println("Cannot create account, User already exists!");
                flag=false;
            }
            else
            {   
                System.out.println("Welcome! Your account is Successfully created!");   
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            flag=false;
        }
        return flag;
    }
    void login(int userid, String pass) 
    {
        boolean flag=false;
        try{
            ResultSet rs;
            rs=sectionStmt.executeQuery("select * from [User]");
            while(rs.next())
            {
                if (rs.getString(1).equals(userid) && rs.getString(6).equals(pass))
                {
                    flag=true;
                }
            }
            if(flag==true)
            {
                System.out.println("Login Successful!");
            }
            else
            {
                System.out.println("Login UnSuccessful, User doesnt exist!");
            }
    }
    catch(Exception e) 
    {
        System.out.print(e);
    }
   }
    void Logout()
    {
        System.out.println("User Successful logout!");
    }
    boolean IsRegistered() 
    {
        int flag=1;
        try
        {
            String query= "select * from [User]";
            PreparedStatement p=this.sectionCon.prepareStatement(query);
            ResultSet rs=p.executeQuery();
            while(rs.next())
            {
                if(rs.getString(1).equals(userID) && rs.getString(6).equals(password))
                {
                    flag=0;
                    break;
                }
            }
        }
        catch(Exception e)
        {
            flag=1;
            System.out.println(e);
        }
        if(flag==0)
        {
            System.out.println("The User is registered!");
            return true;
        }
        else
        {
            System.out.println("The User is not registered!");
            return false;
        }
        
    }
}

