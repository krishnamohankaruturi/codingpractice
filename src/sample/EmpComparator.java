package sample;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int compare = o1.ename.compareTo(o2.ename);
        if(o1.eid == o2.eid)
        {
            return  compare;

        }else if(o1.eid > o2.eid )
        {
            return 1;
        }else {
            return -1;
        }
    }
}
