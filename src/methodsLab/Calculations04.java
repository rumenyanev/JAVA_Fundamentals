package methodsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculations04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String operator = reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int result = 0;
        switch (operator) {
            case "add":
               result = add(a,b);
                break;
            case "multiply":
                result = multiply(a,b);
                break;
            case "subtract":
                result = subtract(a,b);
                break;
            case "divide":
                result = divide(a,b);
                break;
        }

        System.out.println(result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
/*⦁	Calculations
Write a program that receives a string on the first line (add, multiply, subtract, divide)
 and on the next two lines receives two numbers. Create four methods (for each calculation)
  and invoke the right one depending on the command. The method should also print the result
  (needs to be void)
Example
Input
subtract
5
4

Output
1

Input
divide
8
4

Output
2

Hints
Read the command on the first line and the two numbers, and then make an if/switch statement for each type of calculation

*/