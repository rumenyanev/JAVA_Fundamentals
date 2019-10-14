package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagArrays03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] numbers = reader.readLine().split("\\s+");
            if (i % 2 != 0) {
                firstArray[i] = numbers[1];
                secondArray[i] = numbers[0];
            } else {
                firstArray[i] = numbers[0];
                secondArray[i] = numbers[1];
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");


        }
    }
}

/*Zig-Zag Arrays
Write a program which creates 2 arrays. You will be given an integer n. On the next n lines you get 2 integers. Form 2 arrays as shown below.

Examples
Input
4
1 5
9 10
31 81
41 20

Output
1 10 31 20
5 9 81 41

Input
2
80 23
31 19

Output
80 19
23 31
            */