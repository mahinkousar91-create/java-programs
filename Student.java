package project1_menu_driven_student_system;
import java.util.Set;
import java.util.TreeSet;

 public class Student {
        private int roll;
        private String name;
        private Set<String> courseNames;

        public Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
            this.courseNames=new TreeSet();
        }
        public boolean enrollCourse(String course){
            return courseNames.add(course);
        }
        public boolean removeCourse(String course){
            return courseNames.remove(course);
        }

        public Set<String> getCourseNames() {
            return courseNames;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "roll=" + roll +
                    ", name='" + name + '\'' +
                    ", courseNames=" + courseNames +
                    '}';
        }
    }


