package arrays_MoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EncryptSortAndPrintArray01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] strArray = new String[n];
        int[] sums = new int[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = reader.readLine();
        }
        int sum = 0;

        for (int i = 0; i < strArray.length; i++) {
            String name = strArray[i];
            for (int j = 0; j < name.length(); j++) {
                char symbol = name.charAt(j);

                if (isVowel(symbol)) {
                    sum += (symbol * name.length());
                } else /*if (isConsanant(symbol))*/ {
                    sum += (symbol / name.length());
                }
            }
            sums[i] = sum;
            sum = 0;
        }

        Arrays.sort(sums);
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }
    }


    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }

    public static boolean isConsanant(char c) {
        String cons = "bcdfghjklmnpqrstvwxyz" +
                      "BCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(c + "");
    }
}

/*⦁	Encrypt, Sort and Print Array
Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
⦁	The code of each vowel multiplied by the string length
⦁	The code of each consonant divided by the string length
Sort the number sequence in ascending order and print it on the console.
On first line, you will always receive the number of strings you have to read.
Examples
Input
4
Peter
Maria
Katya
Todor

Output
1032
1071
1168
1532


Comments
Peter = 1071
Maria = 1532
Katya = 1032
Todor = 1168


Input
3
Sofia
London
Washington

Output
1396
1601
3202


Comments
Sofia = 1601
London = 1396
Washington = 3202
                            */