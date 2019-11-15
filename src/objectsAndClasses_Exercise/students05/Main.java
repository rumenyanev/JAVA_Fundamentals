package objectsAndClasses_Exercise.students05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numOfStudents = Integer.parseInt(reader.readLine());


        List<Students> studentList = new ArrayList<>();
        while (numOfStudents-- > 0) {
            String[] dataStudents = reader.readLine().split("\\s+");
            Students students = new Students(
                    dataStudents[0],
                    dataStudents[1],
                    Double.parseDouble(dataStudents[2]));
            studentList.add(students);
        }

        studentList.stream()
                .sorted(Comparator.comparingDouble(Students::getGrade).reversed())
                .forEach(Students::printStudent);
    }
}
/*Students
Write a program that receives an n count of students and orders them by grade (in descending). Each student should have First name (string), Last name (string) and grade (floating-point number).
Input
⦁	First line will be a number n
⦁	Next n lines you will get a student info in the format "{first name} {second name} {grade}"
Output
⦁	Print each student in the following format "{first name} {second name}: {grade}"
Example
Input
4
Lakia  Eason 3.90
Prince  Messing 5.49
Akiko  Segers 4.85
Rocco  Erben 6.00


Output
Rocco Erben: 6.00
Prince Messing: 5.49
Akiko Segers: 4.85
Lakia Eason: 3.90*/