package mapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Character, Integer> countChars = new LinkedHashMap<>();

        String text = String.join("", scanner.nextLine().split("\\s+"));

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (!countChars.containsKey(symbol)) {
                countChars.put(symbol, 1);
            } else {
                countChars.put(symbol, countChars.get(symbol) + 1);
            }
        }
        countChars.forEach((key, value) -> System.out.println(String.format("%s -> %d", key, value)));

    }
}
/*Count Chars in a String
Write a program which counts all characters in a string except space (' ').
Print all occurrences in the following format:
{char} -> {occurrences}
Examples
Input
text

Output
t -> 2
e -> 1
x -> 1

Input
text text text


Output
t -> 6
e -> 3
x -> 3
           */