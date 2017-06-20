package example.codeclan.com.homeworkfixed;

/**
 * Created by user on 20/06/2017.
 */

public class Manager extends Employee {

    private String deptName;


    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }



}