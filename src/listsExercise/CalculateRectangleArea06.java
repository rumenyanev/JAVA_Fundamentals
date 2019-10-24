package listsExercise;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());

       double result = calculateRectangleArea(height,lenght);
        System.out.printf("%.0f",result);
    }
    static double calculateRectangleArea(double h,double l){
        return  h * l;
    }
}
/*⦁	Calculate Rectangle Area
Create a method that calculates and returns the area of a triangle...?? by given width and length:
Examples
Input
3
4

Output
12


Hints
After reading the input create a method, but this time instead of typing "static void" before its name,
type "static double" as this will make it to return a value of type double:

Invoke the method in the main and save the return value in a new variable:

*/