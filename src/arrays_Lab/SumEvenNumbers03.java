package arrays_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumEvenNumbers03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[]numbers =reader.readLine().split("\\s+");
        int sum = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
/*⦁	Sum Even Numbers
Read an array from the console and sum only the even numbers.
Examples
Input
1 2 3 4 5 6

Output
12

Input
3 5 7 9

Output
0

Input
2 4 6 8 10

Output
30
              */