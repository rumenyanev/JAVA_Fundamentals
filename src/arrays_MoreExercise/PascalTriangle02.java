package arrays_MoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PascalTriangle02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        int rows = Integer.parseInt(reader.readLine());
        int[] previousNumber = new int[1];

        for (int i = 0; i < rows ; i++) {
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < previousNumber.length; j++) {
                row[j] = previousNumber[j-1] + previousNumber[j];
            }
            System.out.println();
            for (int r : row) {
                System.out.print(r + " ");
            }
            previousNumber = Arrays.copyOf(row,row.length);
        }
    }
}
/*⦁	Pascal Triangle
The triangle may be constructed in the following manner:
In row 0 (the topmost row), there is a unique nonzero entry 1.
Each entry of each subsequent row is constructed by adding the number above and to
the left with the number above and to the right, treating blank entries as 0.
For example, the initial number in the first (or any other) row is 1 (the sum of 0 and 1),
 whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth row.
If you want more info about it: https://en.wikipedia.org/wiki/Pascal's_triangle
Print each row elements separated with whitespace.
Examples
Input
4


Output
1
1 1
1 2 1
1 3 3 1


Input
13

Output
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1
1 9 36 84 126 126 84 36 9 1
1 10 45 120 210 252 210 120 45 10 1
1 11 55 165 330 462 462 330 165 55 11 1
1 12 66 220 495 792 924 792 495 220 66 12 1
Hints
⦁	The input number n will be 1 <= n <= 60
⦁	Think about proper type for elements in array
⦁	Don’t be scary to use more and more arrays
*/