package methodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                int firstInt = Integer.parseInt(scanner.nextLine());
                int secondInt = Integer.parseInt(scanner.nextLine());
                int maxInt = getMax(firstInt, secondInt);
                System.out.println(maxInt);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char maxChar = getMax(firstChar, secondChar);
                System.out.println(maxChar);
                break;
            case "String":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String maxString = getMax(firstString, secondString);
                System.out.println(maxString);
                break;
        }
    }
    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }
    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }
    private static String getMax(String first, String second) {
        int first1 = first.compareTo(second);
        if (first1 >= 0) {
            return first;
        }
        return second;
    }

}
/*⦁	Greater of Two Values
You are given two values of the same type as input. The values can be of type int, char of String.
Create a method getMax() that returns the greater of the two values:
Examples

Input
int
2
16

Output
16

Input
char
a
z

Output
z

Input
String
Ivan
Todor

Output
Todor

Hints
⦁	For this method you need to create three methods with the same name and different signatures
⦁	Create a method which will compare integers:

⦁	Create a second method with the same name which will compare characters. Follow the logic of the previous method:

⦁	Lastly you need to create a method to compare strings. This is a bit different as strings don't allow to be compared with the operators > and <

You need to use the method "compareTo()", which returns an integer value (greater than zero if the compared object is greater, l
ess than zero if the compared object is lesser and zero if the two objects are equal.
⦁	The last step is to read the input, use appropriate variables and call the getMax() from your main():


*/