package lists_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<Integer>numbers = Arrays.stream(reader.readLine().
                split("\\s+")).
                map(Integer::parseInt).
                collect(Collectors.toList());


        int initialSize = numbers.size()/2;
        for (int i = 0; i <initialSize ; i++) {
            int firstNum = numbers.get(i);
            int index = (numbers.size()- 1);
            int nextNum = numbers.get(index);

            numbers.set(i,firstNum + nextNum);
            numbers.remove(index);
        }
        System.out.println(numbers.toString().replaceAll("\\[|,|\\]",""));


            }
        }





/*⦁	Gauss' Trick
Write a program that sum all numbers in a list in the following order:
first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.


Example
Input
1 2 3 4 5

Output
6 6 3

Input
1 2 3 4
Output
5 5
           */