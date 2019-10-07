package basicSyntaxConditionalStatementsAandLoopsLab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (2 * i + 1);
            System.out.println(2 * i + 1);

        }
        System.out.printf("Sum: %d%n", sum);

    }
}
/*⦁	Refactor Sum of Odd Numbers
You are assigned to find and fix the bugs in an existing piece of code, using the debugger. You should trace the program execution to find the lines of code that produce incorrect or unexpected results.
You are given a program (existing source code) that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
Examples
Input
5
Output
1
3
5
7
9
Sum: 25

Input
3

Output
1
3
5
Sum: 9

SumOddNumbers.java
Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(sc.nextLine());
int sum = 1;
for (int i = 0; i <= n; i++) {
    System.out.print(2 * i + 1);
    sum += 2 * i;
}
System.out.printf("Sum: %d%n", sum);
*/