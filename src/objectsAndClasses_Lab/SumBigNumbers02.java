package objectsAndClasses_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumBigNumbers02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        BigInteger firstBigInteger = new  BigInteger(reader.readLine());
        BigInteger secondBigInteger = new  BigInteger(reader.readLine());

        BigInteger result = firstBigInteger.add(secondBigInteger);

        System.out.println(result);

    }
}
/*⦁	Sum Big Numbers
You will receive two numbers (0 to 1050), print their sum.
Examples
Input
923847238931983192462832102
934572893617836459843471846187346

Output
934573817465075391826664309019448

Input
4
100

Output
104
Hints
Use the class BigInteger
Import the namespace "java.math.BigInteger":

Use the type BigInteger to read the numbers and calculate their sum.

*/