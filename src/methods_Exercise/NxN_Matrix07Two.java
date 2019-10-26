package methods_Exercise;

import java.util.Scanner;

public class NxN_Matrix07Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        scanner.close();
        for (int i = 0; i < num; i++) {
            System.out.println(newString(String.valueOf(num), num));
        }


    }

    private static String newString(String symbol, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += symbol + " ";
        }
        return result.trim();
    }
}
/*NxN Matrix
Write a method that receives a single integer n and prints nxn matrix with that number.
Examples
Input
3

Output
3 3 3
3 3 3
3 3 3

Input
7

Output
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7


Input
2

Output
2 2
2 2
                   */
