package methods_MoreExercise;

import java.io.IOException;
import java.util.Scanner;

public class TribonacciSequence04 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num <= 0) {
            System.out.println(0);

        } else if (num == 1) {
            System.out.println("1");
        } else if (num == 2) {
            System.out.println("1 1");
        } else {
            System.out.print("1 1 2 ");
        }
        GetTribonacci(num);

    }

    private static void GetTribonacci(int num) {
        int three = 1;
        int two = 1;
        int one = 2;
        int max = num;
        for (int i = 0; i < max - 3; i++) {
            num = three + two + one;
            three = two;
            two = one;
            one = num;
            System.out.printf("%d ", num);
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