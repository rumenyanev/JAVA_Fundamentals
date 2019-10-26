package methods_Exercise;

import java.util.Scanner;

public class VowelsCount02Two {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String word = scanner.nextLine().toLowerCase();
            int count = 0;


            for (int i = 0; i < word.length(); i++) {
                if (isVowels(word.charAt(i))) {
                    count++;
                }
                scanner.close();
            }System.out.println(count);
        }

        private static boolean isVowels(char symbol) {
            switch (symbol) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                case 'y':
                    return true;
            }
            return false;

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
