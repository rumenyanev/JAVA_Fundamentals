package methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        scanner.close();
        System.out.println( middleCharacters(line));

    }
    private static String middleCharacters(String input){
        StringBuilder middleChar = new StringBuilder();
        if(input.length()%2 == 0){
            middleChar.append((input.charAt(input.length()/2-1)));
            middleChar.append((input.charAt((input.length()+1)/2)));
        }else{
            middleChar.append((input.charAt(input.length()/2)));
        }
        return middleChar.toString();
    }
}
/*Middle Characters
You will receive a single string.
Write a method that prints the middle character.
If the length of the string is even there are two middle characters.
Examples

Input
aString

Output
r

Input
someText

Output
eT

Input
3245

Output
24
              */