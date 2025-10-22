package ie.atu;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private String email;
    private String studentID;

    //default constructor
    public Student()
    {
        System.out.println();
        this.name = "";
        this.email = "";
        this.studentID = "";
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getStudentID() {return studentID;}

    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setStudentID(String studentID) {this.studentID = studentID;}


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}

