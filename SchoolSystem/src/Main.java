import SchoolManagmentSystem.School;
import SchoolManagmentSystem.Student;
import SchoolManagmentSystem.Teachers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sardor on 28.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Teachers teacher1 = new Teachers(1, "Helen", 500);
        Teachers teacher2 = new Teachers(2, "Sarah", 800);
        Teachers teacher3 = new Teachers(3, "Sam", 1000);
        List<Teachers> teachersList = new ArrayList<>();
        teachersList.add(teacher1);
        teachersList.add(teacher2);
        teachersList.add(teacher3);

        Student student1 = new Student(1, "Anna", 6);
        Student student2 = new Student(2, "John", 5);
        Student student3 = new Student(3, "Bob", 7);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School school = new School(teachersList, studentList);

        student1.payFees(5000);
        student2.payFees(5400);
        student3.payFees(7000);
        System.out.println("School has earned $" + school.getTotalMoneyMade());

        System.out.println("--__--__--__--__--__--");

        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("Shool has spent for salary to " + teacher1.getName()
        + " and now it has $" + school.getTotalMoneyMade());

    }
}
