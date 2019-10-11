package basicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class Messages05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < number; i++) {
            String digits = scanner.nextLine();
            int numberOfDigit = digits.length();

            int mainDigit = Integer.parseInt(digits) % 10;

            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 0) {
                message.append((char) (mainDigit + 32));
                continue;
            }

            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int letterIndex = offset + numberOfDigit - 1;

            message.append((char) (letterIndex + 97));
        }

        System.out.println(message.toString());
    }
}

/*Messages
Write a program, which emulates typing an SMS, following this guide:
1	2
   abc	3
       def
4
ghi	    5
       jkl	6
            mno
7
pqrs	8
        tuv	   9
              wxyz
	0
  space

Following the guide, 2 becomes “a”, 22 becomes “b” and so on.
Examples
Input
5
44
33
555
555
666

Output
hello

Input
9
44
33
999
0
8
44
33
777
33

Output
hey there


Input
7
6
33
33
8
0
6
33

Output
meet me


Hints
A native approach would be to just put all the possible combinations of digits in a giant switch statement.
A cleverer approach would be to come up with a mathematical formula, which converts a number to its alphabet representation:
Digit	2	3	4	5	6	7	8	9
Index	0 1 2	3 4 5	6 7 8	9 10 11	12 13 14	15 16 17 18	19 20 21	22 23 24 25
Letter	a b c	d e f	g h i	j  k  l	m  n  o	p  q  r  s	t u v	w  x  y  z
Let’s take the number 222 (c) for example. Our algorithm would look like this:
Find the number of digits the number has “e.g. 222  3 digits”
Find the main digit of the number “e.g.  222  2”
Find the offset of the number. To do that, you can use the formula: (main digit - 2) * 3
If the main digit is 8 or 9, we need to add 1 to the offset, since the digits 7 and 9 have 4 letters each
Finally, find the letter index (a  0, c  2, etc.). To do that, we can use the following formula: (offset + digit length - 1).
After we’ve found the letter index, we can just add that to the ASCII code of the lowercase letter “a” (97)
*/