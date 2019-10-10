package dataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConvertMetersToKilometers01 {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader
               (new InputStreamReader(System.in));
       double distanceInMeters = Double.parseDouble(reader.readLine());

       double distanceInKilometers = distanceInMeters / 1000;

        System.out.printf("%.2f",distanceInKilometers);

    }

}
/*⦁	Convert Meters to Kilometers
You will be given an integer that will be distance in meters. Write a program that converts meters to kilometers formatted to the second decimal point.
Examples
Input
1852

Output
1.85

Input
798

Output
0.80
*/