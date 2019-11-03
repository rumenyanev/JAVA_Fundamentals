package methods_MoreExercise;

import java.io.*;
import java.util.Scanner;

public class TribonacciSequence04TwoRecursive {
    public static void main(String[] args) {  ////80/100 ??
       Scanner scanner = new Scanner(System.in);
        long num = Integer.parseInt(scanner.nextLine());

        PrintTribonacci(num);
    }

    private static int GetTribonacci(long num) {
        if (num == 1) {
            return 1;
        }
       else if (num == 2) {
            return 1;
        }
       else if (num == 3) {
            return 2;
        } else if(num > 3) {
            return GetTribonacci(num - 1)+
                   GetTribonacci(num - 2) +
                   GetTribonacci(num - 3);
        }
       return 0;
    }

    private static void PrintTribonacci(long num) {
        for (int i = 1; i <= num; i++) {

            System.out.printf(" %d", GetTribonacci(i));
        }
    }
}
/*Tribonacci Sequence
In the "Tribonacci" sequence, every number is formed by the sum of the previous 3.
You are given a number num. Write a program that prints num numbers from the Tribonacci sequence,
 each on a new line, starting from 1. The input comes as a parameter named num. The value num will always be positive integer.
Examples
Input
4

Output
1 1 2 4

Input
8

Output
1 1 2 4 7 13 24 44
                        */
