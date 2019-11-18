package objectsAndClassesMoreExercise.companyRoster01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        Map<String, Department> mapDepartments = new LinkedHashMap();
        Employee employee = null;
        Department dep = null;
        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {

            String[] information = reader.readLine().split("\\s+");
            int size = information.length;

            String name = information[0];
            double salary = Double.parseDouble(information[1]);
            String position = information[2];
            String department = information[3];
            employee = new Employee(name, salary, position, department);
            if (size == 5) {
                boolean isNumber = false;
                try {
                    Integer.parseInt(information[4]);
                    isNumber = true;
                } catch (Exception ignored) {
                }

                if (isNumber) {
                    int age = Integer.parseInt(information[4]);
                    employee.setAge(age);
                } else {
                    String email = information[4];
                    employee.setEmail(email);
                }

            } else if (size == 6) {
                String email = information[4];
                int age = Integer.parseInt(information[5]);
                employee.setEmail(email);
                employee.setAge(age);
            }

            dep = new Department(employee.getDepartment());
            if (!mapDepartments.containsKey(employee.getDepartment())) {
                mapDepartments.put(dep.getName(), dep);
                Department d = mapDepartments.get(dep.getName());
                mapDepartments.get(d.getName()).addEmployee(employee);
            } else {
                mapDepartments.get(dep.getName()).addEmployee(employee);
            }
        }

        Department resultDep = mapDepartments
                .values()
                .stream()
                .sorted((d1, d2) -> Double.compare(d2.averageSalary(), d1.averageSalary()))
                .findFirst()
                .orElse(null);

        if (resultDep != null) {
            System.out.println("Highest Average Salary: " + resultDep.getName());

            resultDep.getEmployees()
                    .stream()
                    .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                    .forEach(System.out::println);
        }


        //.filter(Comparator.comparing(d->d.))
        //.findFirst()
        //.sorted((d1,d2)-> Double.compare(d1.getValue().averageSalary(), d2.getValue().averageSalary()))
        //.max(Comparator.comparing(d->d.getValue().averageSalary()))

        /*mapDepartments
                .entrySet()
                .stream()
                .sorted((d1,d2)-> Double.compare(d1.getValue().averageSalary(), d2.getValue().averageSalary()))
                .forEach();*/

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


Input
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