package arrays_Lab;

import java.util.Scanner;

public class ReverceAnArrayOfString04Two {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[]words = scanner.nextLine().split(" ");

            for (int i = 0; i < words.length/2 ; i++) {
                String temp = words[i];
                words[i] = words[words.length - 1 - i];
                words[words.length - 1 - i] = temp;
            }
            for (String word : words) {//foreach loop
                System.out.print(word + " ");
            }
        }

    }

    /*⦁	Reverse an Array of Strings
Write a program to read an array of strings, reverse it and print its elements.
The input consists of a sequence of space separated strings. Print the output on a single line (space separated).
Examples

Input
a b c d e

Output
e d c b a

Input
-1 hi ho w

Output
w ho hi -1


Hints
⦁	Read the array of strings.
⦁	Exchange the first element (at index 0) with the last element (at index n-1).
⦁	Exchange the second element (at index 1) with the element before the last (at index n-2).
⦁	Continue the same way until the middle of the array is reached.


    */