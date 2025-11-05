package ie.atu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args) {
        int count = 0;
        int i = 1;

        //create scanner
        Scanner sc = new Scanner(System.in);
        //create arraylist
        List<Student> studentsList = new ArrayList<Student>();

        //prompt for file name
        System.out.println("Enter file name to save the student list: (e.g. st.txt)");
        String fileName = sc.nextLine().trim();

        System.out.println("Enter the number of students: ");
        int totalStudents = sc.nextInt();
        sc.nextLine();

        while (count < totalStudents)
        {
            Student student1 = new Student();   //new object of Student

            //prompt for name, studentId, email
            System.out.println("User:" + i);
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            student1.setName(name);

            System.out.println("Please enter your Student ID: ");
            String studentID = sc.nextLine();
            student1.setStudentID(studentID);

            System.out.println("Please enter your email: ");
            String email = sc.nextLine().trim();

            //check for existing email and ask to re-enter email
            for(Student s: studentsList) {  //loop through the array

                while (email.trim().equalsIgnoreCase(s.getEmail())) {
                    System.out.println("Email already exists! \n Please Re-Enter your email:");
                    email = sc.nextLine().trim();
                }
            }
            //when exit the loop save the email
            student1.setEmail(email);

            //save all the information of student1
            studentsList.add(student1);

            //create file and write information to it
            try(PrintWriter pw = new PrintWriter(new FileWriter(fileName, true)))
            {
                pw.println(student1.toString());
                System.out.println("Student #" + i + ". Saved in: " + fileName);
            }
            catch(IOException ex)
            {
                System.out.print("Couldn't write," + ex.getMessage());
            }

            count++;
            i++;
        }

        //Read Students list from the File
        //showFile();


        //populate the students
        for (Student student : studentsList)
        {
            System.out.println(student);
        }

    }

}

