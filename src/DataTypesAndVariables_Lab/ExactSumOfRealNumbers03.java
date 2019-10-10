package DataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ExactSumOfRealNumbers03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        BigDecimal sum = new BigDecimal("0");

        while (n-- > 0) {
            BigDecimal numbers = new BigDecimal(reader.readLine());

            sum = sum.add(numbers);
        }
        System.out.println(sum);
    }

}

/*⦁	Exact Sum of Real Numbers
Write program to enter n numbers and calculate and print their exact sum (without rounding).
Examples
Input
3
1000000000000000000
5
10


Output
1000000000000000015

Input
2
0.00000000003
333333333333.3

Output
333333333333.30000000003

Hints
Use BigDecimal to not lose precision*/