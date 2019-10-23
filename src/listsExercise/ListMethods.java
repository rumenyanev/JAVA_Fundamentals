package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListMethods extends ArrayList {

    private void shiftRightElement(int count, List<Integer> numbers) {
        if (numbers.size() > 0) {
            for (int i = 0; i < count % numbers.size(); i++) {
                numbers.add(0, numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
            }
        } else {
            System.out.println("Invalid index");
        }
    }

     void shiftLeftElement(int count, List<Integer> numbers) {
        if (numbers.size() > 0) {
            for (int i = 0; i < count % numbers.size(); i++) {
                numbers.add(numbers.get(0));
                numbers.remove(0);
            }
        } else {
            System.out.println("Invalid index");
        }
    }

     void removeElement(int index, List<Integer> numbers) {
        if (index < 0 || index > numbers.size() - 1) {
            System.out.println("Invalid index");
        } else {
            numbers.remove(index);
        }
    }

     void insertElement(int value, int index, List<Integer> numbers) {
        if (index >= 0 && index <= numbers.size() - 1) {
            numbers.add(index, value);
        } else {
            System.out.println("Invalid index");
        }
    }

     void addElemment(int value, List<Integer> numbers) {
        numbers.add(value);
    }

     List<Integer> fillIntegerList(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }
}
