/**
 * Question 4: Write a program to sort Employee objects based on highest salary
 * using Comparator
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String employeeName;
    double employeeAge;
    double employeeSalary;
    
    
    public Employee(String employeeName, double employeeAge, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return -(int) (e1.employeeSalary - e2.employeeSalary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 43.2, 8500.8));
        employeeList.add(new Employee("Paul", 42.5, 8490.8));
        employeeList.add(new Employee("George", 41.5, 8450.8));
        employeeList.add(new Employee("Ringo", 44.1, 8460.8));
        Collections.sort(employeeList, new SalaryComparator());
        
        for (Employee e : employeeList) {
            System.out.println(e.employeeName + " is " + e.employeeAge + " and earns " + e.employeeSalary);
        }
    }
}
