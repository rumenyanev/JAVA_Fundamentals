package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<String> elements = Arrays.stream(reader.readLine()
                .split("\\s+")).collect(Collectors.toList());

        String input = "";
        while (!"3:1".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {
                case "merge":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    startIndex = validateIndex(startIndex, elements.size());
                    endIndex = validateIndex(endIndex, elements.size());
                    String concatElements =
                            elements.subList(startIndex, endIndex + 1)
                                    .stream().filter(e -> !e.equals("")).collect(Collectors.joining(""));
                    elements.subList(startIndex, endIndex + 1).clear();
                    elements.add(startIndex, concatElements);
                    break;
                case "divide":
                    int index = Integer.parseInt(data[1]);
                    int partitions = Integer.parseInt(data[2]);

                    List<String> result = dividedEqually(elements.get(index), partitions);
                    elements.remove(index);
                    elements.addAll(index, result);
                    break;
            }
        }
        System.out.println(String.join(" ", elements));
    }

    private static List<String> dividedEqually(String element, int partitions) {
        int part = element.length() / partitions;
        ArrayList<String> result = new ArrayList<>();

        while (element.length() >= part) {
            result.add(element.substring(0, part));
            element = element.substring(part);
        }
        if (result.size() == partitions) {
            return result;
        } else {
            String concatLastTwoElements = result.get(result.size() - 2).concat(
                    result.get(result.size() - 1));
            result.subList(result.size() - 2, result.size()).clear();
            result.add(concatLastTwoElements);
            return result;

        }
    }

    private static int validateIndex(int index, int lenght) {
        if (index < 0) {
            index = 0;
        }
        if (index > lenght - 1) {
            index = lenght - 1;
        }
        return index;
    }
}
/*Anonymous Threat
The Anonymous have created a cyber hypervirus which steals data from the CIA.
You, as the lead security developer in CIA, have been tasked to analyze the software of the virus and observe its actions on the data.
 The virus is known for his innovative and unbelievably clever technique of merging and dividing data into partitions.
You will receive a single input line containing STRINGS separated by spaces.
The strings may contain any ASCII character except whitespace.
You will then begin receiving commands in one of the following formats:
merge {startIndex} {endIndex}
divide {index} {partitions}
Every time you receive the merge command, you must merge all elements from the startIndex, till the endIndex.
In other words, you should concatenate them.
Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and merge it.
Every time you receive the divide command, you must DIVIDE the element at the given index, into several small substrings with equal length.
 The count of the substrings should be equal to the given partitions.
Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST with EQUAL LENGTHS, and make the LAST one – the LONGEST.
Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
The input ends when you receive the command “3:1”. At that point you must print the resulting elements, joined by a space.
Input
The first input line will contain the array of data.
On the next several input lines you will receive commands in the format specified above.
The input ends when you receive the command “3:1”.
Output
As output you must print a single line containing the elements of the array, joined by a space.
Constrains
The strings in the array may contain any ASCII character except whitespace.
The startIndex and the endIndex will be in range [-1000, 1000].
The endIndex will ALWAYS be GREATER than the startIndex.
The index in the divide command will ALWAYS be INSIDE the array.
The partitions will be in range [0, 100].
Allowed working time/memory: 100ms / 16MB.
Examples
Input
Ivo Johny Tony Bony Mony
merge 0 3
merge 3 4
merge 0 3
3:1

Output
IvoJohnyTonyBonyMony


Input
abcd efgh ijkl mnop qrst uvwx yz
merge 4 10
divide 4 5
3:1

Output
abcd efgh ijkl mnop qr st uv wx yz
                                          */
