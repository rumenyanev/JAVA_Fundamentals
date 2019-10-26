package methodsLab;

import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        scanner.close();

        double result = mathOperations(a,operator,b);
        System.out.printf("%.0f",result);
    }

    private static double mathOperations(int a, String operator, int b) {
        double result = 0;
        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }


        return result;
    }
}
/*⦁	Math operations
Write a method that receives two number and an operator, calculates the result and returns it.
 You will be given three lines of input. The first will be the first number,
 the second one will be the operator and the last one will be the second number.
 The possible operators are: / * + -
Print the result rounded up to the second decimal point.
Example
Input
5
*
5

Output
25

Input
4
+
8


Output
12

Hint
Read the inputs and create a method that returns a double (the result of the operation)
 */