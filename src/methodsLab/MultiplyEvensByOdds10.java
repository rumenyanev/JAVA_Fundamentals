package methodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        number = Math.abs(number);

        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvensDigit(number);
        int oddsSum = getSumOfOddsDigit(number);

        return evenSum * oddsSum;
    }

    private static int getSumOfEvensDigit(int n) {
        int evenSum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            if (lastDigit % 2 == 0){
                evenSum += lastDigit;
            }
        }
        return evenSum;
    }

    private static int getSumOfOddsDigit(int n) {
        int oddSum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            if (lastDigit % 2 != 0){
                oddSum += lastDigit;
            }
        }
        return oddSum;
    }
}
/*⦁	Multiply Evens by Odds
Create a program that reads an integer number and multiplies the sum of all its even digits by the sum of all its odd digits:
Examples
Input
12345

Output
54

Comments
12345 has 2 even digits - 2 and 4. Even digits has sum of 6.
Also it has 3 odd digits - 1, 3 and 5. Odd digits has sum of 9.
Multiply 6 by 9 and you get 54.

Input
-12345

Output
54
Hints
⦁	Create a method with a name describing its purpose (like getMultipleOfEvensAndOdds). The method should have a single integer parameter and an integer return value. Also, the method will call two other methods:

⦁	Create two other methods each of which will sum either even or odd digits
⦁	Implement the logic for summing odd digits:

⦁	Do the same for the method that will sum even digits
⦁	As you test your solution you may notice that it doesn't work for negative numbers. Following the program execution line by line, find and fix the bug (hint: you can use Math.abs())
*/