package DataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedChars07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(one);
        sb.append(" ");
        sb.append(two);
        sb.append(" ");
        sb.append(three);


        System.out.println(sb.reverse());
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