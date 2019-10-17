package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSums06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().
                split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();

        if (numbers.length <= 1) {
            System.out.println(0);
            return;
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
            leftSum = 0;
            rightSum = 0;
        }
        System.out.println("no");

    }

}

/*Equal Sums
Write a program that determines if there exists an element in the array such that the sum
of the elements on its left is equal to the sum of the elements on its right.
If there are no elements to the left / right, their sum is considered to be 0.
Print the index that satisfies the required condition or “no” if there is no such index.

Examples

Input
1 2 3 3

Output
2

Comments
At a[2] -> left sum = 3, right sum = 3
a[0] + a[1] = a[3]

Input
1 2

Output
no

Comments
At a[0] -> left sum = 0, right sum = 2
At a[1] -> left sum = 1, right sum = 0
No such index exists

Input
1

Output
0

Comments
At a[0] -> left sum = 0, right sum = 0


Input
1 2 3

Output
no

Comments
No such index exists
10 5 5 99 3 4 2 5 1 1 4	3	At a[3] -> left sum = 20, right sum = 20
a[0] + a[1] + a[2] = a[4] + a[5] + a[6] + a[7] + a[8] + a[9] + a[10]
*/