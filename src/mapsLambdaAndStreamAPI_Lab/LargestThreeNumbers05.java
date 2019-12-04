package mapsLambdaAndStreamAPI_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted(Collections.reverseOrder())
                .limit(3).map(String::valueOf).collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
/*⦁	Largest 3 Numbers
Read a list of integers and print largest 3 of them. If there are less than 3, print all of them.
Examples
Input
10 30 15 20 50 5

Output
50 30 20

Input
20 30

Output
30 20

Hints
⦁	Read a list of integers
⦁	Order the list using Stream API

⦁	Print top 3 numbers with for loop*/