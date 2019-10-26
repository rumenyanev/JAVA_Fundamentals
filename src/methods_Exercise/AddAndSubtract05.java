package methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        scanner.close();
        System.out.println(addAndSubstractInteger(a,b,c));
    }

    private static int addAndSubstractInteger(int a, int b, int c) {
        int result = (a + b) - c;
        return result;
    }
}
/*Add and Subtract
You will receive 3 integers.
Write a method sum to get the sum of the first two integers and subtract
 method that subtracts the third integer from the result from the Sum method.
Examples
Input
23
6
10

Output
19

Input
1
17
30

Output
-12

Input
42
58
100

Output
0
          */