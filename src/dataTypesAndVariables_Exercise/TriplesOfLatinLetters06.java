package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriplesOfLatinLetters06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (char a = 'a'; a < 'a' + n; a++) {
            for (char b = 'a'; b < 'a' + n; b++) {
                for (char c = 'a'; c < 'a' + n; c++)

                    System.out.printf("%c%c%c\n", a, b, c);

            }
        }
    }
}
/*⦁	Triples of Latin Letters
Write a program to read an integer n and print all triples
of the first n small Latin letters, ordered alphabetically:
Examples
Input
3

Output
aaa
aab
aac
aba
abb
abc
aca
acb
acc
baa
bab
bac
bba
bbb
bbc
bca
bcb
bcc
caa
cab
cac
cba
cbb
cbc
cca
ccb
ccc
Hints
Perform 3 nested loops from 0 to n-1.

For each iteration generate new letters

Concat all characters in a string and print it. You can use String.format().

*/