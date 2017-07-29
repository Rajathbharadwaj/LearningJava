package school.mgmnt.system;

import java.util.List;

/**
 * Created by BIC on 7/22/2017.
 */
public class School {


    private List<Teachers> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;


    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned =0;
        totalMoneySpent =0;
    }


    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        teachers.add(teachers);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        students.add(Student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
