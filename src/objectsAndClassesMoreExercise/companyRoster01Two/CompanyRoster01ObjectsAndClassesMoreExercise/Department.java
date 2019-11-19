package CompanyRoster01ObjectsAndClassesMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Department {
    private List<Employee> employees;
    private List<String> departments;

    List<String> getDepartments() {
        return departments;
    }

    Department() {
        this.employees = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    void addEmployee(Employee employee) {
        this.employees.add(employee);

        String newDepartment = employee.getDepartment();
        if (!this.departments.contains(newDepartment)) { this.departments.add(newDepartment); }
    }

    List<Employee> getEmployeesByDepartment(String departmentName) {
        return this.employees.stream().filter(e -> e.getDepartment().equals(departmentName)).collect(Collectors.toList());
    }

    double getAverageSalary(String departmentName) {
        return getEmployeesByDepartment(departmentName)
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
    }
}
/*Company Roster
Define a class Employee that holds the following information: name, salary, position, department, email and age. The name, salary, position and department are mandatory while the rest are optional.
Your task is to write a program which takes N lines of employees from the console and calculates the department with the highest average salary and prints for each employee in that department his name, salary, email and age – sorted by salary in descending order. If an employee doesn’t have an email – in place of that field you should print “n/a” instead, if he doesn’t have an age – print “-1” instead. The salary should be printed to two decimal places after the seperator.
Hint: you can define a Department class that holds list of employees.
Examples
Input
4
Pesho 120.00 Dev Development pesho@abv.bg 28
Toncho 333.33 Manager Marketing 33
Ivan 840.20 ProjectLeader Development ivan@ivan.com
Gosho 0.20 Freeloader Nowhere 18


Output
Highest Average Salary: Development
Ivan 840.20 ivan@ivan.com -1
Pesho 120.00 pesho@abv.bg 28


input
6
Stanimir 496.37 Temp Coding stancho@yahoo.com
Yovcho 610.13 Manager Sales
Toshko 609.99 Manager Sales toshko@abv.bg 44
Venci 0.02 Director BeerDrinking beer@beer.br 23
Andrei 700.00 Director Coding
Popeye 13.3333 Sailor SpinachGroup popeye@pop.ey



Output
Highest Average Salary: Sales
Yovcho 610.13 n/a -1
Toshko 609.99 toshko@abv.bg 44
                                   */