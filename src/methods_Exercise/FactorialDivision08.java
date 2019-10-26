package methods_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        double result = factorial(first) / factorial(second);

        reader.close();
        System.out.printf("%.2f", result);
    }

    private static double factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
/*Factorial Division
Read two integer numbers.
Calculate factorial of each number.
Divide the first result by the second and print the division formatted to the second decimal point.
Examples
Input
5
2

Output
60.00

Input
6
2

Output
360.00
           */
