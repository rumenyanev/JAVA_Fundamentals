package arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays03Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] numbers = new String[n * 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                numbers[index++] = input[0];
                numbers[index++] = input[1];
            } else {
                numbers[index++] = input[1];
                numbers[index++] = input[0];
            }
        }
        String first = "";
        String second = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                first += numbers[i] + " ";
            }else{
                second +=numbers[i] + " ";
            }
        }
        System.out.println(first);
        System.out.println(second);
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
