package ie.atu;

public class Student {
    private String name;
    private String email;
    private String studentID;

    //default constuctor
    public Student()
    {
        System.out.println();
        this.name = "";
        this.email = "";
        this.studentID = "";
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getStudentID() {return studentID;}

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

