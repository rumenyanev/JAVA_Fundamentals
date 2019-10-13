package arrays_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualArrays06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[]firstArray = Arrays.stream(reader.readLine().
                split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();
        int[]secondArray = Arrays.stream(reader.readLine().
                split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();
        int sum = 0;
        int index = -1;

            for (int i = 0; i <firstArray.length ; i++) {
                if (firstArray[i] != secondArray[i]) {
                    index = i;
                    break;
                }
                sum += firstArray[i];
            }
             if(index == -1){
                 System.out.printf("Arrays are identical. Sum: %d",sum);
             }
             else {
                    System.out.printf("Arrays are not identical. Found difference at %d index.",index);
                }
            }
        }


/*⦁	Equal Arrays
Read two arrays and print on the console whether they are identical or not.
Arrays are identical if their elements are equal.
If the arrays are identical find the sum of the first one and print on the console following message: "Arrays are identical. Sum: {sum}",
otherwise find the first index where the arrays differ and print on the console following message: "Arrays are not identical.
Found difference at {index} index."
Examples

Input
10 20 30
10 20 30

Output
Arrays are identical. Sum: 60

Input
1 2 3 4 5
1 2 4 3 5

Output
Arrays are not identical. Found difference at 2 index.

Input
1
10

Output
Arrays are not identical. Found difference at 0 index.


Hints
First, we need to read two arrays.

Iterate through arrays and compare element. If the elements are not equal print the required message and break the loop.
*/