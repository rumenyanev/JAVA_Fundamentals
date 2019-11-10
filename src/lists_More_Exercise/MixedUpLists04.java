package lists_More_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MixedUpLists04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<Integer> firstList = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int minLenght = Math.min(firstList.size(), secondList.size());

        List<Integer> thirdList = new ArrayList<>(minLenght * 2);

        if (Math.abs(firstList.size() - secondList.size()) != 2) {
            return;
        }
        for (int i = 0; i < minLenght; i++) {
            thirdList.add(firstList.get(i));
            thirdList.add(secondList.get(secondList.size() - 1 - i));
        }
        int startIndex;
        int finalIndex;
        if (firstList.size() > secondList.size()) {
            startIndex = firstList.get(minLenght);
            finalIndex = firstList.get(minLenght + 1);
        } else {
            startIndex = secondList.get(secondList.size() - (minLenght + 1));
            finalIndex = secondList.get(secondList.size() - (minLenght + 2));
        }

        int minValue = Math.min(startIndex, finalIndex);
        int maxValue = Math.max(startIndex, finalIndex);

        thirdList = thirdList.stream().filter(e -> (e > minValue && e < maxValue)).collect(Collectors.toList());
        Collections.sort(thirdList);

        System.out.println(thirdList.toString().replaceAll("[\\[\\],]", ""));
    }
}
/*Mixed up Lists
Write a program that mixes up two lists by some rules.
You will receive two lines of input, each one being a list of numbers. The rules for mixing are:
Start from the beginning of the first list and from the ending of the second
Add element from the first and element from the second
At the end there will always be a list in which there are 2 elements remaining
These elements will be the range of the elements you need to print
Loop through the result list and take only the elements that fulfill the condition
Print the elements ordered in ascending order and separated by a space
Example
Input
1 5 23 64 2 3 34 54 12
43 23 12 31 54 51 92

Output
23 23 31 34 43 51

Comment
After looping through the two of the arrays we get: 1 92 5 51 23 54 64 31 2 12 3 23 34 43
The constrains are 54 and 12 (so we take only the numbers between them): 51 23 31 23 34 43
We print the result sorted
*/