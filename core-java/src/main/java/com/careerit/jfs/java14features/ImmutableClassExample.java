package com.careerit.jfs.java14features;

import java.time.LocalDate;
import java.util.Objects;

final class Employee{
    private final String empno;
    private final String name;
    private final String email;
    private final LocalDate doj;

    public Employee(String empno, String name, String email, LocalDate doj) {
        this.empno = empno;
        this.name = name;
        this.email = email;
        this.doj = doj;
    }

    public String getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDoj() {
        return doj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(empno, employee.empno) && Objects.equals(name, employee.name) && Objects.equals(email, employee.email) && Objects.equals(doj, employee.doj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, name, email, doj);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno='" + empno + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", doj=" + doj +
                '}';
    }
}

record EmployeeRecord(String empno, String name, String email, LocalDate doj) {

       public EmployeeRecord {
            Objects.requireNonNull(empno);
            Objects.requireNonNull(name);
            Objects.requireNonNull(email);
            Objects.requireNonNull(doj);
        }

        public EmployeeRecord(String empno, String name, String email) {
            this(empno, name, email,null);
        }

}
public class ImmutableClassExample {

    public static void main(String[] args) {

        Employee emp1 = new Employee("E1001", "Krish", "krish@gmail.com", LocalDate.of(1988,8,5));
        Employee emp2 = new Employee("E1002", "Rajesh", "rajesh@gmail.com", LocalDate.of(1990, 10, 10));

        EmployeeRecord emp3 = new EmployeeRecord("E1003", "Manoj", "manoj@gmail.com", LocalDate.of(1992, 12, 12));

        System.out.println(emp3);

    }
}
