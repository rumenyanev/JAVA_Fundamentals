package DataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharsToString06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

      String firstSymbol = reader.readLine();
      String secondSymbol = reader.readLine();
      String thirdSymbol = reader.readLine();

        System.out.printf("%s%s%s",firstSymbol,secondSymbol,thirdSymbol);
    }
}
/*⦁	Chars to String
Write a program that reads 3 lines of input. On each line you get a single character. Combine all the characters into one string and print it on the console.
Examples
Input
a
b
c

Output
abc

Input
%
2
o


Output
%2o

Input
1
5
p

Output
15p
*/