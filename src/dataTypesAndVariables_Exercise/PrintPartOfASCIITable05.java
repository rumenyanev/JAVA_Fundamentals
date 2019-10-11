package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPartOfASCIITable05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int startIndex = Integer.parseInt(reader.readLine());
        int stopIndex = Integer.parseInt(reader.readLine());

        for (int i = startIndex; i <= stopIndex ; i++) {

            char result = (char)(i);
            System.out.print(result + " ");
        }

    }
}
/*⦁	Print Part of the ASCII Table
Find online more information about ASCII (American Standard Code for Information Interchange)
and write a program that prints part of the ASCII table of characters at the console.
On the first line of input you will receive the char index you should start with and on the
second line - the index of the last character you should print.
Examples
Input
60
65

Output
< = > ? @ A

Input
69
79

Output
E F G H I J K L M N O

Input
97
104

Output
a b c d e f g h

Input
40
55

Output
( ) * + , - . / 0 1 2 3 4 5 6 7
                                       */