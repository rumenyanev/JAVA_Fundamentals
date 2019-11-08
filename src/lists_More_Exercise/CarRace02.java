package lists_More_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarRace02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[] raceTrace = Arrays.stream(reader.readLine().
                split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();
        double leftCarSum = 0;
        double rightCarSum = 0;
        for (int i = 0; i < raceTrace.length / 2; i++) {
            leftCarSum += raceTrace[i];
            if (raceTrace[i] == 0) {
                leftCarSum *= 0.8;
            }
        }
        for (int i = raceTrace.length - 1; i > raceTrace.length / 2; i--) {
            rightCarSum += raceTrace[i];
            if (raceTrace[i] == 0) {
                rightCarSum *= 0.8;
            }
        }

        if (leftCarSum < rightCarSum) {
            System.out.printf("The winner is left with total time: %.1f", leftCarSum);
        }
        if (leftCarSum > rightCarSum) {
            System.out.printf("The winner is right with total time: %.1f", rightCarSum);
        }
    }
}

/*Car Race
Write a program to calculate the winner of a car race. You will receive an array of numbers. Each element of the array represents the time needed to pass through that step (the index). There are going to be two cars. One of them starts from the left side and the other one starts from the right side. The middle index of the array is the finish line. (The number of elements of the array will always be odd). Calculate the total time for each racer to reach the finish (the middle of the array) and print the winner with his total time. (The racer with less time). If you have a zero in the array, you have to reduce the time of the racer that reached it by 20% (from the time so far).
Print the result in the following format "The winner is {left/right} with total time: {total time}", formatted with one digit after the decimal point.
Example

Input
29 13 9 0 13 0 21 0 14 82 12

Output
The winner is left with total time: 53.8


Comment
The time of the left racer is (29 + 13 + 9) * 0.8 (because of the zero) + 13 = 53.8
The time of the right racer is (82 + 12 + 14) * 0.8 + 21 = 107.4
The winner is the left racer, so we print it
*/