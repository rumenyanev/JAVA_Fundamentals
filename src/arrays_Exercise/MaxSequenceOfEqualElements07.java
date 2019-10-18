package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentCount = 0;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        maxIndex = i;
                    }
                } else {
                    break;

                }
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(numbers[i + maxIndex]+ " ");
        }
    }
}

/*Max Sequence of Equal Elements
Write a program that finds the longest sequence of equal elements in
an array of integers. If several longest sequences exist, print the leftmost one.
Examples
Input
2 1 1 2 3 3 2 2 2 1

Output
2 2 2

Input
1 1 1 2 3 1 3 3

Output
1 1 1

Input
4 4 4 4

Output
4 4 4 4


Input
0 1 1 5 2 2 6 3 3

Output
1 1
*/