package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<String> elements = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            String command = data[0];

            if ("Delete".equals(command)) {
                elements = elements.stream().filter(e -> !e.equals(data[1]))
                        .collect(Collectors.toList());
            } else if ("Insert".equals(command)) {
                String element = data[1];
                int position = Integer.parseInt(data[2]);
                if (position >= 0 && position < elements.size()) {
                    elements.add(position, element);

                }
            }
        }

        System.out.println(elements.toString().replaceAll("[\\[,\\]]", ""));
    }

}
/*Change List
Write a program, which reads a list of integers from the console and receives commands, which manipulate the list.
 Your program may receive the following commands:
Delete {element} – delete all elements in the array, which are equal to the given element
Insert {element} {position} – insert element and the given position
You should stop the program when you receive the command "end".
Print all numbers in the array separated with single whitespace.
Examples
Input
1 2 3 4 5 5 5 6
Delete 5
Insert 10 1
Delete 5
end

Output
1 10 2 3 4 6

Input
20 12 4 319 21 31234 2 41 23 4
Insert 50 2
Insert 50 5
Delete 4
end

Output
20 12 50 319 50 21 31234 2 41 23

*/