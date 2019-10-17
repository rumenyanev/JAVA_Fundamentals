package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MagicSum08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().
                split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();
        int uniqueNumber = Integer.parseInt(reader.readLine());

        for (int i = 0; i <= numbers.length; i++) {
            for (int j = i; j <numbers.length ; j++) {
                if (numbers[i]+ numbers[j] == uniqueNumber && (i != j)){
                    System.out.printf("%d %d%n",numbers[i],numbers[j]);
                }
            }
        }
    }
}
/*Magic Sum
Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.
Examples
Input
1 7 6 2 19 23
8

Output
1 7
6 2


Input
14 20 60 13 7 19 8
27

Output
14 13
20 7
19 8
           */