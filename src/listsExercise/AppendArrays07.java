package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AppendArrays07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));


        List<String> input = Arrays.stream(reader.readLine().split("\\|+")).collect(Collectors.toList());
        Collections.reverse(input);
        String str = input.toString();
        str = str.substring(1, str.length() - 1).trim();
        str = str.replaceAll(",", "");
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);

    }
}
/*Append Arrays
Write a program to append several array of numbers.
arrays are separated by ‘|’.
Values are separated by spaces (‘ ’, one or several)
Order the arrays from the last to the first, and their values from left to right.
Examples
Input
1 2 3 |4 5 6 |  7  8

Output
7 8 4 5 6 1 2 3

Input
7 | 4  5|1 0| 2 5 |3

Output
3 2 5 1 0 4 5 7


Input
1| 4 5 6 7  |8 9

Output
8 9 4 5 6 7 1
                     */