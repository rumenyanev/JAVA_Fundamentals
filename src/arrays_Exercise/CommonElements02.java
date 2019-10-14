package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[] firstArray = reader.readLine().split("\\s+");
        String[] secondArray = reader.readLine().split("\\s+");

        int sum = 0;
        for (String s1 : secondArray) {
            for (String s : firstArray) {
                if (s.equals(s1)) {
                    System.out.print(s + " ");
                }
            }

        }
    }
}
/*Common Elements
Write a program, which prints common elements in two arrays.
You have to compare the elements of the second array to the elements of the first.

Examples

Input
Hey hello 2 4
10 hey 4 hello

Output
4 hello


Input
S of t un i
of i 10 un

Output
of i un


Input
i love to code
code i love to

Output
code i love to
                  */