package sample;

import java.time.LocalTime;

public class Employee {
    int eid;
    String ename;
    int salary;
    LocalTime creationTime;

    public Employee(int eid, String ename,int salary,LocalTime creationTime){
        this.eid = eid;
        this.ename = ename;
        this.salary= salary;
        this.creationTime = creationTime;
    }

    public LocalTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalTime creationTime) {
        this.creationTime = creationTime;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public  String toString()
    {return eid+"---"+ename+"---"+salary;

    }


}
