package basicSyntaxConditionalStatementsAandLoopsLab;

import java.util.Scanner;

public class StudentInformation01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,averageGrade);
    }
}

/*⦁	Student Information
You will be given 3 lines of input – student name, age and average grade. Your task is to print all the info about the student in the following format: "Name: {student name}, Age: {student age}, Grade: {student grade}".
Examples
Input
John
15
5.40


Output
Name: John, Age: 15, Grade: 5.40


Input
Steve
16
2.50

Output
Name: Steve, Age: 16, Grade: 2.50


Input
Marry
12
6.00

Output
Name: Marry, Age: 12, Grade: 6.00



Solution
First, we need a scanner, which we can use to read data from the console.

Read all the information – student name, age and grade

Finally, we need to print the information in the specified format

 */
