package methodsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grades02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        double grade = Double.parseDouble(reader.readLine());

        reedGrade(grade);
    }

    static double reedGrade(double grade) {
        if (grade >= 2 && grade < 3) {
            System.out.println("Fail");
        } else if (grade >= 3 && grade < 3.50){
            System.out.println("Poor");
        }else if(grade >= 3.50 && grade< 4.50){
            System.out.println("Good");
        }else if (grade >=4.50 && grade < 5.50){
            System.out.println("Very good");
        }else if (grade >=5.50 && grade <= 6){
            System.out.println("Excellent");
        }
        return grade;
    }
}
/*⦁	Grades
Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words
⦁	2.00 – 2.99 - "Fail"
⦁	3.00 – 3.49 - "Poor"
⦁	3.50 – 4.49 - "Good"
⦁	4.50 – 5.49 - "Very good"
⦁	5.50 – 6.00 - "Excellent"
Examples
Input
3.33

Output
Poor


Input
4.50

Output
Very good

Input
2.99

Output
Fail


Hint
Read the grade from the console and pass it to a method

Then create the method and make the if statements for each case
 */