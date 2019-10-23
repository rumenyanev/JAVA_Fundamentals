package methodsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignOfIntegerNumbers01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        printInteger(number);

    }

    static int printInteger(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0) {
            System.out.println("The number 0 is zero.");
        } else {
            System.out.printf("The number %d is negative.", number);
        }
        return number;
    }
}
/*⦁	Sign of Integer
Create a method that prints the sign of an integer number.
Example

Input
2

Output
The number 2 is positive.

Input
-5
Output
The number -5 is negative.

Input
0

Output
The number 0 is zero.
*/