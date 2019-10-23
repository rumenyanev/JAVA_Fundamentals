package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        //ListMetods<Integer> numbers = fillIntegerList(reader);
        List<Integer> numbers = fillIntegerList(reader);
        String input = reader.readLine();
        while (!"End".equals(input)) {
            String[] line = input.split("\\s+");
            String command = line[0];

            if (command.equals("Shift")) {
                command = line[0] + " " + line[1];
            }
            int value = 0;
            int index = 0;
            switch (command) {
                case "Add":
                    value = Integer.parseInt(line[1]);
                    addElemment(value, numbers);
                    break;
                case "Insert":
                    value = Integer.parseInt(line[1]);
                    index = Integer.parseInt(line[2]);
                    insertElement(value, index, numbers);
                    break;
                case "Remove":
                    index = Integer.parseInt(line[1]);
                    removeElement(index, numbers);
                    break;
                case "Shift left":
                    int count = Integer.parseInt(line[2]);
                    shiftLeftElement(count, numbers);
                    break;
                case "Shift right":
                    value = Integer.parseInt(line[2]);
                    shiftRightElement(value, numbers);
                    break;
            }
            input = reader.readLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[,\\]]", ""));



    }

    private static void shiftRightElement(int count, List<Integer> numbers) {
        if (numbers.size() > 0) {
            for (int i = 0; i < count % numbers.size(); i++) {
                numbers.add(0, numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
            }
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void shiftLeftElement(int count, List<Integer> numbers) {
        if (numbers.size() > 0) {
            for (int i = 0; i < count % numbers.size(); i++) {
                numbers.add(numbers.get(0));
                numbers.remove(0);
            }
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void removeElement(int index, List<Integer> numbers) {
        if (index < 0 || index > numbers.size() - 1) {
            System.out.println("Invalid index");
        } else {
            numbers.remove(index);
        }
    }

    private static void insertElement(int value, int index, List<Integer> numbers) {
        if (index >= 0 && index <= numbers.size() - 1) {
            numbers.add(index, value);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void addElemment(int value, List<Integer> numbers) {
        numbers.add(value);
    }

    private static List<Integer> fillIntegerList(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }




}
/*List Operations
You will be given a list of integer numbers on the first input line.
 Until you receive "End" you will be given operations you have to apply on the list.
 The possible commands are:

Add {number} – add number at the end
Insert {number} {index}” – insert number at given index
Remove {index} – remove at index
Shift left {count} – first number becomes last ‘count’ times
Shift right {count} – last number becomes first ‘count’ times
Note: it is possible that the index given is outside of the bounds of the array. In that case print "Invalid index"
Examples
Input
1 23 29 18 43 21 20
Add 5
Remove 5
Shift left 3
Shift left 1
End

Output
43 20 5 1 23 29 18


Input
5 12 42 95 32 1
Insert  3 0
Remove 10
Insert 8 6
Shift right 1
Shift left 2
End

Output
Invalid index
5 12 42 95 32 8 1 3
*/