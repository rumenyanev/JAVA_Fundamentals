package methods_Exercise;
import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!"END".equals(input = scanner.nextLine())){
            boolean isIntegerPalindrome = isPalindrome(input);
            if (isIntegerPalindrome){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }

    static boolean isPalindrome(String input){
        boolean result = false;
        if (input.length() == 1){
            result = true;
        }
            for (int i = 0; i < input.length()/2; i++) {
                if (input.charAt(i) == input.charAt(input.length()-1 -i)) {
                    result = true;
                }
            }

        return result;
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
