package arrays_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            numbers[i] = num;
        }
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
/*⦁	Print Numbers in Reverse Order
Read n numbers and print them in reverse order.
Examples
Input
3
10
20
30

Output
30 20 10

Input
3
30
20
10

Output
10 20 30

Input
1
10

Output
10
*/