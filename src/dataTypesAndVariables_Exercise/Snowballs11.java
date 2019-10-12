package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Snowballs11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numbersOfSnowball = Integer.parseInt(reader.readLine());
        //List<Integer> snowballs = new ArrayList<>();
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;

        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        double bestSnowballValue = 0;

        while (numbersOfSnowball-- > 0) {

            snowballSnow = Integer.parseInt(reader.readLine());
            snowballTime = Integer.parseInt(reader.readLine());
            snowballQuality = Integer.parseInt(reader.readLine());

            double tempBestSnowballValue =  Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);

            if (tempBestSnowballValue > bestSnowballValue) {
                bestSnowballValue = tempBestSnowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }

            /*int result = snowballSnow / snowballTime;
            bestSnowball = (int) Math.pow(result, snowballQuality);
            snowballs.add(bestSnowball);*/

        }

        //int bestResult = snowballs.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(null);
        //snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, bestSnowballValue, bestSnowballQuality);
    }
}
/*Snowballs
Tony and Andi love playing in the snow and having snowball fights, but they always argue which makes the best snowballs. Тhey have decided to involve you in their fray, by making you write a program which calculates snowball data, and outputs the best snowball value.
You will receive N – an integer, the number of snowballs being made by Tony and Andi.
For each snowball you will receive 3 input lines:
⦁	On the first line you will get the snowballSnow – an integer.
⦁	On the second line you will get the snowballTime – an integer.
⦁	On the third line you will get the snowballQuality – an integer.
For each snowball you must calculate its snowballValue by the following formula:
(snowballSnow / snowballTime) ^ snowballQuality
At the end you must print the highest calculated snowballValue.
Input
⦁	On the first input line you will receive N – the number of snowballs.
⦁	On the next N * 3 input lines you will be receiving data about snowballs.
Output
⦁	As output you must print the highest calculated snowballValue, by the formula, specified above.
⦁	The output format is:
{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
Constraints
⦁	The number of snowballs (N) will be an integer in range [0, 100].
⦁	The snowballSnow is an integer in range [0, 1000].
⦁	The snowballTime is an integer in range [1, 500].
⦁	The snowballQuality is an integer in range [0, 100].
⦁	Allowed working time / memory: 100ms / 16MB.
Examples
Input
2
10
2
3
5
5
5

Output
10 : 2 = 125 (3)

Input
3
10
5
7
16
4
2
20
2
2

Output
10 : 5 = 128 (7)
                     */