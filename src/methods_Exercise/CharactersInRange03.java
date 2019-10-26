package methods_Exercise;

import java.util.Scanner;

public class CharactersInRange03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char stop = scanner.nextLine().charAt(0);

        scanner.close();
        System.out.print(characterInRange(start, stop));

    }

    private static String characterInRange(char a, char b) {
        StringBuilder sb = new StringBuilder();
        int start = Math.min(a, b);
        int stop = Math.max(a, b);
        for (int i = ++start; i < stop; i++) {
            sb.append((char) i + " ");
        }
        return sb.toString();
    }
}
/*Characters in Range
Write a method that receives two characters and prints on a single line all the characters in between them according to ASCII.
Examples
Input
a
d

Output
b c

Input
#
:

Output
$ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9

Input
C
#

Output
$ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B
                                                                         */

