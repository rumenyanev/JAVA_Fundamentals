package basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class PrintAndSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = start; i <= stop ; i++) {
            sum +=i;
            System.out.print(i+" ");

        }
        System.out.printf("%nSum: %d",sum);
    }
}
/*Print and Sum
Write a program to display numbers from given start to given end and their sum.
 All the numbers will be integers. On the first line you will receive the start number, on the second the end number.

Examples
Input
5
10

Output
5 6 7 8 9 10
Sum: 45

Input
0
26

Output
0 1 2 … 26
Sum: 351
50
60	50 51 52 53 54 55 56 57 58 59 60
Sum: 605
*/