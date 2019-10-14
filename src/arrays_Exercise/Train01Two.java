package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Train01Two {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int wagons = Integer.parseInt(reader.readLine());
            int[] people = new int[wagons];


            for (int i = 0; i < wagons; i++) {
                people[i] = Integer.parseInt(reader.readLine());
            }
            for (int person : people) {
                System.out.print(person + " ");
            }
            System.out.println();
            System.out.println(Arrays.stream(people).sum());
        }
    }

/* /*Train
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