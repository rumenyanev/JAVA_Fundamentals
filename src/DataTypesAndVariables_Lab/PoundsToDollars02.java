package DataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoundsToDollars02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        double brPound = Double.parseDouble(reader.readLine());

        double usDollar = brPound * 1.31;

        System.out.printf("%.3f",usDollar);

    }
}
/*⦁	Pounds to Dollars
Write a program that converts British pounds to US dollars formatted to 3th decimal point.
1 British Pound = 1.31 Dollars
Examples
Input
80

Output
104.800

Input
39

Output
51.090
*/