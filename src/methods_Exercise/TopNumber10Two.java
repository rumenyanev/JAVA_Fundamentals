package methods_Exercise;

import java.util.Scanner;

public class TopNumber10Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (hasOneOddDigit(i) && isDigitsIsDivisibleBy8(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean hasOneOddDigit(int number) {
        boolean flag = false;
        String num = String.valueOf(number);
        for (int i = 0; i < num.length(); i++) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 == 1) {

                return true;
            }
        }
        return false;
    }

    private static boolean isDigitsIsDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


/*Top Number
A top number is an integer that holds the following properties:
Its sum of digits is divisible by 8, e.g. 8, 16, 88.
Holds at least one odd digit, e.g. 232, 707, 87578.
Write a program to print all master numbers in the range [1…n].
Examples
Input
50

Output
17
35

Input
100

Output
17
35
53
71
79
97
          */