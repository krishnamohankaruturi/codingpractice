package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(111, "krishna"));
        employees.add(new Employee(222, "varun"));
        employees.add( new Employee(333, "ram"));
        employees.add(new Employee(555, "krishna"));
        employees.add(new Employee(222, "mohan"));
        employees.add(new Employee(222, "anand"));

        Collections.sort(employees,new EmpComparator());
        for(Employee e: employees)
        {
            System.out.println(e);
        }

    }
}
