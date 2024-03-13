package com.careerit.jfs.day11;

import java.util.List;

public class EmployeeDetailsService {

    public static void main(String[] args) {

            Employee emp1 = new Employee(1001, "Krish", 100000, "Hyderabad");
            Employee emp2 = new Employee(1002, "Manoj", 200000, "Bangalore");
            Employee emp3 = new Employee(1003, "Charan", 300000, "Chennai");
            Employee emp4 = new Employee(1004, "Rajesh", 400000, "Mumbai");
            Employee emp5 = new Employee(1005, "Jayesh", 500000, "Pune");
            List<Employee> empList = List.of(emp1,emp2,emp3,emp4,emp5);
            System.out.println(getHtmlResponse(empList));

    }

    public static String getHtmlResponse(List<Employee> list){

        String styles = """
                <style>
                    table {
                      font-family: arial, sans-serif;
                      border-collapse: collapse;
                      width: 100%;
                    }
                                    
                    td, th {
                      border: 1px solid #dddddd;
                      text-align: left;
                      padding: 8px;
                    }
                                    
                    tr:nth-child(even) {
                      background-color: #dddddd;
                    }
                </style>
                """;
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Employee Details</title>");
        sb.append(styles);
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Employee Details</h1>");
        sb.append("<table border='1'>");
        sb.append("<tr>");
        sb.append("<th>Empno</th>");
        sb.append("<th>Name</th>");
        sb.append("<th>Salary</th>");
        sb.append("<th>Location</th>");
        sb.append("</tr>");
        for(Employee emp:list){
            sb.append("<tr>");
            sb.append("<td>").append(emp.getEmpno()).append("</td>");
            sb.append("<td>").append(emp.getEname()).append("</td>");
            sb.append("<td>").append(emp.getSalary()).append("</td>");
            sb.append("<td>").append(emp.getLocation()).append("</td>");
            sb.append("</tr>");
        }
        sb.append("</table>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
