package basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class TriangleOfNumbers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }
}
/*Triangle of Numbers
Write a program, which receives a number – n, and prints a triangle from 1 to n as in the examples.
Constraints
n will be in the interval [1...20].
Examples
Input
3

Output
1
2 2
3 3 3

Input
5

Output
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

Input
6

Output
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
                     */