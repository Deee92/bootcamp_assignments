/**
 * Question 4: Create an Employee Class with instance variables
 * (String) employeeName, (Integer) employeeAge, (String) employeeCity and get the
 * instance of the Class using constructor reference
 */

@FunctionalInterface
interface EmployeeReference {
    Employee makeEmployee(String empName, int empAge, String empCity);
}

public class Employee {
    String employeeName;
    int employeeAge;
    String employeeCity;
    
    Employee(String employeeName, int employeeAge, String employeeCity) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeCity = employeeCity;
    }
    
    void getEmployee() {
        System.out.println(this.employeeName + " is " + this.employeeAge + " and is based out of " + this.employeeCity + ".");
    }
    
    public static void main(String[] args) {
        EmployeeReference employeeReference = Employee::new;
        Employee employee = employeeReference.makeEmployee("John Doe", 43, "New York");
        employee.getEmployee();
    }
}
