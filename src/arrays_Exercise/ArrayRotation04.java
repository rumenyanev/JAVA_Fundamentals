package arrays_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[] arrayToRotation = reader.readLine().split("\\s+");
        int numOfRotation = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numOfRotation % arrayToRotation.length; i++) {
            String temp = arrayToRotation[0];
            for (int j = 0; j <arrayToRotation.length - 1 ; j++) {
                arrayToRotation[j] = arrayToRotation[j + 1];
            }
            arrayToRotation[arrayToRotation.length-1] = temp;
        }
        System.out.println(String.join(" ",arrayToRotation));
    }
}
/*Array Rotation
Write a program that receives an array and number of rotations
you have to perform (first element goes at the end) Print the resulting array.
Examples
Input
51 47 32 61 21
2

Output
32 61 21 51 47

Input
32 21 61 1
4

Output
32 21 61 1


Input
2 4 15 31
5

Output
4 15 31 2

*/