package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterOverflow07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int rowsToRead = Integer.parseInt(reader.readLine());

        int capacityTank = 255;
        int currentCapacity = 0;
        int liters = 0;
        for (int i = 0; i < rowsToRead; i++) {

            liters = Integer.parseInt(reader.readLine());

            if (currentCapacity + liters > capacityTank) {
                System.out.println("Insufficient capacity!");
            } else {
                currentCapacity += liters;
            }

        }
        System.out.println(currentCapacity);
    }
}
/*⦁	Water Overflow
You have a water tank with capacity of 255 liters.
On the next n lines, you will receive liters of water, which you have to pour in your tank.
If the capacity is not enough, print “Insufficient capacity!” and continue reading the next line.
On the last line, print the liters in the tank.
Input
The input will be on two lines:
⦁	On the first line, you will receive n – the number of lines, which will follow
⦁	On the next n lines – you receive quantities of water, which you have to pour in the tank
Output
Every time you do not have enough capacity in the tank to pour the given liters, print:
Insufficient capacity!
On the last line, print only the liters in the tank.
Constraints
⦁	n will be in the interval [1…20]
⦁	liters will be in the interval [1…1000]
Examples

Input
5
20
100
100
100
20

Output
Insufficient capacity!
240

Input
1
1000

Output
Insufficient capacity!
0

Input
7
10
20
30
10
5
10
20

Output
105

Input
4
250
10
20
40

Output
Insufficient capacity!
Insufficient capacity!
Insufficient capacity!
250
                                   */