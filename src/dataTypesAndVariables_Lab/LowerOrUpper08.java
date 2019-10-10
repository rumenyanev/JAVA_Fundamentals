package dataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerOrUpper08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String symbol = reader.readLine();


        String upperCase = "[A-Z]{1}";
        String lowerCase = "[a-z]{1}";
        Pattern patternUpper = Pattern.compile(upperCase);
        Pattern patternLower = Pattern.compile(lowerCase);

        Matcher matcherUpper = patternUpper.matcher(symbol);
        Matcher matcherLower = patternLower.matcher(symbol);

        if (matcherUpper.find()){
            System.out.println("upper-case");
        }else if (matcherLower.find()){
            System.out.println("lower-case");
        }


    }
}
/*⦁	Lower or Upper
Write a program that prints whether a given character is upper-case or lower case.
Examples
Input
L
Output
upper-case

Input
f

Output
lower-case
                  */
