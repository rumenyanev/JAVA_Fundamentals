package methodsLab;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
       scanner.close();
        repeatString(input,count);

    }
   private static void repeatString(String input,int count){

       for (int i = 0; i < count; i++) {
           System.out.print(input);
       }
   }
}
/*⦁	Repeat String
Write a method that receives a string and a repeat count n (integer). The method should return a new string (the old one repeated n times)
Example
Input
abc
3

Output
abcabcabc


Input
String
2

Output
StringString
               */