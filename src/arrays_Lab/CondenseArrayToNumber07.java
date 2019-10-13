package arrays_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class CondenseArrayToNumber07 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[]input = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        while (input.length > 1) {
            int[] numbers = new int[input.length - 1];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input[i] + input[i + 1];
            }
            input = numbers;
        }
        System.out.println(input[0]);
    }
}
/*⦁	Condense Array to Number
Write a program to read an array of integers and condense them by summing adjacent
couples of elements until a single integer is obtained. For example, if we have 3 elements {2, 10, 3},
 we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
 then we sum again all adjacent elements and obtain {12+13} = {25}.
Examples
Input
2 10 3

Output
25


Comments
2 10 3  2+10 10+3  12 13  12 + 13  25

Input
5 0 4 1 2

Output
35

Comments
5 0 4 1 2  5+0 0+4 4+1 1+2  5 4 5 3  5+4 4+5 5+3  9 9 8  9+9 9+8  18 17  18+17  35

Input
1

Output
1

Comments
1 is already numbers to number
Hints
While we have more than one element in the array input[], repeat the following:
⦁	Allocate a new array numbers[] of size input.Length-1.
⦁	Sum the numbers from input[] to numbers[]:
⦁	numbers[i] = input[i] + input[i+1]
⦁	input[] = numbers[]
The process is illustrated below:

 */