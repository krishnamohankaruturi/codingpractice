package sample;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHigeshtSalary {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1, "ram", 2000, LocalTime.of(9, 0)),
                new Employee(2, "krishna", 5000,LocalTime.of(9, 0)),
                new Employee(2, "priya", 5000,LocalTime.of(8, 0)),
                new Employee(3, "varun", 1000,LocalTime.of(5, 0)),
                new Employee(4, "john", 6000,LocalTime.of(2, 0)),
                new Employee(5, "venkat", 4000,LocalTime.of(1, 0)));
        /*String string = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getEname).reversed())
                .map(x -> x.getEname()).skip(1).findFirst().get();
        System.out.println(string);
*/

        /*List<Employee> collect = list.stream()
                .sorted(Comparator.comparing(Employee::getCreationTime)).skip(3).collect(Collectors.toList());
        System.out.println(collect);*/

        List<Employee> collect1 = list.stream().sorted(Comparator.comparing(Employee::getCreationTime).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
