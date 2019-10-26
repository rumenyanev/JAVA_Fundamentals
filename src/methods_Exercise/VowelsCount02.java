package methods_Exercise;

import java.util.Scanner;

public class VowelsCount02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        scanner.close();
        System.out.println(vowelCount(input));
    }

    private static int vowelCount(String line) {
        int count = 0;
        String vowels = "AOEUIYaoeuiy";
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {

                if (line.charAt(i) == vowels.charAt(j))
                    count++;

            }
        }

        return count;
    }
}
/*Vowels Count
Write a method that receives a single string and prints the count of the vowels.
Use appropriate name for the method.
Examples

Input
SoftUni

Output
3

Input
Cats

Output
1

Input
JS

Output
0
          */