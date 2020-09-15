
package javaframes;

import java.util.*;

public class Student extends User
{
    private int numOfCourses;
    private double CGPA;
    private Batch batch;
    private ArrayList<Course> courses;
    private int currentCreditHrs;

    Student()
    {
        numOfCourses=0;
        CGPA=0.0;
        currentCreditHrs=0;
        batch=null;
        courses=null;
    }
    Student(int noc,double gpa,Batch b,ArrayList<Course> c,int cch)
    {
        numOfCourses=noc;
        CGPA=gpa;
        currentCreditHrs=cch;
        batch=b;
        courses=new ArrayList<Course>(c);
    }
    
    public int getNumOfCourses() {
        return numOfCourses;
    }

    
    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

   
    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    
    public int getCurrentCreditHrs() {
        return currentCreditHrs;
    }

    public void setCurrentCreditHrs(int currentCreditHrs) {
        this.currentCreditHrs = currentCreditHrs;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setCourses(Course c) {
        courses.add(c);
    }
    
    public Batch getBatch()
    {
        return batch;
    }
    public void setBatch(Batch b)
    {
        batch=b;
    }
    
    
}

