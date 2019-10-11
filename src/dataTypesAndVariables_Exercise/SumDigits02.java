package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDigits02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int result = 0;

        while (number > 0) {
            result = result + number % 10;
            number = number / 10;

        }

        System.out.println(result);

    }
}
/*⦁	Sum Digits
You will be given a single integer. Your task is to find the sum of its digits.
Examples
Input
245678

Output
32


Input
97561

Output
28


Input
543

Output
12
*/