package com.careerit.jfs.collections.sort;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Employee(String name, String dept, double salary) {
}

public class GroupByExample {

    public static void main(String[] args) {

        List<Employee> employees =
                List.of(
                        new Employee("Krish", "HR", 45000),
                        new Employee("Manoj", "HR", 55000),
                        new Employee("Sai", "DEV", 65000),
                        new Employee("Charan", "HR", 75000),
                        new Employee("Ravi", "ADMIN", 35000),
                        new Employee("Kiran", "DEV", 25000),
                        new Employee("Rajesh", "ADMIN", 45000),
                        new Employee("Suresh", "DEV", 55000));

        Map<String, List<Employee>> deptEmpMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept));
        System.out.println(deptEmpMap);

        Map<String, DoubleSummaryStatistics> deptSalaryMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept, Collectors.summarizingDouble(Employee::salary)));

        deptSalaryMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}
