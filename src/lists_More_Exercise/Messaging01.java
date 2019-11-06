package lists_More_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Messaging01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> chars = reader.readLine().chars().mapToObj((i) -> Character.toString((char)i)).collect(Collectors.toList());

        for (int number: numbers) {
            int sum = 0;
            while (number % 10 > 0) {
                sum += number % 10;
                number = number / 10;
            }
            int index = getElementIndex(chars, sum);
            System.out.print(chars.get(index));
            chars.remove(index);
        }
    }

    private static int getElementIndex (List<String> stringList, int index) {
        return index >= stringList.size() ? index % stringList.size() : index;
    }
}




/*Messaging
You will be given some list of numbers and a string.
For each element of the list you have to take the sum of its digits and take the element corresponding
to that index from the text. If the index is greater than the length of the text, start counting from the beginning (so that you always have a valid index).
After getting the element from the text, you have to remove the character you have taken from it (so for the next index, the text will be with one character less).
Example
Input
9992 562 8933
This is some message for you

Output
hey




                  */