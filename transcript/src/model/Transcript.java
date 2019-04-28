package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Transcript {
    private String studentName;
    private int studentID;
    private ArrayList<String> courses;
    private ArrayList<Double>grades;
    public Transcript(String studentName, int studentID){
          this.studentID=studentID;
          this.studentName=studentName;
          courses= new ArrayList<String>();
          grades=new ArrayList<>();
    }
    //getters
    //EFFECTS:returns courses if there.if not there,returns null
    public ArrayList<String> getCourses(){return courses; }
    //EFFECTS:returns grades if there.if not there,returns null
    public ArrayList<Double> getGrades(){return grades; }

    public int getStudentId(){return studentID;}
    public String getStudentName(){return studentName;}
    //REQUIRES:course shouldnot be null,grade is on range 0.4
    //MODIDIES:this
    //EFFECTS:add course with its grade
    public void addGrade(String course, double grade){
        courses.add(course);
        grades.add(grade);
    }

    // This method should return course name and grade in some consistent String format
    //REQUIRES:course must be there
    //EFFECTS:return course name and grade in format"coursename-grade"
    public String getCourseAndGrade(String course){
       return course+"-"+grades.get(courses.indexOf(course));
    }

    //EFFECTS:print transcript in format"studentname,id:coursename-grade,,,,,ext"
    public void printTranscript(){
        String x="";
        for (int i=0;i<grades.size();i++){
            x+=getCourseAndGrade(courses.get(i))+",";

        }
        System.out.println(studentName+","+studentID+":"+x);
    }


    //EFFECTS:returns gpa;
    public double getGPA(){
        double sum=0,x=grades.size();
        for (int i=0;i<x;i++){
            sum+=grades.get(i);
        }
        return sum/x;
    }
}
