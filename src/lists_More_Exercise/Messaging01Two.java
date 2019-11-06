package lists_More_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Messaging01Two {

            public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(System.in));

            List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<Integer> index = new ArrayList<>();
            int searchedIndex = 0;
                for (int element : numbers) {
                    while (element > 0) {
                        int digit = element % 10;
                        searchedIndex += digit;
                        element /= 10;
                    }
                    index.add(searchedIndex);
                    searchedIndex = 0;
                }
            StringBuilder result = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            String text = reader.readLine();
                for (int position : index) {
                    if (position > text.length()) {
                        position = position - text.length();

                    }
                    char letter = text.charAt(position);
                    result.append(letter);

                    for (int j = 0; j < text.length(); j++) {
                        if (j != position) {
                            temp.append(text.charAt(j));
                        }
                    }
                    text = temp.toString();
                    temp.delete(0, temp.length());
                }
            System.out.println(result.toString());

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