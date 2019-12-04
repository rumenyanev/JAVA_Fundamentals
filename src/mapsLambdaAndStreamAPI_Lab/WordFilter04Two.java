package mapsLambdaAndStreamAPI_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter04Two {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Arrays.stream(scanner.nextLine().split("\\s+"))
                    .filter(n->n.length()%2==0).forEach(e-> System.out.println(e));

        }

    }
/*⦁	Word Filter
Read an array of strings, take only words which length is even.
Print each word on a new line.

Examples
Input
kiwi orange banana apple


Output
kiwi
orange
banana

Input
pizza cake pasta chips

Output
cake


⦁	Read an array of strings
⦁	Filter those whose length is even

⦁	Print each word on a new line
                         */
