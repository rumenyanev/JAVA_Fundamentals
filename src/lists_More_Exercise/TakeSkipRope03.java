package lists_More_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TakeSkipRope03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        String input = reader.readLine();

        List<Integer> numbers = new ArrayList<>();
        List<String> chars = new ArrayList<>();

        for (char c: input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            } else {
                chars.add(Character.toString(c));
            }
        }

        List<Integer> takeList = IntStream.range(0, numbers.size()).filter(index -> index % 2 == 0).mapToObj(numbers::get).collect(Collectors.toList());
        List<Integer> skipList = IntStream.range(0, numbers.size()).filter(index -> index % 2 != 0).mapToObj(numbers::get).collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        int index = 0;
        int size = chars.size();

        if (size == 0 || takeList.size() == 0 ) return;

        for (int i = 0; i < takeList.size() ; i++) {
            int takeLength = takeList.get(i);
            int skipLength = skipList.get(i);


            index = getCharacters(chars, result, index, takeLength); // take elements and return current index

            index = (index + skipLength < size) ? index + skipLength : 1 + ((index + skipLength) % size); // move index with skipped positions
        }

        System.out.println(String.join("", result));
    }

    private static int getCharacters(List<String> charactersList, List<String> result, int startIndex, int takeLength) {

        for (int i = 0; i < takeLength && startIndex < charactersList.size(); i++) {
            result.add(charactersList.get(startIndex++));
        }

        return startIndex;
    }
}
/*Take/Skip Rope
Write a program, which reads a string and skips through it, extracting a hidden message.
The algorithm you have to implement is as follows:
Let’s take the string “skipTest_String044170” as an example.
Take every digit from the string and store it somewhere. After that, remove all the digits from the string.
After this operation, you should have two lists of items: the numbers list and the non-numbers list:
Numbers list: [0, 4, 4, 1, 7, 0]
Non-numbers: [s, k, i, p, T, e, s, t, _, S, t, r, i, n, g]
After that, take every digit in the numbers list and split it up into a take list and a skip list, depending on whether the digit is in an even or an odd index:
Numbers list: [0, 4, 4, 1, 7, 0]
Take list: [0, 4, 7]
Skip list: [4, 1, 0]
Afterwards, iterate over both of the lists and skip {skipCount} characters from the non-numbers list, then take {takeCount} characters and store it in a result string. Note that the skipped characters are summed up as they go. The process would look like this on the aforementioned non-numbers list:
Example: "skipTest_String"
Take 0 characters  Taken: "", skip 4 characters  Skipped: "skip" Result: ""
Take 4 characters Taken: "Test", skip 1 characters  Skipped: "_"  Result: "Test"
Take 7 characters Taken: "String", skip 0 characters  Skipped: ""  Result: "TestString"
After that, just print the result string on the console.
Input
The encrypted message as a string
Output
The decrypted message as a string
Constraints
The count of digits in the input string will always be even.
The encrypted message will contain any printable ASCII character.
Examples
Input
T2exs15ti23ng1_3cT1h3e0_Roppe

Output
TestingTheRope

Input
O{1ne1T2021wf312o13Th111xreve!!@!

Output
OneTwoThree!!!

Input
this forbidden mess of an age rating 0127504740

Output
hidden message
*/