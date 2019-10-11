package basicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class ReverseString04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
        }

        System.out.println(sb.reverse());
    }
}
/*Reverse String
Write a program which reverses a string and print it on the console.
Examples
Input
Hello

Output
olleH

Input
SoftUni

Output
inUtfoS

Input
1234

Output
54321
*/