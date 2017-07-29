package school.mgmnt.system;

/**
 * Created by BIC on 7/22/2017.
 */
public class Teachers {


    private int id;
    private String name;
    private int salary;

    public Teachers(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
