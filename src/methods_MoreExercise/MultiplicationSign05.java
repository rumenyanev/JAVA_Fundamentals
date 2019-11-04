package methods_MoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationSign05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());

        reader.close();

        System.out.println(multiplicationSign(one, two, three));

    }

    private static String multiplicationSign(int a, int b, int c) {

        if ((a < 0 && b < 0 && c > 0) || (a < 0 && c < 0 && b > 0) || (b < 0 && c < 0 && a > 0)) {
            return "positive";
        } else if (a < 0 || b < 0 || c < 0) {
            return "negative";
        } else if (a == 0 || b == 0 || c == 0) {
            return "zero";
        } else {
            return "positive";
        }
    }
}
/*Multiplication Sign
You are given a number num1, num2 and num3. Write a program that finds if num1 * num2 * num3 (the product) is negative, positive or zero.
Try to do this WITHOUT multiplying the 3 numbers.
Examples
Input
2
3
-1


Output
negative

Input
2
3
1

Output
positive
              */