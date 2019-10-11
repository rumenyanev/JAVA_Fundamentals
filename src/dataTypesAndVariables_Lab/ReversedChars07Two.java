package dataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedChars07Two {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();

        System.out.printf("%s %s %s",three,two,one);
    }
}
/*⦁	Reversed Chars
Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.
Examples
Input
A
B
C

Output
C B A

Input
1
L
&

Output
& L 1
                 */