package arrays_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAndOddSubtraction05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split("\\s+");

        int evenSum = 0;
        int oddSum = 0;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num % 2 == 0) {
                evenSum += num;

            } else if (num != 0) {

                oddSum += num;
            }
        }
        int result = evenSum - oddSum;
        System.out.println(result);
    }
}
/*⦁	Even and Odd Subtraction
Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.
Examples
Input
1 2 3 4 5 6

Output
3

Comments
2 + 4 + 6 = 12
1 + 3 + 5 = 9
12 – 9 = 3


Input
3 5 7 9

Output
-24


Input
2 4 6 8 10

Output
30


Solution
First, we need to read the array.

We will need two variables – even and odd sum.

Iterate through all elements in the array. Check the current number – if it is even add it to the even sum, otherwise add it to the odd sum.

Print the difference.


*/