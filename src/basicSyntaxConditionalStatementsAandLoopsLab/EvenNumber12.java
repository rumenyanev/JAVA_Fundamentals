package basicSyntaxConditionalStatementsAandLoopsLab;

import java.util.Scanner;

public class EvenNumber12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        while (number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }
        if (number % 2 == 0) {
            System.out.printf("The number is: %d",Math.abs(number));
        }

    }

}


/*⦁	Even Number
Take as an input an even number and print its absolute value.
If the number is odd, print "Please write an even number." and continue reading numbers.
Examples
Input
1
3
6

Output
Please write an even number.
Please write an even number.
The number is: 6

Input
-6

Output
The number is: 6

*/