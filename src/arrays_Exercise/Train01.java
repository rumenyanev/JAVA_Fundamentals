package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Train01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int countOfVagons =Integer.parseInt(reader.readLine());
        int[]train = new int[countOfVagons];

        int sumTravellers = 0;
            for (int i = 0; i < countOfVagons; i++) {
                int travelers = Integer.parseInt(reader.readLine());
                train[i]= travelers;
                sumTravellers += train[i];

                System.out.printf("%d ",train[i]);

            }
        System.out.println();
        System.out.println(sumTravellers);
        }

    }

/*Train
You will be given a count of wagons in a train n.
On the next n lines you will receive how many people are going to get on that wagon.
 At the end print the whole train and after that the sum of the people in the train.
Examples
Input
3
13
24
8

Output
13 24 8
45

Input
6
3
52
71
13
65
4

Output
3 52 71 13 65 4
208

Input
1
100

Output
100
100
*/