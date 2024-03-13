package com.careerit.jfs.collections;

import java.util.List;

public class AssignmentQuestionEmployeeDetails {


    public static void main(String[] args) {

            String data = "1001-Krish-Developer-50000,1002-Manoj-Tester-40000,1003-John-Developer-60000,1004-Smith-Tester-45000,1005-Krish-Developer-50000";
            EmployeeDetailsService service = new EmployeeDetailsService(data);
            double totalSalary = service.totalSalary();
            double maxSalary = service.maxSalary();
            List<String> employeeNames = service.employeeNames();
            List<Integer> employeeIds =  service.employeeIds();
            List<EmployeeBasicDetails> employeeDetails = service.employeeDetails();

            System.out.println("Total salary : "+totalSalary);
            System.out.println("Max salary : "+maxSalary);
            System.out.println("Employee names : "+employeeNames);
            System.out.println("Employee ids : "+employeeIds);
            System.out.println("Employee details : "+employeeDetails);

    }
}
