package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args) {
        int count = 0, i= 1;
        boolean unique = true;

        Scanner sc = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();

        System.out.println("Enter the number of students: ");
        int totalStudents = sc.nextInt();
        sc.nextLine();

        while (count < totalStudents)
        {
            Student student1 = new Student();

            System.out.println("User:" + i);
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            student1.setName(name);

            System.out.println("Please enter your Student ID: ");
            String studentID = sc.nextLine();
            student1.setStudentID(studentID);

            System.out.println("Please enter your email: ");
            String email = sc.nextLine().trim();

            for(Student s: studentsList) {

                while (email.trim().equalsIgnoreCase(s.getEmail())) {
                    System.out.println("Email already exists!");
                    System.out.println("Please Re-Enter your email: ");
                    email = sc.nextLine().trim();
                }
            }

            student1.setEmail(email);

            studentsList.add(student1);
            count++;
            i++;

        }
        //populate the students
        for (Student student : studentsList)
        {
            System.out.println(student);
        }
    }
}

