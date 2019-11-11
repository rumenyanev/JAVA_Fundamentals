package objectsAndClasses_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigFactorial03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        BigInteger bigFactorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
           bigFactorial = bigFactorial.multiply(BigInteger.valueOf(i));

        }
        System.out.println(bigFactorial);
    }
}
/*⦁	Big Factorial
You will receive N – number in range [0 – 1000]. Calculate Factorial of N and print the result.
Examples
Input
5

Output
120

Input
50

Output
30414093201713378043612608166064768844377641568960512000000000000
*/