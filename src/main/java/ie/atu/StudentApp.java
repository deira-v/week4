package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();

        System.out.println("Enter the number of students: ");
        int totalStudents = sc.nextInt();
        sc.nextLine();

        while (count < totalStudents)
        {
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
/*
            for (int i = 1; i <= totalStudents; i++)
            {
                for (int j = i+1; j <= totalStudents; j++)
                {
                    if(studentsList.get(i).equals(studentsList.get(j)))
                    {
                        System.out.println("Email already in use.");
                    }
                }
            }
*/
            System.out.println("Please enter your email: ");
            String email = sc.nextLine();
            System.out.println("Please enter your Student ID: ");
            String studentID = sc.nextLine();
            Student student1 = new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentID(studentID);
            studentsList.add(student1);
            count++;

        }
        //populate the students
        for (Student student : studentsList)
        {
            System.out.println(student);
        }
    }
}

