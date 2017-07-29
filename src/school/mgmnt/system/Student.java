package school.mgmnt.system;

/**
 * Created by BIC on 7/21/2017.
 */
public class Student {


    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;


    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.totalFees = 15000;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }


    public void updateFeesPaid(int feesPaid) {
        this.feesPaid += feesPaid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }
}
