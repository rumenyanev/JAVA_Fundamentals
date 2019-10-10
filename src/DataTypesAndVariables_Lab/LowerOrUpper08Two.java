package DataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerOrUpper08Two {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char simbol = reader.readLine().charAt(0);
        if(simbol>=65&& simbol<=90){
            System.out.println("upper-case");
        }else if (simbol>=97 && simbol<=122){
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
