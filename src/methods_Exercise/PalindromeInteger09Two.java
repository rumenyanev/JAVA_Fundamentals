package methods_Exercise;

import java.util.Scanner;

public class PalindromeInteger09Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (!"END".equals(input = scanner.nextLine())) {
            isPalindrome(input);

        }

    }

    static String isPalindrome(String input) {

        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        if (input.length() == 1) {
            System.out.println("true");
        }
        if (input.length() <= 3) {
            for (int i = 0; i < input.length() / 2; i++) {
                sb.append(input.charAt(i));
                reverse.append(input.charAt(input.length() - 1));
                if (sb.toString().equals(reverse.toString())) {
                    System.out.println("true");
                } else System.out.println("false");
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                sb.append(input.charAt(i));
                reverse.append(input.charAt(input.length() - 1 - i));
            }
            if (sb.toString().equals(reverse.toString())) {
                System.out.println("true");
            } else System.out.println("false");
        }


        return sb.toString();
    }
}
/*Palindrome Integers
A palindrome is a number which reads the same backward as forward, such as 323 or 1001.
 Write a program which reads a positive integer numbers until you receive "End",
 for each number print whether the number is palindrome or not.
Examples
Input

123
323
421
121
END

Output

false
true
false
true


Input

32
2
232
1010
END


Output

false
true
true
false
                 */