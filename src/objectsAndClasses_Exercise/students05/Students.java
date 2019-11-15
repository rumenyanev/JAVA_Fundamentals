package objectsAndClasses_Exercise.students05;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void printStudent() {
        System.out.printf("%s %s: %.2f%n",this.getFirstName(),this.getLastName(),this.getGrade());


    }
}
/*Students
Write a program that receives an n count of students and orders them by grade (in descending).
Each student should have First name (string), Last name (string) and grade (floating-point number).
Input
First line will be a number n
Next n lines you will get a student info in the format "{first name} {second name} {grade}"
Output
Print each student in the following format "{first name} {second name}: {grade}"
Example
Input
4
Lakia Eason 3.90
Prince Messing 5.49
Akiko Segers 4.85
Rocco Erben 6.00

Output
Rocco Erben: 6.00
Prince Messing: 5.49
Akiko Segers: 4.85
Lakia Eason: 3.90
                         */