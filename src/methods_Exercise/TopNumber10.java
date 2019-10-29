package methods_Exercise;


import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args)  {
     Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isTopNumber(int num) {
        boolean isOddNumber = false;
        int sum = 0;
        while (num > 0) {
            int number = num % 10;
            sum += number;
            num /= 10;
            isOddNumber = (isOddNumber)||(number % 2 != 0);
        }
        boolean topNumber = false;

      if ( isOddNumber && sum % 8 == 0){
          topNumber = true;
      }
      return topNumber;
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
