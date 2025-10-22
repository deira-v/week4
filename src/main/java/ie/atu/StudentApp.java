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
            Student student1 = new Student();

            System.out.println("Please enter your name: ");
            String name = sc.nextLine();

            System.out.println("Please enter your Student ID: ");
            String studentID = sc.nextLine();
            student1.setName(name);
            student1.setStudentID(studentID);

            System.out.println("Please enter your email: ");
            String email = sc.nextLine();

            for(int i = 0 ; i < totalStudents; i++)
            {
                if(studentsList.get(i).getEmail().equals(email))
                {
                    System.out.println("Email already exists!");
                    continue;
                }
                else {
                    student1.setEmail(email);
                    i = totalStudents;
                }
            }

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

