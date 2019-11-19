package CompanyRoster01ObjectsAndClassesMoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader
                 (new InputStreamReader(System.in));

         int n = Integer.parseInt(reader.readLine());


        Department department = new Department();

        while (n-- > 0) {
            String[] info = reader.readLine().split("\\s+");
            String name = info[0];
            double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String departmentName = info[3];

            Employee employee = new Employee(name, salary, position, departmentName);

            if (info.length > 4) {
                if (isValidMail(info[4])) employee.setEmail(info[4]);
                else employee.setAge(Integer.parseInt(info[4]));
            }
            if (info.length > 5) {
                if (isValidMail(info[5])) employee.setEmail(info[5]);
                else employee.setAge(Integer.parseInt(info[5]));
            }

            department.addEmployee(employee);
        }

        double maxAverageSalary = -1;
        String saveName = "";

        for (String name : department.getDepartments()) {
            double averageSalary = department.getAverageSalary(name);
            if (averageSalary > maxAverageSalary) {
                maxAverageSalary = averageSalary;
                saveName = name;
            }
        }

        if (maxAverageSalary > -1) {
            System.out.println("Highest Average Salary: " + saveName);
            department.getEmployeesByDepartment(saveName)
                    .stream()
                    .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                    .forEach(e -> System.out.println(e.toString()));
        }
    }

    private static boolean isValidMail(String mail) {
        return mail.contains("@") && mail.contains(".");
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