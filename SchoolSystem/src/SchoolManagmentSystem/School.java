package SchoolManagmentSystem;

import java.util.List;

/**
 * Created by Sardor on 28.10.2018.
 */
public class School {

    private List<Teachers> teachers;
    private List<Student> students;
    private static int totalMoneyMade;
    private static int totalMoneyGone;


    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyMade = 0;
        totalMoneyGone = 0;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teachers teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyMade() {
        return totalMoneyMade;
    }

    public static void updateTotalMoneyMade(int MoneyMade) {
        totalMoneyMade += MoneyMade;
    }

    public int getTotalMoneyGone() {
        return totalMoneyGone;
    }


    public static void updateTotalMoneyGone(int MoneyGone) {
        totalMoneyMade -= MoneyGone;
    }
}
