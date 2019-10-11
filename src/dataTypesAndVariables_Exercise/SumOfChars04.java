package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfChars04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numOfChars = Integer.parseInt(reader.readLine());
        int sumOfChars = 0;

       while (numOfChars-- > 0){
             char ch = reader.readLine().charAt(0);

             sumOfChars += ch;

        }
        System.out.println(String.format("The sum equals: %d",sumOfChars));
    }
}
/*⦁	Sum of Chars
Write a program, which sums the ASCII codes of n characters.
Print the sum on the console.
Input
⦁	On the first line, you will receive n – the number of lines, which will follow
⦁	On the next n lines – you will receive letters from the Latin alphabet
Output
Print the total sum in the following format:
The sum equals: {totalSum}
Constraints
⦁	n will be in the interval [1…20].
⦁	The characters will always be either upper or lower-case letters from the English alphabet
⦁	You will always receive one letter per line
Examples
Input
5
A
b
C
d
E

Output
The sum equals: 399

Input
12
S
o
f
t
U
n
i
R
u
l
z
z

Output
The sum equals: 1263
                               */