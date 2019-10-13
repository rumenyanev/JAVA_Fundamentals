package arrays_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverceAnArrayOfString04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[] symbols = reader.readLine().split("\\s+");
        for (int i = symbols.length-1; i >= 0 ; i--) {
            System.out.print(symbols[i]+ " ");

        }

    }
}
/*⦁	Reverse an Array of Strings
Write a program to read an array of strings, reverse it and print its elements.
The input consists of a sequence of space separated strings. Print the output on a single line (space separated).
Examples

Input
a b c d e

Output
e d c b a

Input
-1 hi ho w

Output
w ho hi -1


Hints
⦁	Read the array of strings.
⦁	Exchange the first element (at index 0) with the last element (at index n-1).
⦁	Exchange the second element (at index 1) with the element before the last (at index n-2).
⦁	Continue the same way until the middle of the array is reached.

     */
