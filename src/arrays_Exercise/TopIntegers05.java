package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TopIntegers05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[] numbers = (Arrays.stream(reader.readLine().
                split("\\s+")).
                mapToInt(Integer::parseInt)
                .toArray());

        int[] topInteger = new int[numbers.length];
        System.arraycopy(numbers, 0, topInteger, 0, topInteger.length);
        for (int i = 0; i < topInteger.length; i++) {
            boolean isGreater = true;
            for (int j = i + 1; j < topInteger.length; j++) {
                if (topInteger[i] <= topInteger[j]) {
                    isGreater = false;
                    break;
                }
            }
            if (isGreater) {
                System.out.print(topInteger[i] + " ");
            }
        }
    }
}
/*Top Integers
Write a program to find all the top integers in an array.
A top integer is an integer which is bigger than all the elements to its right.
Examples
Input
1 4 3 2

Output
4 3 2

Input
14 24 3 19 15 17

Output
24 19 17

Input
27 19 42 2 13 45 48

Output
48
          */