package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeerKegs08Two {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        double biggestKeg = 0.0;
        String biggestKegOutput = "";

        for (int i = 0; i <n ; i++) {
            String model = reader.readLine();
            double radius = Double.parseDouble(reader.readLine());
            int height = Integer.parseInt(reader.readLine());

            double volume = Math.PI * (Math.pow(radius,2))* height;

            if (volume > biggestKeg){
                biggestKeg = volume;
                biggestKegOutput = model;
            }
        }
        System.out.println(biggestKegOutput);
    }
}
/*8. Beer Kegs
Write a program, which calculates the volume of n beer kegs. You will receive in total 3 * n lines. Each three lines
will hold information for a single keg. First up is the model of the keg, after that is the radius of the keg, and lastly is
the height of the keg.
Calculate the volume using the following formula: π * r^2 * h.
At the end, print the model of the biggest keg.
Input
You will receive 3 * n lines. Each group of lines will be on a new line:
 First – model – string.
 Second –radius – floating-point number
 Third – height – integer number
Output
Print the model of the biggest keg.
Constraints
 n will be in the interval [1…10]
 The radius will be a floating-point number in the interval [1…3.402823E+38]
 The height will be an integer in the interval [1…2147483647]
Examples
Input         Output                Input            Output
3             Keg 2                  2                Bigger Keg
Keg 1                              Smaller Keg
10                                   2.41
10                                   10
Keg 2                               Bigger Keg
20                                    5.12
20                                     20
Keg 3
10
30




*/
