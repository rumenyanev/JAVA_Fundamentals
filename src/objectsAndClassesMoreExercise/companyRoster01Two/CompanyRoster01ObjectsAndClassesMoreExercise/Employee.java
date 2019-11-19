package CompanyRoster01ObjectsAndClassesMoreExercise;


public class Employee {

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    private String getName() { return name; }
    double getSalary() { return salary; }
    String getDepartment() { return department; }

    private String getEmail() { return email; }
    void setEmail(String email) { this.email = email; }

    private int getAge() { return age; }
    void setAge(int age) { this.age = age; }

    Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.getName(), this.getSalary(), this.getEmail(), this.getAge());
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