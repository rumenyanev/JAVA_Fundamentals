package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));

    }

    static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
           result *= number;
        }
        return result;
    }
}
/*⦁	Math Power
Create a method that calculates and returns the value of a number raised to a given power:
Examples
Input
2
8

Output
256

Input
5.5
3

Output
166.375
*/