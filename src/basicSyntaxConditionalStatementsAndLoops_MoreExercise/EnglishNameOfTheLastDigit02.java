package basicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

lastDigitOfNumber(number);
    }

    static int lastDigitOfNumber(Integer number) {
        int num = 0;
       num = number % 10;
       switch (num){
           case 1:
               System.out.println("one");
               break;
           case 2:
               System.out.println("two");
               break;
           case 3:
               System.out.println("three");
               break;
           case 4:
               System.out.println("four");
               break;
           case 5:
               System.out.println("five");
               break;
           case 6:
               System.out.println("six");
               break;
           case 7:
               System.out.println("seven");
               break;
           case 8:
               System.out.println("eight");
               break;
           case 9:
               System.out.println("nine");
               break;
           case 0:
               System.out.println("zero");
               break;

       }

        return num;
    }
}
/*⦁	English Name of the Last Digit
Write a method that returns the English name of the last digit of a given number.
Write a program that reads an integer and prints the returned value from this method.
Examples
Input
512

Output
two


Input
1

Output
one

Input
1643

Output
three
          */