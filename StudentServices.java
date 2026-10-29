package project1_menu_driven_student_system;

import java.util.*;

public class StudentServices {
        private List<Student> stList;
        private Map<Integer,Student> stMap;
        public StudentServices(){
            stMap=new HashMap();
            stList=new ArrayList<>();

        }
        public void addStudent(int roll,String name){
            if(stMap.containsKey(roll)){
                System.out.println("Roll no "+roll+" already present");
                return;
            }
            Student s=new Student(roll,name);
            stMap.put(roll,s);
            stList.add(s);
            System.out.println("Student with roll:"+roll+" added successfully");
        }
        public void removeStudent(int roll){
            Student s=stMap.get(roll);
            if(s==null){
                System.out.println("Roll no not found");
                return;
            }
            stMap.remove(roll);
            stList.remove(s);
            System.out.println("Student with roll:"+roll+" removed successfully");
        }
        public void viewAllStudents(){
            if(stMap.isEmpty()){
                System.out.println("No records found!");
                return;
            }
            System.out.println("displaying...");
            for(Student s:stList){
                System.out.println(s);
            }
        }
        public void searchStudentById(int roll){
            Student s=stMap.get(roll);
            if(s==null){
                System.out.println("Roll no not found");
                return;
            }
            System.out.println(s);
        }
        public void enrollStudentInCourse(int roll,String course){
            Student s=stMap.get(roll);
            if(s==null){
                System.out.println("Roll no not found");
                return;
            }
            if(s.enrollCourse(course)){
                System.out.println("Student "+roll+" successfully enrolled in course:"+course);
            }else{
                System.out.println("Student "+roll+" already enrolled in course:"+course);
            }
        }
        public void dropCourse(int roll,String course){
            Student s=stMap.get(roll);
            if(s==null){
                System.out.println("Roll no not found");
                return;
            }
            if(s.removeCourse(course)){
                System.out.println("Course:"+course+" successfully removed from student:"+roll);
            }else{
                System.out.println("Student "+roll+" not enrolled in course:"+course);
            }
        }
        public void getCourses(int roll){
            Student s=stMap.get(roll);
            if(s==null){
                System.out.println("Roll no not found");
                return;
            }
            Set<String> courseNames=s.getCourseNames();
            if(courseNames.isEmpty()){
                System.out.println("Student :"+roll+" not enrolled in any course yet!");
            }else{
                System.out.println(courseNames);
            }

        }
    }


