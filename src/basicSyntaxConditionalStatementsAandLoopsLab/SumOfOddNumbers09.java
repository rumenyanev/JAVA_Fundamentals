package basicSyntaxConditionalStatementsAandLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n*2; i++) {
            if (i % 2 != 0) {
                sum += i;

            System.out.println(i);
        }}
        System.out.printf("Sum: %d",sum);
    }
}
/*⦁	Sum of Odd Numbers
Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
Input
On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
Output
Print the next n odd numbers, starting from 1, separated by new lines. On the last line, print the sum of these numbers.
Constraints
⦁	n will be in the interval [1…100]
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



   */
