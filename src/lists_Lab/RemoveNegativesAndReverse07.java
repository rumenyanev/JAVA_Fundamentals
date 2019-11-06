package lists_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().
                split("\\s+")).
                map(Integer::parseInt).
                collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        }else{
            System.out.println(numbers.toString().replaceAll("\\[|,|\\]",""));
        }
    }
}
/*⦁	Remove Negatives and Reverse
Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
In case of no elements left in the list, print "empty".
Examples
Input
10 -5 7 9 -33 50

Output
50 9 7 10

Input
7 -2 -10 1

Output
1 7

Input
-1 -2 -3

Output
empty
              */