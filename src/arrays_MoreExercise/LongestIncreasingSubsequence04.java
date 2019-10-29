package arrays_MoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LongestIncreasingSubsequence04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().
                split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();


        int[] series = new int[numbers.length];
        String[] sequences  = new String[numbers.length];
        for (int i = 0; i < series.length ; i++) {
            series[i] = 1;
            sequences [i] = "" + numbers[i];
            for (int j = 0; j < i ; j++) {
                if (numbers[i] > numbers[j]) {
                    if (series[j] + 1 > series[i]) {
                        series[i] = series[j] + 1;
                        sequences[i] = sequences[j] + " " + numbers[i];
                    }
                }
            }
        }
        int maxIndex = -1;
        int maxSeries = -1;
        for (int i = 0; i < sequences.length ; i++) {
            if (series[i] > maxSeries) {
                maxSeries = series[i];
                maxIndex = i;
            }
        }
        System.out.println(sequences[maxIndex]);
    }
}
/*Longest Increasing Subsequence (LIS)
Read a list of integers and find the longest increasing subsequence (LIS).
If several such exist, print the leftmost.
Examples
Input
1

Output
1

Input
7 3 5 8 -1 0 6 7

Output
3 5 6 7


Input
1 2 5 3 5 2 4 1

Output
1 2 3 5

Input
0 10 20 30 30 40 1 50 2 3 4 5 6

Output
0 1 2 3 4 5 6

Input
11 12 13 3 14 4 15 5 6 7 8 7 16 9 8

Output
3 4 5 6 7 8 16

Input
3 14 5 12 15 7 8 9 11 10 1

Output
3 5 7 8 9 11

Hints
⦁	Assume we have n numbers in an array nums[0…n-1].
⦁	Let len[p] holds the length of the longest increasing subsequence (LIS) ending at position p.
⦁	In a for loop, we shall calculate len[p] for p = 0 … n-1 as follows:
⦁	Let left is the leftmost position on the left of p (left < p), such that len[left] is the largest possible.
⦁	Then, len[p] = 1 + len[left]. If left does not exist, len[p] = 1.
⦁	Also, save prev[p] = left (we hold if prev[] the previous position, used to obtain the best length for position p).
⦁	Once the values for len[0…n-1] are calculated, restore the LIS starting from position p such that len[p] is maximal and go back and back through p = prev[p].
⦁	The table below illustrates these computations:
index	0	1	2	3	4	5	6	7	8	9	10
nums[]	3	14	5	12	15	7	8	9	11	10	1
len[]	1	2	2	3	4	3	4	5	6	6	1
prev[]	-1	0	0	2	3	2	5	6	7	7	-1
LIS	{3}	{3,14}	{3,5}	{3,5,12}	{3,5,12,15}	{3,5,7}	{3,5,7,8}	{3,5,7,8,9}	{3,5,7,8,9,11}	{3,5,7,8,9,10}	{1}*/