package dataTypesAndVariables_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TownInfo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        String nameOfTown = reader.readLine();
        int population = Integer.parseInt(reader.readLine());
        int areaOfTown = Integer.parseInt(reader.readLine());


        System.out.printf("Town %s has population of %d and area %d square km.",nameOfTown,population,areaOfTown);
    }
}
/*⦁	Town Info
You will be given 3 lines of input. On the first line you will be given the name of the town, on the second – the population and on the third the area. Use the correct data types and print the result in the following format:
"Town {town name} has population of {population} and area {area} square km".
Examples

Input
Sofia
1286383
492

Output
Town Sofia has population of 1286383 and area 492 square km.
*/