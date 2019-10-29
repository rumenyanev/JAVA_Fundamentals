package methods_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeIntegers09Four {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String input;
        while (!"END".equalsIgnoreCase(input = reader.readLine())) {
            System.out.println(input.equals(reverse(input)) ? "true" : "false");
        }
    }
    private static String reverse(String input) {
        String result = "";
        for (int i = 0; i < input.length() ; i++) {
            result = input.charAt(i) + result;
        }
        return result;
    }
}



/*Palindrome Integers
A palindrome is a number which reads the same backward as forward, such as 323 or 1001.
 Write a program which reads a positive integer numbers until you receive "End",
 for each number print whether the number is palindrome or not.
Examples
Input

123
323
421
121
END

Output

false
true
false
true


Input

32
2
232
1010
END


Output

false
true
true
false
                 */
