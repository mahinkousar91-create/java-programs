package project1_menu_driven_student_system;

import java.util.Scanner;

public class UseStudent {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        StudentServices serv=new StudentServices();
        int choice;
        int roll;
        String name;
        String course;
        do{
            System.out.println("Select an option");
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student");
            System.out.println("3.View All Students");
            System.out.println("4.Search Student");
            System.out.println("5.Enroll Course");
            System.out.println("6.Drop Course");
            System.out.println("7.View Student Courses");
            System.out.println("8.Exit");
            System.out.println("Enter choice:");
            choice=kb.nextInt();
            switch(choice) {
                case 1 -> {
                    System.out.println("Enter roll");
                    roll = kb.nextInt();
                    System.out.println("Enter name");
                    kb.nextLine();
                    name = kb.nextLine();
                    serv.addStudent(roll, name);

                }
                case 2 -> {
                    System.out.println("Enter roll to be removed");
                    roll = kb.nextInt();
                    serv.removeStudent(roll);
                }
                case 3 -> {
                    serv.viewAllStudents();
                }
                case 4 -> {
                    System.out.println("Enter roll to be searched");
                    roll = kb.nextInt();
                    serv.searchStudentById(roll);
                }
                case 5 -> {
                    System.out.println("Enter roll for enrollment");
                    roll = kb.nextInt();
                    System.out.println("Enter course name to be enrolled in");
                    kb.nextLine();
                    course = kb.nextLine();
                    serv.enrollStudentInCourse(roll, course);
                }
                case 6 -> {
                    System.out.println("Enter roll for removing");
                    roll = kb.nextInt();
                    System.out.println("Enter course name to be dropped");
                    kb.nextLine();
                    course = kb.nextLine();
                    serv.dropCourse(roll, course);
                }
                case 7 -> {
                    System.out.println("Enter roll for displaying courses");
                    roll = kb.nextInt();
                    serv.getCourses(roll);
                }
                case 8 -> {
                    System.out.println("Thank you!");
                }
                default -> {
                    System.out.println("Wrong choice! Try Again");
                }
            }
        }while(choice!=8);

    }
}

