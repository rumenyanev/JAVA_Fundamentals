package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

    public class StrongNumber06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.parseInt(scanner.nextLine());
            int strongNumber = number;
            int sum = 0;
            while (strongNumber > 0) {
                int digit = strongNumber % 10;
                strongNumber /= 10;
                int factorial = 1;
                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }
                sum += factorial;
            }
            if (sum == number) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
/*Strong Number
Write a program to check if a given number is a strong number or not. A number is strong if the sum of the Factorial of each digit is equal to the number. For example 145 is a strong number, because 1! + 4! + 5! = 145. Print "yes" if the number is strong and "no" if the number is not strong.
Examples
Input
2

Output
yes

Input
3451

Output
no

Input
40585

Output
yes
       */

