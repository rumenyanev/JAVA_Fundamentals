package methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(smallestNumber(a, b, c));
    }

    private static int smallestNumber(int a, int b, int c) {

        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        }
        return c;
    }
}
/*Smallest of Three Numbers
Write a method to print the smallest of three integer numbers. Use appropriate name for the method.
Examples
Input
2
5
3

Output
2

Input
600
342
123

Output
123

Input
25
-21
4

Output
-21
          */

