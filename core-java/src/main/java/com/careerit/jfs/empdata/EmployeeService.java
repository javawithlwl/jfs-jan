package com.careerit.jfs.empdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {


    private List<Currency> currencies;
    private List<Employee> employees;

    private Map<String, Currency> currencyMap;

    public EmployeeService() {
        JsonReaderUtil jsonReaderUtil = new JsonReaderUtil();
        currencies = jsonReaderUtil.loadCurrencies();
        employees = jsonReaderUtil.loadEmployees();
        currencyMap = currencies.stream().collect(Collectors.toMap(Currency::getCode, c -> c));
    }

    public void createFormattedEmployeeData() {
        List<EmployeeFormattedData> empList = new ArrayList<>();
        for (Employee emp : employees) {
            EmployeeFormattedData empData = new EmployeeFormattedData();
            empData.setId(emp.getId());
            empData.setFullName(emp.getFirstName() + " " + emp.getLastName());
            empData.setEmail(emp.getEmail());
            empData.setSalary(emp.getSalary());
            Currency currency = currencyMap.get(emp.getCurrency());
            if (currency != null) {
                empData.setCurrencyName(currency.getName());
                String formattedSalary = getFormattedSalary(emp.getSalary(), currency);
                empData.setFormattedSalary(formattedSalary);
            } else {
                System.out.println("Currency not found for code : " + emp.getCurrency());
            }
            empList.add(empData);
        }
        writeFormattedData(empList);
    }

    private void writeFormattedData(List<EmployeeFormattedData> empList) {
        // Write the data to a file
        try {
            File file = new File("formatted_employees.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(file, empList);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    private String getFormattedSalary(double salary, Currency currency) {
        String currencySymbol = currency.getSymbol();
        int decimalDigits = currency.getDecimalDigits();
        return String.format("%s %." + decimalDigits + "f", currencySymbol, salary);
    }


}
