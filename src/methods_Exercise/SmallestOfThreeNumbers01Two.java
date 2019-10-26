package methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers01Two {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());
            int thirdNumber = Integer.parseInt(scanner.nextLine());

            int minNumber =  min(firstNumber,secondNumber);
            System.out.println(min(minNumber,thirdNumber));
        }
        static int min(int firstNumber,int secondNumber){
            return Math.min(firstNumber,secondNumber);
        }
    }
/*Smallest of Three Numbers
Write a method to print the smallest of three integer numbers. Use appropriate name for the method.
Examples
Input
2
5
3

Output
2

Input
600
342
123

Output
123

Input
25
-21
4

Output
-21
          */

